$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signIndata.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 3,
  "name": "Sign in with multiple sets of data",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "validating the sign in with valid credentials",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters \"\u003cemail\u003e\" to the signin module",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003cpassword\u003e\" in the signin module",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in based on \"\u003cexpectedResult\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "expectedResult"
      ],
      "line": 17,
      "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;1"
    },
    {
      "cells": [
        "test@something.com",
        "dasfdas",
        "Login - My Store"
      ],
      "line": 18,
      "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;2"
    },
    {
      "cells": [
        "mike@something.com",
        "ddsafdas++",
        "Login - My Store"
      ],
      "line": 19,
      "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;3"
    },
    {
      "cells": [
        "jim@agile.com",
        "ddsafdfa+",
        "Login - My Store"
      ],
      "line": 20,
      "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;4"
    },
    {
      "cells": [
        "mike123@something.com",
        "ddsafdas++",
        "My page"
      ],
      "line": 21,
      "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "validating the sign in with valid credentials",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters \"test@something.com\" to the signin module",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"dasfdas\" in the signin module",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in based on \"Login - My Store\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_is_in_the_homepage()"
});
formatter.result({
  "duration": 6839011000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_sign_in_link()"
});
formatter.result({
  "duration": 748871500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@something.com",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_to_the_signin_module(String)"
});
formatter.result({
  "duration": 2082515400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dasfdas",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_signin_module(String)"
});
formatter.result({
  "duration": 3075120100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 14300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login - My Store",
      "offset": 35
    }
  ],
  "location": "stepDef.user_should_be_logged_in_based_on(String)"
});
formatter.result({
  "duration": 10258200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 1284796900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "validating the sign in with valid credentials",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters \"mike@something.com\" to the signin module",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"ddsafdas++\" in the signin module",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in based on \"Login - My Store\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_is_in_the_homepage()"
});
formatter.result({
  "duration": 6078826500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_sign_in_link()"
});
formatter.result({
  "duration": 1062976400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mike@something.com",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_to_the_signin_module(String)"
});
formatter.result({
  "duration": 2120121000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ddsafdas++",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_signin_module(String)"
});
formatter.result({
  "duration": 3106907000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 37400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login - My Store",
      "offset": 35
    }
  ],
  "location": "stepDef.user_should_be_logged_in_based_on(String)"
});
formatter.result({
  "duration": 11301300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 714277600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "validating the sign in with valid credentials",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters \"jim@agile.com\" to the signin module",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"ddsafdfa+\" in the signin module",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in based on \"Login - My Store\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_is_in_the_homepage()"
});
formatter.result({
  "duration": 6591617100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_sign_in_link()"
});
formatter.result({
  "duration": 777788600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jim@agile.com",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_to_the_signin_module(String)"
});
formatter.result({
  "duration": 2067691100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ddsafdfa+",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_signin_module(String)"
});
formatter.result({
  "duration": 3103213400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 23500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login - My Store",
      "offset": 35
    }
  ],
  "location": "stepDef.user_should_be_logged_in_based_on(String)"
});
formatter.result({
  "duration": 7075500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 766134500,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "validating the sign in with valid credentials",
  "description": "",
  "id": "sign-in-with-multiple-sets-of-data;validating-the-sign-in-with-valid-credentials;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters \"mike123@something.com\" to the signin module",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"ddsafdas++\" in the signin module",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in based on \"My page\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_is_in_the_homepage()"
});
formatter.result({
  "duration": 6140934000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_sign_in_link()"
});
formatter.result({
  "duration": 755497800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mike123@something.com",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_to_the_signin_module(String)"
});
formatter.result({
  "duration": 2165119500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ddsafdas++",
      "offset": 13
    }
  ],
  "location": "stepDef.user_enters_in_the_signin_module(String)"
});
formatter.result({
  "duration": 3125400100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 11900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My page",
      "offset": 35
    }
  ],
  "location": "stepDef.user_should_be_logged_in_based_on(String)"
});
formatter.result({
  "duration": 11640500,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[My pag]e\u003e but was:\u003c[Login - My Stor]e\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDef.stepDef.user_should_be_logged_in_based_on(stepDef.java:150)\r\n\tat ✽.Then user should be logged in based on \"My page\"(signIndata.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});