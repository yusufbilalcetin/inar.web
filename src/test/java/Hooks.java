import Utils.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Hooks {

    @BeforeAll
    public static void setUpEnviroment() {
        Driver.getDriver();
    }

    @AfterAll
    public static void teardownTestEnviroment() {
        Driver.closeDriver();
    }
}


