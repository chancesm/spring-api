# Spring API

## My first Java/Spring Project

For this project I followed the tutorial at https://spring.io/guides/gs/rest-service/. I modified the code to return a Deque of greetings instead of a single greeting.

---
### Details

#### Base Route = localhost:8080

#### Endpoint
The app responds to requests to "/greeting?name[OPTIONAL]" and follows the following steps:
1. Create a greeting
2. Add Greeting to Deque of Greetings
3. Return Deque of Greetings as JSON

