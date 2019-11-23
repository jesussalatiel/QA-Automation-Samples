**Quality Assurance Enginner:** Also known as QA enginners, track the development process of a product from start to finish. They oversee production,  testing each part to ensure it meets company standards before moving to the next phase. The goal of QA enginners is to create safeguards for products to be market-ready and meet all government regulations before it is released to the public 

**Scrum (5-9 persons)**
Scrum is an agile project management methodology has three roles:
- Product owner
- Scrum master
- Team 

Each them has different responsibilities for example:

- Product owner get the requirements customer
- Scrum master create the tasks to do 
- Team is conformed by Developers and Testers.

Scrum has four ceremonies:
1. Sprint planning 
2. Scrum meeting 
3. Scrum review 
4. Sprint retrospective. 
#####

**Quality Assurance:** A set of activities designed to ensure that the development and/or maintenance process is adequate to ensure a system will meet its objectives.
#####

**Report Defect:** Is a document that identifies and describes a defect detected by a tester. This document describes the following aspects for example: Defect Title, Description, Environment, Software Version, ID Test Case, Used Script, Priority, Evidence (Screenshot) and Severity of the defect
#####

**Defects Types:**
- Functionality
- Security
- Statics
- Performance

#####

- **Test Plan:** A document describing the scope, approach, resource, and schedule of intented testing activities
- **Test Matrix:** A document showing the relationship between requirements and test cases
- **Test Scenario:** Describe the functionality of a module.
- **Test Case:** A set inputs, executions and preconditions and expected outcomes developed for a particular objective 
- **Testing Types:** Functional, End to end, performance, regression, exploratory 
- **SDLC:** Planning, Analysis, Design, Implementation, Execution and Completion 
- **Types of Manual Testing:** Black Box Testing, White Box Testing, Unit Testing, System Testing, Integration Testing and Acceptance Testing.
- **Black Box:** Also known as Behavioral Testing, is a software testing method in which the internal structure/design/implementation of the item being tested is not known to the tester.
- **White Box:** Is defined a the testting of a software solution's internal structure, design and coding. In this type of testing the coding is visible to the tester.
- **Grey Box:** Is a technique to the the software product or application with partial knowledge of the internal workings of an application.

#####
**Selenium:** Selenium is a free automated testing suite for web applications across diffentes browsers and platforms 
#####
**Automatization Recommendation** 	
- Recurrent Tasks
- Critical Areas
- Hight set data 
- Critical paths (Priority functions)
- Functionalities with a high-grade error during the manual test 
- Functionalities in different browsers, operations systems and mobiles 
#####
**Elements of a Test Case**
- Subject 
- Test Name
- Description
- Step Name
- Step Description
- Expected Results
- Step Data 
- Status
- Preconditions 
- Priority
#####
**Status Type:**
- Passed
- Failed
- No Execute
- Blocked
- In progress
#####
**Testing Environments**
- LOCAL
- DEV
- QA
- UAT
- PAT (Pre-production)
- Production
#####
**JIRA:** Is a tool, it’s used for a bug tracking, issue tracking, and project management related to software and mobile apps.
In Jira you can create:
- Issue types (Sub-task, bug, New feature)
- Workflow’s: Is a set of statues and transitions that an issue goes through during its lifecycle ( Open Issue, Resolved Issue, InProgress Issue, ReOpened Issue, Close Issue.
- Screens 
- Fields 
- Issue Attributes 
#####
**TestNG:** Is a testing framework designed to simplify a broad range of testing needs.
#####
**Advantages**
- TestNG provides parallel execution of test methods
- It allows to define dependency of one test method over other method 
- It allows to assign priority to test methods 
- It allows grouping of test methods into test groups 
- Is has support for parameterizing test cases using @Parameters annotation
- It allows data driven testing using @DataProvider annotation
- It has different assertions that helps in checking the expected and actual results 
- Detailed HTML reports  
#####
**TestNG Assertions**
TestNG Asserts help us to verify the conditions of the test in the middle of the test run. Based on the TestNG Assertions, we will consider a successful test only if it is completed the test run without throwing any exception.
#####
**Some of the common assertions**
- assertEqual(String actual,String expected)
- assertEqual(String actual,String expected, String message)
- assertEquals(boolean actual,boolean expected)
- assertTrue(condition)
- assertTrue(condition, message)
- assertFalse(condition)
- assertFalse(condition, message)

**Examples Tests Cases**
#####
**Test Case 1**
#####
1. Enter the URL in the address bar (www.example.com/signup)
2. Enter an invalid string in each input field (email, username, and password)
3. Check whether the input strings were validated against corresponding regexes and any pre-existing values in the database
4. Enter ‘valid’ strings in each input field; click Sign Up
5. Check whether “Welcome, ‘{‘username’}’“ page showed up
6. Check whether the system database created a new userID for ‘{‘username’}’
7. Mark the test ‘passed’ if it did, ‘failed’ if the signup feature broke anywhere during the test.
#####
**Test Case 2**
#####
Test Case ID| Test Scenario| Test Steps| Test Data| Expected Results| Actual Results| Pass/Fail
--- | --- | --- | --- | --- | --- | --- |
TU01| Check Customer Login with valid Data | 1. Go to site (www.example.com/signup) 2.Enter UserID 3. Enter Password 4. Click Submit | Userid = guru99 Password = pass99| User should Login into an application| As Expected| Pass|
TU02| Check Customer Login with invalid Data | 1. Go to site (www.example.com/signup) 2.Enter UserID 3. Enter Password 4. Click Submit| Userid = salatiel Password = pass99| User should Login into an application| As Expected| Pass|
#####
**Best Practice for writing good Test Case**
#####
- **Test Cases need to be simple:** Create test cases that are as simple as possible They must be clear and concise as the author of the test case may not execute them
- **Create Test Case with End User Mind:** A tester must create test cases keeping in mind the end user perspective this is must be be easy to use and operate
- **Avoid Test Case Repetition:** Do not repeat test cases. If a test case is needed for executing some other test case, call the test case by its test case id in the pre-condition column
- **Don't Assume:** Don't assume functionality and features of your software application while preparing test case
- **Ensure 100% Coverage:** Make sure you write test cases to check all software requirements mentioned in the specification document
- **Test Cases must be identifiable:** Name the test case id such that they are identified easily while tracking defects or identifying a software requirement at a later stage
- **Repeatable and self-standing:** The test case should generate the same results every time no matter who test its
- **Peer Review:** After creating test cases, get them reviewed by your colleagues. Your peers can uncover defects in your test case design
#####
**SoapUI:** Is an open-source web testing application for service-oriented architectures (SOA) and representational state transfers (REST). Allows testers to execute automated functional, regression, compliance, and load tests on different Web API. Supports Multiple Environments easy to switch between QA, DEV and Prod Environments.
#####
**HTTP Status Code:**
- 1xx Informational
- 2xx Success
- 3xx Redirection
- 4xx Client Error
- 5xx Server Error
#####
**Appium:** Is an open source, cross-platform automation testing tool. It is used for automating test cases for native, hybrid, and web applications. The tool has a major focus on both Android and IOS apps and was only restricted to the mobile application testing domain.
**Jenkins:**
Jenkins is an open source automation tool writen in Java. It is used to build and test your software projects continuosly making it easier for developers to integrate changes to the project, and making it easier for users to obtain a fresh build. Jenkins achieves Continuos Integration (CI) with the helpof plugis. Plugins allows the integration of Various DevOps stages. If you want to integrate a particular tool, you need to install the plugins for that tool. For example: Git, Maven 2 project, Amazon EC2, HTML publisher etc 
#####
**Advantages**
- It is an open source tool with great community support
- It is easy to install
- It has 1000+ plugins to ease your work.
- It is free of cost
- It is built with Java and hence, it is portable to all the major platforms.
#####
**Cucumber:** Is a tool based on Behavior Driven Develpment (BDD) framework which is used to write acceptance test for the web application. It allows automation of functional validation in easily and understandble format to Bussines Analyst, Developers, Testers, etc. Cucumber can be used along with Selenium, Watir, and Capybara etc. Cucumber supports many other languages like PHP, Python, Net, Perl, etc. 
#####
**Continuous Integration (CI):**
Continuous integration is a develpment practice in wich the developers are required to commit changes to the source code in a shared repository several times a day or more frequently. Every commit made in the repository is then nuilt. This allows the teams to detect the problems early. Apart from this. depending on the COntinuous Integration tool, there are several other functions like deploying the build application on the test server, providing the concerned teams with the build and test results etc.
#####
**Software Development Life Cycle (SDLC):** Defines all the standard phases which are involved during the software development process. SDLC life cycle is a process of developing software through a phased manner in the following order:
1. Requeriments Gathering
2. Design the software
3. Build the Software
4. Test
5. Deployment
6. Maintenance
#####
**Software Testing Life Cycle (STLC):** Is the process that is executed in a well-planned manner. In the STLC process, various activities are carried out to improve the quality of the product. However, STLC phases only deal with testing and detecting errors but not development iself. Software Test Life Cycle has the following stages:
1. Requeriments Analysis
2. Test Planning
3. Test Deloppment 
4. Test Environment Setup
5. Test Execution & Closure
#####
**Test Execution:** Is the process of executing the code and comparing the excepted and actual results
It is generate the following 
1. Test Results and Reports
2. Defects Reports
3. Test Metrics
#####
**Diference Between SDLC and STLC**
#####
**Parameter**| **SDLC**| **STLC**|
--- | --- | --- |
Origin| Development Life Cycle| Testing Life Cycle|  
Objetive| The main object of SDLC life cycle is to complete sucessful development of the software including testing and other phases| The only objective of the STLC phase is testig|
Requirement Gathering| In SDLC the business analyst gathers the requirements and create Development Plan| In STLC, the QA team analyze requeriments document like fuctional and no-functional documents and Create System Test Plan|
High & Low-Level Design| In SDLC, the develpment team creates the high and low-level design plans| In STLC, the test analyst create the integration Test Plan|
Coding| The real code is developed, and actual work takes place as per the design documents| The testing team prepares the test environment and executes them|
Maintenance| SDLC phase also includes post-deṕloyment supports and updates| Testers, execute regression suits, usually automation scripts to check maintenance code deployed|
#####
**Regression Testing:** Is defined as a type of software testing to confirm that a recent program or code change has not adversely affected existing features
#####
**Defect Life Cicle:** Also known as a Bug Life Cycle, is a cycle of a defect from which it goes through covering the different states in its entire life.
- Find
- Report
- Acknowledge
- Fix
- Verify 
- Resolve
#####
**Defect:** A defect, in simple terms, is a flaw or an error in an application that is restricting the normal flow of an application by mismatching the expected behavior with the actual one. The defect occurs when any mistake is made by a developer during designing or building of an application and when this flaw is found by a tester.
#####
**Structured Query Language (SQL):**
 Is actually the standard language for dealing with Relational DataBases. Some coomon realational database management systems that use QSL are: Oracle, Microsoft SQL Server. However, the standard SQL comands such as "Select", "Insert", "Update", "Delete", "Create" and "Drop" can be used to accomplish almost everything that one needs to do with a database.
#####
**Amazon EC2**
Amazon Elastic Compute Cloud (Amazon EC2), allows users to rent virtual computers on wich to run their own computer applications. EC2 encourages scalable deployment of applications by providing a web service through wich user can boot an Amazon Machine Image (AMI) to configure a virtual machine, which Amazon calls an "instance", containing any software desired.
#####
##### Other Software
Code Spell Checker


##### Sources
[Assertions](https://www.softwaretestingmaterial.com/testng-interview-questions/)
[Jenkins](https://www.edureka.co/blog/what-is-jenkins/)
[Cucumber](https://www.softwaretestinghelp.com/cucumber-bdd-tool-selenium-tutorial-30/)
[Software Testing Dictionary](https://www.tutorialspoint.com/software_testing_dictionary/test_execution.htm)