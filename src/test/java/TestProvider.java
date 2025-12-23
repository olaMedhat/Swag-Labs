import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestProvider {
    @org.testng.annotations.DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"invalid_user", "invalid_password"}
        };
    }
    @org.testng.annotations.DataProvider(name = "addToCartData")
    public Object [][] addToCartData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "sauce-labs-backpack"},
                {"standard_user", "secret_sauce", "sauce-labs-bike-light"},
                {"standard_user", "secret_sauce", "sauce-labs-bolt-t-shirt",},
                {"invalid", "invalid",  "sauce-labs-backpack"} ,
                { "", "", "sauce-labs-backpack"},
                {"standard_user", "secret_sauce", "invalid-item-id"},
                {"standard_user", "secret_sauce", ""}
        };
    }

    @org.testng.annotations.DataProvider(name = "checkoutData")
    public Object [][] checkoutData() {

        return new Object[][]{
                {"standard_user", "secret_sauce", "ola", "medhat", "12345"},
                {"standard_user", "secret_sauce", "nour", "turkey", "Xyz012"},
                {"standard_user", "secret_sauce", "xy", "xyz", "*^&^%#@"},
                {"invalid", "invalid", "tot", "frot", "00000"},
                {"     ", "     ", "fdsfdfs", "fgfgfg", "     "}
        };
    }
}


