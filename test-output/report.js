$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlightsBooking.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Contacts #StepDefinition",
  "description": "",
  "id": "freecrm-contacts-#stepdefinition",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17003446754,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I want to be able book hotels, flights or tours",
  "description": "",
  "id": "freecrm-contacts-#stepdefinition;i-want-to-be-able-book-hotels,-flights-or-tours",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user logged into phptravels application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on flights link and provide booking information",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on search button and book now button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user completes the booking",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify if the user is navigated to booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightsBooking.user_logged_into_phptravels_application()"
});
formatter.result({
  "duration": 956713869,
  "status": "passed"
});
formatter.match({
  "location": "FlightsBooking.user_clicks_on_flights_link_and_provide_booking_information()"
});
formatter.result({
  "duration": 44681833253,
  "status": "passed"
});
formatter.match({
  "location": "FlightsBooking.user_clicks_on_search_button_and_book_now_button()"
});
formatter.result({
  "duration": 10977893328,
  "status": "passed"
});
formatter.match({
  "location": "FlightsBooking.user_completes_the_booking()"
});
formatter.result({
  "duration": 1786628473,
  "status": "passed"
});
formatter.match({
  "location": "FlightsBooking.verify_if_the_user_is_navigated_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 22954223931,
  "status": "passed"
});
});