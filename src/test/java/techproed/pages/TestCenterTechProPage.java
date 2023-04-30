package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import techproed.utilities.Driver;

public class TestCenterTechProPage {
    public TestCenterTechProPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='exampleInputEmail1']")
    public WebElement userName;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement homeHeader;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement text;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logout;


}
