package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class HomePage extends RunCucumberTest {

    @FindBy(css = "#logo > a")
    private WebElement btnSimple;

    @FindBy(id = "product-2")
    private WebElement selectNoirJacket;

    @FindBy(id = "product-2")
    private WebElement clicarBtnAdicionar;

    @FindBy(css = "#minicart > a.checkout")
    private WebElement btnCheckout;

    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarBtnSimple(){
        clicar(btnSimple);
    }
    public void clicarBtnJacket(){
        clicar(selectNoirJacket);
    }

    public void clicarBtnAdicionar(){
        clicar(clicarBtnAdicionar);
    }

    public void clicarBtnCheckout(){
        clicar(btnCheckout);
    }

}
