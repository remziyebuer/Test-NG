package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    /*
   Locate'lerimizi tek bir yerde duzenli bir sekilde tutabilmek icin;
   1-   ilk olarak olusturmus oldugumuz page class'imizda bir constructor olustururuz.
   2-PageFactory class'indan initelements methodu ile driver'i tanitiriz.
   3-@findBy notasyonu kullanarak locatelerimizi aliriz.
       */
    public OpenSourcePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }//burdan obje olusturup locate lerimi kullanacagm

    //Driver.getDriver().findElement(By.xpath("locate"));
    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement login;
    @FindBy(xpath = "//h6")
    public WebElement dashboard;

}
