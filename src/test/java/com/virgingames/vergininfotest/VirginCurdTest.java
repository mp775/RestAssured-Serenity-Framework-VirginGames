package com.virgingames.vergininfotest;

import com.virgingames.constants.EndPoint;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;

public class VirginCurdTest extends TestBase {
    static String currency = "currency";

    @Title("This will be get All data")
    @Test

    public void getGamesDataByGBP() {
        SerenityRest.given()
                .headers("Content-Type", "application/json")
                .when()
                .get(EndPoint.GET_ALL_Games)
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        Assert.assertEquals(currency, "currency");
    }

    @Title("This will be get All data")
    @Test
    public void getGamesDataByERU() {
        SerenityRest.given()
                .when()
                .get(EndPoint.GET_ALL_GAMES_WITH_EUR)
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        Assert.assertEquals(currency, "currency");

    }

    @Title("This will be get All data")
    @Test
    public void getGamesDataBySEK() {
        SerenityRest.given()
                .when()
                .get(EndPoint.GET_ALL_GAMES_WITH_SEK)
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        Assert.assertEquals(currency, "currency");
    }
}


