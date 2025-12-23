import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutPage extends BasePage {
    private final By firstNameData = By.id("first-name");
    private final By lastNameData  = By.id("last-name");
    private final By postalCode    = By.id("postal-code");
    private final By continueBtn   = By.id("continue");
    private final By finishBtn     = By.id("finish");
    private final By completeHeader = By.className("complete-header");

    public CheckOutPage(WebDriver driver){
        super(driver);
    }

    public void checkOut(String firstName, String lastName, String zip) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameData)).clear();
        driver.findElement(firstNameData).sendKeys(firstName);

        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameData)).clear();
        driver.findElement(lastNameData).sendKeys(lastName);

        wait.until(ExpectedConditions.visibilityOfElementLocated(postalCode)).clear();
        driver.findElement(postalCode).sendKeys(zip);

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(finishBtn)).click();
    }

    public String getCompleteHeaderText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(completeHeader)).getText().trim();
    }
}