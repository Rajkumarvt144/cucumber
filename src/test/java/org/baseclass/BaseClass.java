package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.close();
	}
	public static String title() {
		String title = driver.getTitle();
		return title;
	}

	public static String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Raj Kumar\\eclipse-workspace\\Framework8am\\screenshot\\" + fileName + ".png");
		FileUtils.copyFile(src, dest);

	}

	public static void passvalue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	static Actions a;

	public static void mouseHover(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

	static Alert al;

	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();
	}

	private void dismissAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	static JavascriptExecutor js;

	public static void passValueJS(WebElement element, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + value + "')", element);
	}

	public static void elementClickJS(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void switchFrame(int index) {
		driver.switchTo().frame(index);
	}

	// excel read
	public static String excelRead(String sheetName, int row, int cell) throws IOException {
		// 1.Mention excel file path
		File f = new File("C:\\Users\\Raj Kumar\\eclipse-workspace\\TestFramewWork\\excel\\TestData.xlsx");

		// read the file
		FileInputStream fis = new FileInputStream(f);

		// read .xlsx (workbook)excel file
		Workbook w = new XSSFWorkbook(fis);

		// workbook-->sheet-->row-->cell-->data

		// get sheet from workbook
		Sheet s = w.getSheet(sheetName);

		// get row from sheet
		Row r = s.getRow(row);

		// get cell from row
		Cell c = r.getCell(cell);

		// get cell type
		int cellType = c.getCellType();
		// cellType=1-->String cell
		// cellType=0-->numeric cell / date cell

		String value;
		// String cell value
		if (cellType == 1) {
			value = c.getStringCellValue();
		}
		// date cell value
		// check whether cell is dateCell or not
		// if true enter inside block, if false won't allow inside block
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			// convert date from system format -->user format
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
			value = sdf.format(d);
		}
		// numeric cell value
		else {
			double a = c.getNumericCellValue();
			// double----->long------->string
			// 1234567.0-->1234567---->1234567
			long l = (long) a; // double(parent)--->long(child) Downcasting
			value = String.valueOf(l);// long-->String
		}
		return value;
	}

	// excel write
	public static void excelWrite(String sheetName, int row, int cell, String value) throws IOException {
		// methion the file location
		File f = new File("C:\\Users\\Raj Kumar\\eclipse-workspace\\TestFramewWork\\excel\\data.xlsx");

		// create a workbook
		Workbook w = new XSSFWorkbook();

		// workbook--->sheet--->row--->cell--->data

		// create a sheet
		Sheet s = w.createSheet(sheetName);

		// create a row
		Row r = s.createRow(row);

		// create a cell
		Cell c = r.createCell(cell);

		// pass value in cell
		c.setCellValue(value);

		// write a file
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("write....");

	}

	// create cell
	public static void createCell(String sheetName, int row, int cell, String value) throws IOException {
		// methion the file location
		File f = new File("C:\\Users\\Raj Kumar\\eclipse-workspace\\TestFramewWork\\excel\\data.xlsx");

		// read a file
		FileInputStream fis = new FileInputStream(f);

		// workbook
		Workbook w = new XSSFWorkbook(fis);

		// existing workbook--->existing sheet--->existing row--->new cell--->data

		// get sheet
		Sheet s = w.getSheet(sheetName);

		// get row
		Row r = s.getRow(row);

		// create a cell
		Cell c = r.createCell(cell);

		// pass value in cell
		c.setCellValue(value);

		// write a file
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("write....");

	}

	// create row
	public static void createRow(String sheetName, int row, int cell, String value) throws IOException {
		// methion the file location
		File f = new File("C:\\Users\\Raj Kumar\\eclipse-workspace\\TestFramewWork\\excel\\data.xlsx");

		// read a file
		FileInputStream fis = new FileInputStream(f);

		// workbook
		Workbook w = new XSSFWorkbook(fis);

		// existing workbook--->existing sheet--->new row--->new cell--->data

		// get sheet
		Sheet s = w.getSheet(sheetName);

		// create a row
		Row r = s.createRow(row);

		// create a cell
		Cell c = r.createCell(cell);

		// pass value in cell
		c.setCellValue(value);

		// write a file
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("write....");

	}

	// update cell value
	public static void updateCell(String sheetName, int row, int cell, String newValue,String oldValue) throws IOException {
		// methion the file location
		File f = new File("C:\\Users\\Raj Kumar\\eclipse-workspace\\TestFramewWork\\excel\\data.xlsx");

		// read a file
		FileInputStream fis = new FileInputStream(f);

		// workbook
		Workbook w = new XSSFWorkbook(fis);

		// existing workbook--->existing sheet--->existing row--->existing cell--->data

		// get sheet
		Sheet s = w.getSheet(sheetName);

		// get row
		Row r = s.getRow(row);

		// get a cell
		Cell c = r.getCell(cell);
		
		//get value from cell
		String exitsingValue = c.getStringCellValue();
		
		if (exitsingValue.equals(oldValue)) {
			// pass value in cell
			c.setCellValue(newValue);
		}

		// write a file
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("write....");

	}

}
