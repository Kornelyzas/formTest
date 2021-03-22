import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest3 {

    // sekmingas iraso trynimas

    @BeforeTest
    public void setup(){
        Form.setup();
    }

    @Test
    public void deleteMovie(){
        Form.movieSearch();
        Form.clickIeskoti();
        Form.findMovieId();
        Form.clickTrinti();
    }

    @AfterTest
    public void close(){
        Form.close();
    }

}

