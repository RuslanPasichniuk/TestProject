package controllers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.PeopleModel;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;


public class PeopleController {

    private RequestSpecification requestSpecification;
    //private ResponseSpecification responseSpecification;

    public PeopleController() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://swapi.co/api/")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
    }

    public PeopleModel getPerson(String personId) {
        return given(requestSpecification)
                .get(String.format("people/%s/", personId))
                .then()
                .statusCode(200)
                .and()
                .extract().response().as(PeopleModel.class);
    }
}
