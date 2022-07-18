package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.webDriverManager;

public class hooks {

    @After
    public void tearDown() {
        webDriverManager.closeBrowser();
    }

}
