package com.virgingames.virgininfo;

import com.virgingames.constants.EndPoint;
import com.virgingames.constants.Path;
import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BingoGetTest extends TestBase {

    @Test
    public void getAllBingoRecords() {


        RestAssured.registerParser("text/plain", Parser.JSON);
        Response response = given()
                .when()
                .basePath(Path.BINGO)
                .get(EndPoint.GET_ALL_RECORDS);
        response.then().statusCode(200);

        response.prettyPrint();


    }
}
