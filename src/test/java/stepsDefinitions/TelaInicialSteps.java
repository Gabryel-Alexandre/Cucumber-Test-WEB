package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import  static utils.Utils.*;
public class TelaInicialSteps {
	
//Steps de Filtro 
@Quando("clicar no botao do filtro")
public void clicarNoBotaoDoFiltro() {
   Na(TelaInicialPage.class).clicarFiltroGeral();
}

@Quando("clicar no filtro {string}")
public void clicarNoFiltro(String string) {
   Na(TelaInicialPage.class).clicarFiltroLowToHigh();
}

@Entao("deve ser exibidos os produtos na ordem de menor preco para maior preco")
public void deveSerExibidosOsProdutosNaOrdemDeMenorPrecoParaMaiorPreco() {
   
}



//


@Quando("adicionar no carrinho o item {string}")
public void adicionarNoCarrinhoOItem(String string) {
   Na(TelaInicialPage.class).clicarNaCamisa();
}

@Quando("adicionar no carrinho a mochila {string}")
public void adicionarNoCarrinhoAMochila(String string) {
	 Na(TelaInicialPage.class).clicarNaMochila();
}

@Quando("adicionar no carrinho a jaqueta {string}")
public void adicionarNoCarrinhoAJaqueta(String string) {
	 Na(TelaInicialPage.class).clicarNaJaqueta();
}

@Quando("sem querer adicionar no carrinho {string}")
public void semQuererAdicionarNoCarrinho(String string) {
	 Na(TelaInicialPage.class).clicarNaCamisaEngano();
}

@Entao("com os itens escolhidos clicar no botao carrinho")
public void comOsItensEscolhidosClicarNoBotaoCarrinho() {
	 Na(TelaInicialPage.class).clicarNoCarrinhoDeCompras();
}

}
