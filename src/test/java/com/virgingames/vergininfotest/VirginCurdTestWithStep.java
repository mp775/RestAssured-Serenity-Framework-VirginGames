package com.virgingames.vergininfotest;

import com.virgingames.testbase.TestBase;
import com.virgingames.virgingameinfo.VirginGameSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class VirginCurdTestWithStep extends TestBase {
    @Steps
    VirginGameSteps virginGameSteps;

    @Title("This will be get All Games")
    @Test
    public void test001() {
        virginGameSteps.getGamesDataByGBP();
    }

    @Title("This will be get All ERU Currency")
    @Test
    public void test002() {
        virginGameSteps.getGamesDataByERU();
    }

    @Title("This will be get All SEK Currency")
    @Test
    public void test003() {
        virginGameSteps.getGamesDataBySEK();
    }
}


