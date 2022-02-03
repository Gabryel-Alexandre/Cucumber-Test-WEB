package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "user-name")
	private WebElement nomeDoUsuario;

	@FindBy(id = "password")
	private WebElement senhaDoUsuario;
	
	@FindBy(id = "login-button")
	private WebElement botaoLogin;
	
	public void inserirNomeUsuario(String nome) {
		nomeDoUsuario.sendKeys(nome);
	}
	
	public void inserirSenhaUsuario(String senha) {
		senhaDoUsuario.sendKeys(senha);
	}
	
	public void clicarBotaoLogar() {
		botaoLogin.click();
	}

}
