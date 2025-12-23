import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);

    }

    private final By titleProduct = By.xpath("//span[text()='Products']");
    private final By cartButton = By.xpath("//button[text()='Add to cart']");
    private final By cartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private final By titleCart = By.xpath("//span[text()='Your Cart']");


    public CheckOutPage clickProductAddToCart(String ProductName) {
        List<WebElement> liftoffElements = driver.findElements(cartButton);
        if (ProductName == null || ProductName.trim().isEmpty()) {
            throw new IllegalArgumentException("ProductName/itemId is empty!");
        }
        for(WebElement element : liftoffElements){
            String elementId= element.getAttribute("id");
            if(elementId .toLowerCase().contains(ProductName.toLowerCase())){
                element.click();
                driver.findElement(cartIcon).click();
                break;
            }
        }
        return new CheckOutPage(driver);

    }
    public  String getProductPageTitle() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(titleCart)).getText();
    }
}