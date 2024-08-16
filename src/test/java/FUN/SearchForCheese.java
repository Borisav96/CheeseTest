package FUN;

import POM.GooglePage;
import com.sun.source.tree.DoWhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.SQLOutput;

public class SearchForCheese {

    public static void seachforCheese (WebDriver driver, WebDriverWait wait){

        //Search Cheese on Google
        driver.findElement(GooglePage.searchTextBar).sendKeys("Cheese");
        driver.findElement(GooglePage.searchTextBar).submit();
        //Get number of Cheese on page
        int cheeseCount = driver.findElements(By.partialLinkText("Cheese")).size();
        //Compare number of Cheese to 777
        Assert.assertEquals(777, cheeseCount);

    }

}
