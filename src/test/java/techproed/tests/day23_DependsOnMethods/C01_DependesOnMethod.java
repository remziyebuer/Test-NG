package techproed.tests.day23_DependsOnMethods;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C01_DependesOnMethod {

    /*
   Test NG'de @Test metotları birbirinden bağımsız çalışır.
    Methodları bağımlı çalıştırmak istiyorsak "dependsOnMethods" parametresi kullanılır.
    Aşağıda searchTest() methodu homePageTest() methoduna bağlıdır.
    Eğer homePageTest() çalışırsa searchTest() de çalışır.
    Eğer homePageTest() fail olursa seachTest() çalışmaz, "ignore" edilir.

     */
    @Test
    public void homePageTest() {

        assertEquals(1, 2);//Burada "hard assertion" kullanıldığı için
        // test fail olduğunda Java çalışmayı durdurur ve sonraki kodlar çalışmaz.
        //buna ragmen hard assertion daha cok tercih edilir soft edilmez sebebi kodlarin
        // durdurulmasi sonucu hata  üzerine yogunlasabilme
        //softta ise bir iki saat test calisir ve o sure kaybolur.

        System.out.println("Ana sayfaya gidildi");
    }

    @Test(dependsOnMethods = "homePageTest")
    public void searchTest() {
        System.out.println("Arama yapildi");
    }

    @Test(dependsOnMethods = "homePageTest")
    public void signInTest() {
        System.out.println("Giris yapildi");
    }//bunu searchTeste bagli yaparsam hata alirim cun ki o da baskasina bagli burda hata
    // almamak icin gruba baglanmali dedi hoca ama aciklamadi arastir
    // (guncelleme yaparsak olur dedi)
}
