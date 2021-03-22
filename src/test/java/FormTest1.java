import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest1 {

    // Teisingas formos uzpildymas

    @BeforeTest
    public void setup(){
        Form.setup();
    }

    @Test
    public void fillFormCorrect(){
        Form.fillFormCorrect();
        Form.clickSiusti();
    }

    @AfterTest
    public void close(){
        Form.close();
    }

}
