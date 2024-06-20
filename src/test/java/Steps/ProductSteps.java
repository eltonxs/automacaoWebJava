package Steps;

import Pages.HomePage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProductSteps {
    ProductPage productPage = new ProductPage();


    @And("escolho o tamanho {string}")
    public void escolhoOTamanho(String texto) {
        productPage.comboBoxTamanho(texto);
    }

    @And("escolho a cor {string}")
    public void escolhoACor(String texto) {
        productPage.comboBoxCor(texto);
    }

    @And("clico no botao adicionar ao carrinho")
    public void clicoNoBotaoAdicionarAoCarrinho() {
        productPage.clickBtnCarrinho();
    }
}

