$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Login Valido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "informar usuario \"standard_user\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarUsuario(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\r\n\tat pageObjects.LoginPage.inserirNomeUsuario(LoginPage.java:18)\r\n\tat stepsDefinitions.LoginSteps.informarUsuario(LoginSteps.java:13)\r\n\tat ✽.informar usuario \"standard_user\"(file:src/test/resources/features/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "informar senha \"secret_sauce\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarSenha(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Realizar login no sistema",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.realizarLoginNoSistema()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});