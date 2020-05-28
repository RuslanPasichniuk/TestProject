# Technologies
     Java
     jUnit
     RestAssured
     Jackson
## Patterns 
    Mediator
    Builder
    Controller
    Value Object

## Summary

|                          |                                                                                           |
|--------------------------|-------------------------------------------------------------------------------------------|
|**Owner(s)**              | Ruslan Pasichniuk                                                                                          |                                                                             |
|**Artifact name:**        | N/A                                                                     |
|**Artifact URL:**         | N/A for now                                                                               |
|**CI URL:**               | N/A                                                                                |
|**Languages:**            | Java                                                                                      |
|**RestClient:**           | RestAssured                                                                                      |
|**DataBinding:**          | Jackson                                                                                      |
|**Blackbox Tests:**       | jUnit                                                                                  |
|**Patterns/:**            | Mediator,Builder,Controller,Value Object                                                                                |
|**Distribution:**         | Test task                                                                                |

## Purpose

Here implemented a Test Automation Framework from scratch Using Java + jUnit + RestAssured;.

##Test Description 

-	Create a test, which will verify the following data using REST Api:
-	Given a base url: https://swapi.co/
-	Get a resource: /people/1/
-	Change all links in “films” array with actual movie titles
-	Assert that received result (whole character data containing substituted films data) equals to the expected data

