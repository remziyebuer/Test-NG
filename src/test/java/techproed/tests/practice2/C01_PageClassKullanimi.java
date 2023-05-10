package techproed.tests.practice2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_PageClassKullanimi {
    // amazon sayfasına gidin
    // dropdown'dan "Computers" optionunu secin
    // arama motoruna "Asus" yazıp aratın
    // ikinci urunun fotografını cekin
    // ikinci urune tıklayın
    // title'ının "ASUS" icerdigini test edin
    // sayfayı kapatın

    @Test
    public void test01() {

        // amazon sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));

        // dropdown'dan "Computers" optionunu secin
        AmazonPage amazonPage = new AmazonPage();

        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText("Computers");


        // arama motoruna "Asus" yazıp aratın
        amazonPage.aramaMotoru.sendKeys("Asus" + Keys.ENTER);




        // ikinci urunun fotografını cekin




        // ikinci urune tıklayın




        // title'ının "ASUS" icerdigini test edin




        // sayfayı kapatın
    }
}
