# Desafio QA

## Tecnologias usadas Automação Web:
Maven, Java, Selenium Webdriver, Cucumber, JUnit, Allure.

Foram desenvolvidos os Testes na linguagem Java em um projeto maven para gerenciar as suas dependências, 
usando a ferramenta Selenium WebDrive para mapear os elementos e usar suas funcionalidades, para facilitar o desenvolvimento 
é utilizado a metodologia BDD com o Cucumber, rodando os testes unitários através do JUnit e formando os status reports pelo Allure. 

### Cenarios em BDD e automatizados:
* Login
* Consultar o CPF grátis
* Entenda seu Serasa Score
* Ver Histórico Score
* Ver todas as faixas Score
* Compromisso com crédito Score


**Observações importantes:**

Mudar variáveis na classe Utils 

* USUARIO = "$SEU_USUARIO"

* SENHA = "$SUA_SENHA";

* PATH do chromeDriver $SEU_CAMINHO


## Testes de API REST

RestAssured e Schema.

RestAssured para realizar os testes de contratos automatizados validando os json de Schemas das API's movie, tv e person.

**Observações importantes:**

Mudar variáveis na Interface Constantes 

* Key para $SUA_KEY


###  IDE utilizada:

IntelliJ IDEA CE


### Informações sobre as ferramentas.

Usar JDK- 1.8
Java e Maven instalados com variáveis ambientes devidamente configuradas


### Execução:
Allure: mvn allure:serve

Testes automatizados: Para rodar selecione a feature desejada e de play

