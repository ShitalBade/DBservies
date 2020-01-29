$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/udemy_class/Cucumber_Project/Cucumber_POM/src/main/java/com/qa/feature/Login.feature");
formatter.feature({
  "line": 2,
  "name": "FreeCRM Application",
  "description": "",
  "id": "freecrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate FreeCRM Page",
  "description": "",
  "id": "freecrm-application;validate-freecrm-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User on browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter uname and pwd",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "home page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 11986440183,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_on_browser()"
});
formatter.result({
  "duration": 83087293,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enter_uname_and_pwd()"
});
formatter.result({
  "duration": 3544985498,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 1385632575,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate HomePage",
  "description": "",
  "id": "freecrm-application;validate-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user on loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Login  user",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user on  homepage",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "validate current user",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on contacts",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactPageSteps.user_on_loginpage()"
});
formatter.result({
  "duration": 14706342983,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.login_user()"
});
formatter.result({
  "duration": 3564784782,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.user_on_homepage()"
});
formatter.result({
  "duration": 2564201654,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.validate_current_user()"
});
formatter.result({
  "duration": 65669970,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.click_on_contacts()"
});
formatter.result({
  "duration": 302025133,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Contact Page Form",
  "description": "",
  "id": "freecrm-application;contact-page-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Get homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter user details",
  "rows": [
    {
      "cells": [
        "fname",
        "Mname",
        "Lname",
        "CompanyName",
        "id",
        "Position",
        "Department",
        "Category",
        "Status"
      ],
      "line": 24
    },
    {
      "cells": [
        "shital",
        "Ravi",
        "Bade",
        "Infy",
        "abc @gmail.com",
        "HR",
        "DRR",
        "High",
        "Pass"
      ],
      "line": 25
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Clic on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactFormPageSteps.user_is_on_homepage()"
});
formatter.result({
  "duration": 10405745347,
  "status": "passed"
});
formatter.match({
  "location": "ContactFormPageSteps.get_homepage_title()"
});
formatter.result({
  "duration": 3509557929,
  "status": "passed"
});
formatter.match({
  "location": "ContactFormPageSteps.enter_user_details(DataTable)"
});
formatter.result({
  "duration": 13134052648,
  "status": "passed"
});
formatter.match({
  "location": "ContactFormPageSteps.user_Clic_on_save_button()"
});
formatter.result({
  "duration": 634026758,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Company Page Form",
  "description": "",
  "id": "freecrm-application;company-page-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User get Search Methods",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User find Company details",
  "rows": [
    {
      "cells": [
        "name",
        "address",
        "ZipCode",
        "state",
        "city"
      ],
      "line": 33
    },
    {
      "cells": [
        "Shital",
        "Bavdhan",
        "411013",
        "Maharashtra",
        "Pune"
      ],
      "line": 34
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User Find remaing company details",
  "rows": [
    {
      "cells": [
        "Description",
        "Industry",
        "EmployeeID",
        "AnnualRvenue",
        "VatNumber"
      ],
      "line": 37
    },
    {
      "cells": [
        "This is IT comapny",
        "Software",
        "123457",
        "23455697868",
        "678909875"
      ],
      "line": 38
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "ClicK on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "CompanyFormPageSteps.user_is_on_HomePage()"
});
formatter.result({
  "duration": 13628710966,
  "status": "passed"
});
formatter.match({
  "location": "CompanyFormPageSteps.user_get_Search_Methods()"
});
formatter.result({
  "duration": 32655,
  "status": "passed"
});
formatter.match({
  "location": "CompanyFormPageSteps.user_find_Company_details(DataTable)"
});
formatter.result({
  "duration": 17381513827,
  "status": "passed"
});
formatter.match({
  "location": "CompanyFormPageSteps.user_Find_remaing_company_details(DataTable)"
});
formatter.result({
  "duration": 2666728090,
  "status": "passed"
});
formatter.match({
  "location": "CompanyFormPageSteps.click_on_save_button()"
});
formatter.result({
  "duration": 616691073,
  "status": "passed"
});
});