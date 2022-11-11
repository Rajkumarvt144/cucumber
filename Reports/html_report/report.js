$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile/ForgottenFeature.feature");
formatter.feature({
  "name": "To validate forgotten password functionality of Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Forgot"
    }
  ]
});
formatter.scenario({
  "name": "To validate forgotten password functionality with Invalid email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Forgot"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to click forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_click_forgotten_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Forgotten password\u0027]\"}\n  (Session info: chrome\u003d107.0.5304.107)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-C6IT4HL\u0027, ip: \u0027192.168.0.132\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.17\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\RAJKUM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60959}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 883bfc0df91c5ec6327910ee0cd67331\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Forgotten password\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat org.baseclass.BaseClass.elementClick(BaseClass.java:72)\r\n\tat org.setpdefinition.Stepdefinition.user_have_to_click_forgotten_password(Stepdefinition.java:24)\r\n\tat ✽.user have to click forgotten password(file:src/test/resources/featurefile/ForgottenFeature.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user have to enter invalid email",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_enter_invalid_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.embedding("image/png", "embedded1.png", "To validate forgotten password functionality with Invalid email");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featurefile/loginfeature.feature");
formatter.feature({
  "name": "To validate login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "To validate login functionality with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "greens@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "47859646"
      ]
    },
    {
      "cells": [
        "username1",
        "java selenium"
      ]
    },
    {
      "cells": [
        "password1",
        "12345678"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_enter_invalid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to reach invalid login page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_reach_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter valid username and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "userId",
        "pass"
      ]
    },
    {
      "cells": [
        "greenstech",
        "14785236",
        "selenium",
        "java"
      ]
    },
    {
      "cells": [
        "datadriven",
        "Testng",
        "cucumber",
        "testing"
      ]
    },
    {
      "cells": [
        "javaselenium",
        "174616",
        "greens@gmail.com",
        "74512"
      ]
    },
    {
      "cells": [
        "cucumber",
        "selenium",
        "14778",
        "2626323"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_enter_valid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to reach invalid login page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_have_to_reach_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});