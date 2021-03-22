import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest2 {

    // neteisingas formos uzpildymas

    @BeforeTest
    public void setup(){
        Form.setup();
    }

    @Test
    public void fillFormIncorrect(){
        Form.fillFormIncorrect();
        Form.clickSiusti();
    }

    @AfterTest
    public void close(){
        Form.close();
    }

}
