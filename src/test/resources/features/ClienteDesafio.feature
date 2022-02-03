#language: pt
#enconding: UTF-8
Funcionalidade: Iteracao do cliente

	Contexto:
		Quando informar usuario "standard_user"
		E informar senha "secret_sauce"
		E Clicar no botao login
		Entao Realizar login no sistema

	Cenario: Utilizar O sistema para comprar 3 itens utilizando filtros 
	Quando clicar no botao do filtro
	E clicar no filtro "Price (low to high)"
	E adicionar no carrinho o item "Sauce Labs Onesie"
	E adicionar no carrinho a mochila "Sauce Labs Backpack"
	E adicionar no carrinho a jaqueta "Sauce Labs Fleece Jacket"
	E sem querer adicionar no carrinho "Sauce Labs Bolt T-Shirt"
	Entao com os itens escolhidos clicar no botao carrinho
	E remover o item "Sauce Labs Bolt T-Shirt" do carrinho
	Entao eu clico no botao "Checkout"
	E informo meu primeiro nome "Gabryel"
	E informo meu ultimo nome "Silva"
	E informo codigo postal "58500000"
	E clico no botao continue
	E clico no botao finish 
	Entao verifico se a compra exibe a mensagem "THANK YOU FOR YOUR ORDER"
	
	Cenario: Cancelamento de compra e teste de campos de envio de compra
	Quando clicar no botao do filtro
	E clicar no filtro "Price (low to high)"
	E adicionar no carrinho o item "Sauce Labs Onesie"
	E com os itens escolhidos clicar no botao carrinho
	Entao eu clico no botao "Checkout"
	E clico no botao continue
	Entao aguardo a mensagem de erro 
	E informo meu primeiro nome "Gabryel"
	E informo meu ultimo nome "Silva"
	E informo codigo postal "58500000"
	E clico no botao continue
	Entao clico no botao cancelar

