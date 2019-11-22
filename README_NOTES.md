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

**Report Defect:** Is a document that identifies and describes a defect detected by a tester. This document describes the following aspects for example: Defect title, Description, Environment, Software Version, ID Test Case, Used Script, Priority, Evidence (Screenshot) and Severity of the defect
#####

**Defects Types:**
- Functionality
- Security
- Statics
- Performance

#####

- **Test Plan:** A document describing the scope, approach, resource, and schedule 
- **Test Matrix:** A document showing the relationship between requirements and test cases
- **Test Scenario:** Describe the functionality of a module.
- **Test Case:** A set inputs, executions and preconditions and expected outcomes developed for a particular objective 
- **Testing Types:** Functional, End to end, performance, regression, exploratory 
- **SDLC:** Planning, Analysis, Design, Implementation, Execution and Completion 
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
**Continuous Integration (CI)**
Continuous integration is a develpment practice in wich the developers are required to commit changes to the source code in a shared repository several times a day or more frequently. Every commit made in the repository is then nuilt. This allows the teams to detect the problems early. Apart from this. depending on the COntinuous Integration tool, there are several other functions like deploying the build application on the test server, providing the concerned teams with the build and test results etc.
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