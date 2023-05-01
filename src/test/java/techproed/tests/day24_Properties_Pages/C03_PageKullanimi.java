package techproed.tests.day24_Properties_Pages;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TestCenterTechProPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class C03_PageKullanimi {

    //https://testcenter.techproeducation.com/index.php?page=form-authentication
    //Page object Model kullanarak sayfaya giriş yapildigini test edin
    //Sayfadan cikis yap ve cikis yapildigini test et


    @Test
    public void test1() {
        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));

        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterTechProPage tctp=new TestCenterTechProPage();
        tctp.userName.sendKeys(ConfigReader.getProperty("kullaniciAdi"), Keys.TAB,
                ConfigReader.getProperty("kullaniciPassword"),Keys.ENTER);

        Assert.assertTrue(tctp.text.isDisplayed());

        //Sayfadan cikis yap ve cikis yapildigini test et
        tctp.logout.click();
        Assert.assertTrue(tctp.giris.isDisplayed());
        
        Driver.closeDriver();


    }
}
