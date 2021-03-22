import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

    public static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver89.exe");

        browser = new ChromeDriver();
        browser.get("http://kitm.epizy.com/filmai.php");
    }


    // teisingas formos uzpildymas
    public static void fillFormCorrect(){
        WebElement pavadinimas = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[2]"));
        pavadinimas.sendKeys("Eurotrip");

        WebElement zanras = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[3]"));
        zanras.sendKeys("Komedija");

        WebElement aktoriai = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[4]"));
        aktoriai.sendKeys("Scott Mechlowicz, Jacob Pitts, Michelle Trachtenberg");

        WebElement rezisierius = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[5]"));
        rezisierius.sendKeys("Jeff Schaffer");

        WebElement trukme = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[6]"));
        trukme.sendKeys("92");
    }


    //neteisingas formos uzpildymas
    public static void fillFormIncorrect(){
        WebElement pavadinimas = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[2]"));
        pavadinimas.sendKeys("Tranformers");

        WebElement zanras = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[3]"));
        zanras.sendKeys("fantastinis");

        WebElement aktoriai = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[4]"));
        aktoriai.sendKeys("Scott Mechlowicz, Jacob Pitts, Michelle Trachtenberg");

        WebElement rezisierius = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[5]"));
        rezisierius.sendKeys("Jeff Schaffer");

        WebElement trukme = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[6]"));
        trukme.sendKeys("devyniasdesimt dvi");
    }


    // sekmingas redagavimas
    public static void movieUpdate(){
        WebElement id = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[1]"));
        id.sendKeys("222");

        WebElement pavadinimas = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[2]"));
        pavadinimas.sendKeys("Eurotrip");

        WebElement zanras = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[3]"));
        zanras.sendKeys("komedija redaguota");

        WebElement aktoriai = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[4]"));
        aktoriai.sendKeys("Scott Mechlowicz, Jacob Pitts, Michelle Trachtenberg redaguota");

        WebElement rezisierius = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[5]"));
        rezisierius.sendKeys("Jeff Schaffer redaguota");

        WebElement trukme = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[6]"));
        trukme.sendKeys("111");
    }


    // neteisingai ivesti ivesti duomenys redaguojant
    public static void incorrectMovieUpdate(){
        WebElement id = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[1]"));
        id.sendKeys("221");

        WebElement pavadinimas = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[2]"));
        pavadinimas.sendKeys("Eurotrip");

        WebElement zanras = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[3]"));
        zanras.sendKeys("komedija redaguota");

        WebElement aktoriai = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[4]"));
        aktoriai.sendKeys("Scott Mechlowicz, Jacob Pitts, Michelle Trachtenberg redaguota");

        WebElement rezisierius = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[5]"));
        rezisierius.sendKeys("Jeff Schaffer redaguota");

        WebElement trukme = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[6]"));
        trukme.sendKeys("");
    }


    public static void clickSiusti(){
        WebElement submitBtn = browser.findElement(By.xpath("//*[@id=\"form\"]/form/p[1]/button[1]"));
        submitBtn.click();
    }


    public static void clickIeskoti(){
        WebElement ieskotiBtn = browser.findElement(By.xpath("//*[@id=\"form\"]/form/p[1]/button[3]"));
        ieskotiBtn.click();
    }

    public static void clickRedaguoti(){
        WebElement redaguotiBtn = browser.findElement(By.xpath("//*[@id=\"form\"]/form/p[1]/button[2]"));
        redaguotiBtn.click();
    }

    public static void movieSearch(){
        WebElement pavadinimas = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[2]"));
        pavadinimas.sendKeys("Eurotrip");
    }

    public static void findMovieId(){
        WebElement id = browser.findElement(By.xpath("//*[@id=\"form\"]/form/input[1]"));
        id.sendKeys("173");
    }

    public static void clickTrinti(){
        WebElement trintiBtn = browser.findElement(By.xpath("//*[@id=\"form\"]/form/p[1]/button[4]"));
        trintiBtn.click();
    }


    public static void close(){
        browser.close();
    }

    public static void main(String[] args){
        System.out.println("Test Started");
        setup();
        fillFormCorrect();
        clickSiusti();
        movieSearch();
        clickIeskoti();
        movieUpdate();
        incorrectMovieUpdate();
        clickRedaguoti();
        findMovieId();
        clickTrinti();
        close();
    }
}
