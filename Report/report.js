$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/ICICI.feature");
formatter.feature({
  "name": "To login into the ICICI bank application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature"
    }
  ]
});
formatter.scenario({
  "name": "To login into the ICICI bank application with multiple given inputs",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature"
    },
    {
      "name": "@ICICIBank"
    }
  ]
});
formatter.step({
  "name": "Launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "ICICILogin.launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch the ICICI url in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "ICICILogin.launch_the_ICICI_url_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "ICICILogin.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the userid in userid box",
  "rows": [
    {
      "cells": [
        "userid1",
        "1234567"
      ]
    },
    {
      "cells": [
        "userid2",
        "1321651"
      ]
    },
    {
      "cells": [
        "userid3",
        "1213112"
      ]
    },
    {
      "cells": [
        "userid4",
        "1132213"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ICICILogin.to_pass_the_userid_in_userid_box(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: MicrosoftEdge\u003d122.0.2365.66)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WINDOWS-AB6OTE3\u0027, ip: \u0027192.168.0.107\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.9\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCapabilities {acceptInsecureCerts: false, browserName: MicrosoftEdge, browserVersion: 122.0.2365.66, fedcm:accounts: true, javascriptEnabled: true, ms:edgeOptions: {debuggerAddress: localhost:57870}, msedge: {msedgedriverVersion: 122.0.2365.66 (ab363614b8f0..., userDataDir: C:\\Users\\Home\\AppData\\Local...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 814f1a9e5f7d364f16ba6176d712aa15\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy16.sendKeys(Unknown Source)\r\n\tat org.sam.BaseClass.passText(BaseClass.java:84)\r\n\tat org.stepdefinition.ICICILogin.to_pass_the_userid_in_userid_box(ICICILogin.java:43)\r\n\tat ✽.To pass the userid in userid box(src/test/resources/ICICI.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the password in password box",
  "rows": [
    {
      "cells": [
        "abcd@123",
        "abcd213",
        "selenium"
      ]
    },
    {
      "cells": [
        "softwaretesting",
        "inmakesInfo",
        "testNG123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ICICILogin.to_pass_the_password_in_password_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ICICILogin.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});