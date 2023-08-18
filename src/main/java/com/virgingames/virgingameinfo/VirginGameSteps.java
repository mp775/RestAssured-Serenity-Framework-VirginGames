package com.virgingames.virgingameinfo;

import com.virgingames.constants.EndPoint;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;

public class VirginGameSteps {
    String currency = "currency";

    @Step
    @Title("This will be get All data")
    public ValidatableResponse getGamesDataByGBP(){
        return SerenityRest.given()
                .when()
                .get(EndPoint.GET_ALL_Games)
                .then().log().all().statusCode(200);
    }

    @Title("This will be get All ERU Currency")
    public ValidatableResponse getGamesDataByERU()
    {
        return SerenityRest.given()
                .when()
                .get(EndPoint.GET_ALL_GAMES_WITH_EUR)
                .then().log().all().statusCode(200);
    }
    @Title("This will be get All SEK Currency")
    public ValidatableResponse getGamesDataBySEK()
    {
        return SerenityRest.given()
                .when()
                .get(EndPoint.GET_ALL_GAMES_WITH_SEK)
                .then().log().all().statusCode(200);
    }

}
