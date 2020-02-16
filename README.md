# Project Title

Create an automated smoke test suite using any web automation tool & framework for booking flight in phptravels.com website.

## Tools/Frameworks used

●	Selenium is used along with cucumber BDD framework to complete this task.


### Bugs Found

#1 Flights link is missing in the https://www.phptravels.net/account/ page randomly, and the the link is getting visible again after sometime.

#2 In the flights home page return journey object is enabled even though user has selected the ONE WAY radio button. Return journey calender should be enabled only after selecting the ROUND TRIP radio button.


#### Prerequisites

I assume following software's are installed on the machine where this project will be executed.

●	Java 1.8(Path and Class path configured)
●	Eclipse(Eclipse IDE for Java Developers or any eclipse to import and execute the project)

## Running the tests

●	Open Eclipse->Import the downloaded Project from Github->Wait for eclipse to build the workspace

●	Navigate to src/main/java->runner package->Open TestRunner.Java class-> Right click and run as Junit test

●	Program execution will be started and wait till the execution is completed.

●	Naviate to /test-output/index.html page to view the results.

#### Role Applied at Qantas
Senior QA Automation Engineer

