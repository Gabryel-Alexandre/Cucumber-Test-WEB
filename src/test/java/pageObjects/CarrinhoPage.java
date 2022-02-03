package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoPage {

	@FindBy(id = "checkout")
	private WebElement botaoCheckout;

	@FindBy(id = "first-name")
	private WebElement fistName;

	@FindBy(id = "last-name")
	private WebElement lastName;

	@FindBy(id = "postal-code")
	private WebElement postalCode;

	@FindBy(id = "continue")
	private WebElement botaoContinue;

	@FindBy(id = "finish")
	private WebElement botaoFinish;

	@FindBy(id = "cancel")
	private WebElement botaoCancelarCompra;
	
	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	private WebElement botaoRemoverCamisaEngano;

	// Métodos de inserir em campos
	
	public void inserirFistName(String fist) {
		fistName.sendKeys(fist);
	}

	public void inserirLastName(String last) {
		lastName.sendKeys(last);
	}

	public void inserirPostalCode(String postal) {
		postalCode.sendKeys(postal);
	}

	// Métodos de Click
	
	public void clicarNoBotaoCheckout() {
		botaoCheckout.click();
	}

	public void clicarNoBotaoContinue() {
		botaoContinue.click();
	}

	public void clicarNoBotaoFinish() {
		botaoFinish.click();
	}

	public void clicarNoBotaoCancel() {
		botaoCancelarCompra.click();
	}
	
	public void clicarNoBotaoRemoverCamisaEngano() {
		botaoRemoverCamisaEngano.click();
	}

}
