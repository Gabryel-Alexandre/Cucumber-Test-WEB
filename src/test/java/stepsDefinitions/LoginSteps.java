package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import  static utils.Utils.*;

public class LoginSteps {
	
	@Quando("informar usuario {string}")
	public void informarUsuario(String usuario) {
	   Na(LoginPage.class).inserirNomeUsuario(usuario);
	}

	@Quando("informar senha {string}")
	public void informarSenha(String senha) {
	Na(LoginPage.class).inserirSenhaUsuario(senha);
	}

	@Quando("Clicar no botao login")
	public void clicarNoBotaoLogin() {
	Na(LoginPage.class).clicarBotaoLogar();
	}

	@Entao("Realizar login no sistema")
	public void realizarLoginNoSistema() {
	   
	}


}
