package techproed.tests.projecttests;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TestCase_22 {
    /*
    1. Browser starten
2. Navigieren Sie zur URL 'http://automationexercise.com'.
3. Blättern Sie bis zum Ende der Seite
4. Vergewissern Sie sich, dass "EMPFOHLENE ITEMS" sichtbar sind.
5. Klicken Sie auf "In den Warenkorb" für das empfohlene Produkt
6. Klicken Sie auf die Schaltfläche "Warenkorb anzeigen".
7. Überprüfen Sie, ob das Produkt auf der Seite "Warenkorb" angezeigt wird.

   ______________________________________________________________________
    1. tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin. 3. Sayfanın sonuna kaydırın.
3. Sayfanın en altına kaydırın.
4. 'ÖNERİLEN ÖĞELER'in görünür olduğundan emin olun.
5. Önerilen ürün için "Sepete ekle" düğmesine tıklayın
6. "Alışveriş sepetini göster" düğmesine tıklayın
7. Ürünün "Alışveriş Sepeti" sayfasında görüntülendiğini kontrol edin.

     */

    @Test
    public void test22() {




          //1. Browser starten
           Driver.getDriver().get(ConfigReader.getProperty(""));



          //2. Navigieren Sie zur URL 'http://automationexercise.com'.



          //3. Blättern Sie bis zum Ende der Seite



          //4. Vergewissern Sie sich, dass "EMPFOHLENE ITEMS" sichtbar sind.



           //5. Klicken Sie auf "In den Warenkorb" für das empfohlene Produkt



           //6. Klicken Sie auf die Schaltfläche "Warenkorb anzeigen".



            //7. Überprüfen Sie, ob das Produkt auf der Seite "Warenkorb" angezeigt wird.

    }
}
