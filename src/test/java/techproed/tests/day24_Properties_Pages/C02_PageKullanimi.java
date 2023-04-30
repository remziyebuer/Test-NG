package techproed.tests.day24_Properties_Pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanimi {
    //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
    //kullaniciAdi, kullaniciSifre, submitButton elementlerini bul
    //Login Testini basarili oldugunu test et

   /*
   Yukardaki adres icin 20 adet test methodu olusturursak sonrasinda yukardaki url'de bir

    degisiklik oldugunda butun test methodlarindan tek tek url duzeltmek yerine bir kere .properties
    dosyamdan url'i duzeltirim ve bu bizim icin daha hizli daha duzenli ve daha kolay olur.
*/

    @Test
    public void test1() {
         //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("openSource_url"));

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini bul
        //Driver.getDriver().findElement(By.xpath("locate"));

        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.username.sendKeys(ConfigReader.getProperty("username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("password"));
        openSourcePage.login.click();


        //Login Testinin basarili oldugunu test et

        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());



    }
}
