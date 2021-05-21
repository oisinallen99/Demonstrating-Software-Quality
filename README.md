# Demonstrating-Software-Quality

## Scrum Sprint Backlog and Task Estimation 

<br>

Creating a sprint backlog can be very beneficial to a software development team as it allows them to identify each key stop in the development process and to break it down into small, manageable sections.

<br>

| ID        | Task           | Estimation | 
| :-------------: |:------------| :-----:|
| 01 | Create Models | 1 | 
| 02 | Create Criterion Class | 1 |
| 03 | Write Test Cases for Criterion Class Methods | 2 |
| 05 | Develop Functionality of Criterion Class | 2 | 
| 06 | Create Rubric Class | 1 | 
| 07 | Write Test Cases for Rubric Class Methods| 2 | 
| 08 | Develop Functionality of Rubric Class | 3 | 
| 09 | Add Logic for Implementing Criteria into Rubric | 2 |
| 10 | Create Student Class | 1 |
| 11 | Write Test Cases for Student Class Methods | 2 | 
| 12 | Develop Functionality of Student Class | 3 | 
| 09 | Add Logic for Implementing Rubric into Student | 2 |
| 10 | Create Controller Class | 5 | 
| 11 | Implement Calculations for Rubric | 4 |
| 12 | Implement Calculations for Criteria | 4 | 
| 13 | Write Test Cases for Controller Class | 5 | 
| 13 | Finalise Implementation and Functionality in the Controller Class | 3 | 

<br>

Velocity = 44

When assigning estimates to each of the tasks, I assessed each class and assigned an estimated value based on the complexity of the given task. I then re-evaluated each estimation in comparison to the estimation of every other task to assign a final estimation. The tasks 'Create Criterion Class' and Implement Calculation for Rubric' have vastly different estimations as creating the rubric class should be quite straight-forward in comparion to implementing the calculations for the rubrics which will involve complex algorithims.

Velocity is a key metric for accurately measuring the rate at which scrum development teams consistently deliver. It indicated the amount of product backlog and the amount of work that can be handled in each sprint.

<br>

## Test-Driven development

<br>

Test Driven Development is a style of programming in which the developers create unit tests decribing an aspect of the software. The developers then write enough code to enable the test to pass and repeat this, accumulation unit tests over time.

You can see a [commit](https://github.com/oisinallen99/Demonstrating-Software-Quality/commit/8a2a23f814818704da883378f2397a06909f399c "Commit") for my rubric class in which the test cases are created and code is written to pass these tests in the ruberic class.

<br>

## Test coverage metric

<br>

I used JUnit as my test coverage tool. JUnit allows the developer to see the test coverage scope of their project to ensure that their project is fully tested if needed.

![image](https://imgur.com/a/pygjIvZ.png)

Here you can see an example of JUnit displaying the test coverage scope for my project.

<br>

## Team Version Control

<br>

I ensured to follow the GitFlow process throughout my development with each class getting its own branch. My Branches are:

1. Master
2. Develop
2. Criterion
3. Rubric
4. Stundent
5. Controller

<br>


## Code - Review Checklist

<br>


#### Code Design

It is important for the developer to keep a consistent code design throughout the development of a project. This allows the code to be well structured and easy to understand.

<br>

#### Test Cases

Test cases can be vital to verify the functionality of your code, what it takes in and what it should return. By creating test case you will get an understanding for when a piece of your code should work and when it should fail.

<br>

#### Refactoring

Refactoring means to restructure your existing code to improve its internal structure while maintaining its external behavior. This is done to modernise software, increasing a system's maintainability, enhancing performance and security as well as improving the readability of the code. This is done to ensure that the developers code is effecient.

<br>

#### Documentation

Documentation is an important part of developing code as it allows the developer to keep focus on what the end goal of the projects is and the steps that are needed to successfully code the project.

Example of my reviewed [commit](https://github.com/oisinallen99/Demonstrating-Software-Quality/commit/51a1a40bf6da18144b0a480329100811a8dc31e4 "Commit")
   

