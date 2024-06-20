package Steps;

import Pages.CheckoutPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {

    private static final String TITLE = "Noir jacket - L / Red";

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verifico se o titulo do pedido esta correto")
    public void verificoSeOTituloDoPedidoEstaCorreto() {
        Assert.assertEquals(checkoutPage.pegarTituloProduto(), TITLE);

    }
}

