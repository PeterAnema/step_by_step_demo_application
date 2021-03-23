## Step 1

#### Modifications
1. Started with a starter project from https://start.spring.io
with dependencies: **Spring Web**
2. Also added the first version of this README.md file.

#### Result
You can start the application but nothing really happens yet.

## Step 2

#### Modifications
1. Added a controller package.
2. Added a BaseController

#### Result
If you run the application an endpoint is available at localhost on the default port 8080. In a browser navigate to http://localhost:8080/

## Step 3

#### Modifications
1. Added the GreetController with two GET endpoints
2. Added variables to application.properties to store the messages returned by the new endpoints

#### Result
Two new endpoints are now available:
* http://localhost:8080/welcome
* http://localhost:8080/goodbye

## Step 3

#### Modifications
1. Added the NameController
2. In the NameController a static list of names is used.

#### Result
The new endpoint http://localhost:8080/names returns a number of names as a JSON.