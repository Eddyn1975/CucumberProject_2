$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/Whitebackground.feature");
formatter.feature({
  "line": 1,
  "name": "White Background Change",
  "description": "",
  "id": "white-background-change",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6138800400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I want to display the background color  so that it can change to white",
  "description": "",
  "id": "white-background-change;as-a-user-i-want-to-display-the-background-color--so-that-it-can-change-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "\"Set SkyWhite Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 1
    }
  ],
  "location": "WhitebackgroundSteps.button_exists(String)"
});
formatter.result({
  "duration": 259600918,
  "status": "passed"
});
formatter.match({
  "location": "WhitebackgroundSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 129225835,
  "status": "passed"
});
formatter.match({
  "location": "WhitebackgroundSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 88642896,
  "status": "passed"
});
});