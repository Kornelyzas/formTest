import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest5 {

    // nesekmingas iraso redagavimas

    @BeforeTest
    public void setup(){
        Form.setup();
    }

    @Test
    public void incorrectMovieUpdate(){
        Form.incorrectMovieUpdate();
        Form.clickRedaguoti();
    }

    @AfterTest
    public void close(){
        Form.close();
    }

}
