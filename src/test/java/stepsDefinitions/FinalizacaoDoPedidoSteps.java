package stepsDefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Entao;
import pageObjects.CarrinhoPage;

public class FinalizacaoDoPedidoSteps {

	@Entao("remover o item {string} do carrinho")
	public void removerOItemDoCarrinho(String string) {
		Na(CarrinhoPage.class).clicarNoBotaoRemoverCamisaEngano();
	}

	@Entao("eu clico no botao {string}")
	public void euClicoNoBotao(String string) {
		Na(CarrinhoPage.class).clicarNoBotaoCheckout();
	}

	@Entao("informo meu primeiro nome {string}")
	public void informoMeuPrimeiroNome(String string) {
		Na(CarrinhoPage.class).inserirFistName(string);
	}

	@Entao("informo meu ultimo nome {string}")
	public void informoMeuUltimoNome(String string) {
		Na(CarrinhoPage.class).inserirLastName(string);
	}

	@Entao("informo codigo postal {string}")
	public void informoCodigoPostal(String string) {
		Na(CarrinhoPage.class).inserirPostalCode(string);
	}

	@Entao("clico no botao continue")
	public void clicoNoBotaoContinue() {
		Na(CarrinhoPage.class).clicarNoBotaoContinue();
	}

	@Entao("clico no botao finish")
	public void clicoNoBotaoFinish() {
		Na(CarrinhoPage.class).clicarNoBotaoFinish();
	}

	@Entao("verifico se a compra exibe a mensagem {string}")
	public void verificoSeACompraExibeAMensagem(String string) {
		String textoElemento = driver.findElement(By.className("complete-header")).getText();
		
		assertTrue(textoElemento.equals(string));
	}

	@Entao("^aguardo a mensagem de erro$")
	public void aguardoAMensagemDeErro() throws Throwable {
		WebElement element =driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3"));
		
		assertNotNull(element);
	}

	@Entao("^clico no botao cancelar$")
	public void clicoNoBotaoCancelar() throws Throwable {
		Na(CarrinhoPage.class).clicarNoBotaoCancel();
	}
}
