package techproed.tests.day23_DependsOnMethods;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_SoftAssertion {

    @Test
    public void SoftAssertTest() {

        //Soft assertion yapabilmek için 3 adım izliyoruz:

        //1. Adım: Soft Assert objesi oluşturun:
        SoftAssert softAssert = new SoftAssert();

        //2. Adım: Assertion yapın:
        //1. assertion
        softAssert.assertEquals(1, 2);
        //Soft assertion kullanıldığı için test fail olsa bile Java çalışmayı durdurmaz.
        System.out.println("Assertion 1 çalıştı");

        //2. assertion
        softAssert.assertTrue("Selenium".contains("a"));//Üstteki assertion fail oldu fakat bu assertin da çalıştı. Çünkü soft assertion kullanıldığından Java çalışmayı durdurmadı.
        System.out.println("Assertion 2 çalıştı");

        //2. assertion
        softAssert.assertTrue(false);
        System.out.println("Assertion 3 çalıştı");

        //3. Adım: assertAll() methodunu çalıştırın:
        softAssert.assertAll();

        System.out.println("Hello");//Bu kod çalışmayacak.
        // Çünkü assertAll() methodu fail durumunda assertionlar sonrası çalışmayı durdurur.Hata olmasa idi
        //assertAll olsa bile calisma durmaz***


    }
}
