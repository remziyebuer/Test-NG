package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // dropdown'dan "Computers" optionunu secin
    @FindBy(xpath = "//select[@id ='searchDropdownBox']")
    public WebElement dropDown;

    // arama motoruna "Asus" yazıp aratın
    @FindBy(xpath = "//input[@id ='twotabsearchtextbox']")
    public WebElement aramaMotoru;
    // ikinci urunun fotografını cekin
    @FindBy(xpath = "//img[@class ='s-image']")
    public WebElement ikinciUrun;
    // ikinci urune tıklayın
    // title'ının "ASUS" icerdigini test edin
    // sayfayı kapatın
}
