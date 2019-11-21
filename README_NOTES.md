**Strum (5-9 persons)**
Scrum is an agile project management methodology has three roles:
- 1. Product owner
- 2. Scrum master
- 3. Team 

Each them has different responsibilities for example:

- 1. Product owner get the requirements customer
- 2. Scrum master create the tasks to do 
- 3. Team is conformed by Developers and Testers.

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
**1. Test Cases need to be simple:** Create test cases that are as simple as possible They must be clear and concise as the author of the test case may not execute them
**2. Create Test Case with End User Mind:** A tester must create test cases keeping in mind the end user perspective this is must be be easy to use and operate
**3. Avoid Test Case Repetition:** Do not repeat test cases. If a test case is needed for executing some other test case, call the test case by its test case id in the pre-condition column
**4. Don't Assume:** Don't assume functionality and features of your software application while preparing test case
**5.Ensure 100% Coverage:** Make sure you write test cases to check all software requirements mentioned in the specification document
**6. Test Cases must be identifiable:** Name the test case id such that they are identified easily while tracking defects or identifying a software requirement at a later stage
**7. Repeatable and self-standing:** The test case should generate the same results every time no matter who test its
**6. Peer Review:** After creating test cases, get them reviewed by your colleagues. Your peers can uncover defects in your test case design
##### Other Software
Code Spell Checker

##### Sources
[Assertions](https://www.softwaretestingmaterial.com/testng-interview-questions/)