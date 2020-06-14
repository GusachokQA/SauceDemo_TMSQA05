import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmokeTest extends BaseTest {
    private String URL = "https://www.saucedemo.com/index.html";

    @Test
    public void SwagLabs(){
        String usernameValue = "standard_user";
        String passwordValue = "secret_sauce";

        //1. Открыть сайт https://www.saucedemo.com/index.html
        driver.get(URL);

        //2. Ввести username
        WebElement username = driver.findElementByCssSelector("[placeholder='Username']");
        username.sendKeys(usernameValue);

        //3. Ввести password
        WebElement password = driver.findElementById("password");
        password.sendKeys(passwordValue);

        //4. Нажать кнопку Login
        WebElement login = driver.findElementByClassName("btn_action");
        login.click();

        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        for (WebElement element: elements ) {
            System.out.println(element.findElement(By.className("inventory_item_name")).getText()+ " price: " + element.findElement(By.className("inventory_item_price")).getText());
        }
        System.out.println("amount of elements = " + elements.size());
    }
}
