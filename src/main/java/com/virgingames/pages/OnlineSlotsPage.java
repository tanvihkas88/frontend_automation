package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
/**
 * Created by Kartik Shah
 */
public class OnlineSlotsPage extends Utility {
    private static final Logger log = LogManager.getLogger(OnlineSlotsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Play Online Slots at Virgin Games']")
    WebElement onlineSlotsText;


    public String getTextOfPlayOnlineSlotsAtVirginGames() {
        log.info("Get text of OnlineSlot: " +  onlineSlotsText.toString());
        return getTextFromElement(onlineSlotsText);
    }
}
