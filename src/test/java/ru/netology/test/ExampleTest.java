package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExampleTest {

    @Test

    public void ShouldTestData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Какой-то заголовок")
                .contentType("text/plain; charset=UTF-8")
                .when()
                .post("/post")
                .then()
                .statusCode(404)
                .body("data", equalTo ("Какой-то заголовок"))
        ;
    }
}
