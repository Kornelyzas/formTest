import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest4 {

    // Sekmingas iraso redagavimas

    @BeforeTest
    public void setup(){
        Form.setup();
    }

    @Test
    public void movieUpdate(){
        Form.movieUpdate();
        Form.clickRedaguoti();
    }

    @AfterTest
    public void close(){
        Form.close();
    }

}
