package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage {

	@FindBy(className = "product_sort_container")
	private WebElement filtroGeral;

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")
	private WebElement filtroLowToHigh;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement BotaoCamisa;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement BotaoMochila;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement BotaoJaqueta;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement BotaoCamisaEngano;

	@FindBy(className = "shopping_cart_link")
	private WebElement botaoCarrinho;

	// Métodos de click

	public void clicarFiltroGeral() {
		filtroGeral.click();
	}

	public void clicarFiltroLowToHigh() {
		filtroLowToHigh.click();
	}

	public void clicarNaCamisa() {
		BotaoCamisa.click();
	}

	public void clicarNaMochila() {
		BotaoMochila.click();
	}

	public void clicarNaJaqueta() {
		BotaoJaqueta.click();
	}

	public void clicarNaCamisaEngano() {
		BotaoCamisaEngano.click();
	}

	public void clicarNoCarrinhoDeCompras() {
		botaoCarrinho.click();
	}
}
