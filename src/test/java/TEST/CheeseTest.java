package TEST;

import FUN.SearchForCheese;
import org.testng.annotations.Test;

public class CheeseTest extends BeforeAfterTest {

    @Test
    public void ChessTest(){

        SearchForCheese.seachforCheese(driver, wait);

    }

}
