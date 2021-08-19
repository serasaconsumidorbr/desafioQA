# Desafio QA Serasa

**Tecnologias utilizadas**

**Maven, Java, Selenium, Appium, Cucumber, JUnit, Allure e RestAssured.**

>Selenium-IDE é uma ferramenta de testes funcionais Web que utiliza o JavaScript Functional Test Runner, um framework que executa na página a ser testada, a fim de automatizar essa tarefa.

>Appium é uma ferramenta open-source utilizada para automação de testes funcionais mobile em plataforma IOS e Android.

>Maven para gerenciar dependências do projeto e executar testes
>RestAssured para testar as requisições REST

>JUnit é utilizado executar para os testes unitários, verificar classes e métodos

>gson ou org.json para conversão de objetos java em representação JSON

>Cucumber para descrever o valor do negócio em uma linguagem natural

>Allure para gerar status report dos testes executados

**IDES utilizadas**
+ Eclipse IDE
+ IntelliJ IDEA CE

**Demais ferramentas**
+ Postman
+ Android Studio

- Instalar o Maven, seja manualmente ou via homebrew com o comando: 
`brew Install maven`
- Trocar a JRE System Library para JavaSE-1.8 para evitar erros nas dependências do pom.xml
- Injetar as dependências no pom.xml
- Ter o Java 8 e o Maven instalado com as variáveis de ambiente configuradas 

*O terminal ficará mais ou menos assim:*

``` js
alias ls='ls -Gh'

export JAVA_HOME=$(/usr/libexec/java_home -v1.8)
export ANDROID_HOME=~/Library/Android/sdk
export M2_HOME=/usr/local/Cellar/maven/3.6.3
export M2=$2_HOME/bin
export PATH=$M2:$PATH
export PATH="/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin"

PATH=$PATH:$ANDROID_HOME/platform-tools
PATH=$PATH:$ANDROID_HOME/tools
PATH=$PATH:$ANDROID_HOME/tools/bin
PATH=$PATH:$ANDROID_HOME/tools/lib

export PATH 
```

___ 
--- 
*** 


## Testes de API REST

- Remover a tag <scope>test</scope> do JUnit no pom.xml assim ele usará a Scope compile por padrão
- Executar os testes com “Run As > JUnit Test”

**Rotina dos testes na API**
- Autenticar com API Key e gerar um request_token
- Teste de contrato do filme “Mad Max”
- Validar o login com o novo request_token
- Autenticar a sessão com o request token gerando um session_id
- Finalizar a sessão utilizando o session_id

___ 
--- 
*** 

## Automação Front-End Web

- Necessário já ter uma IDE com plugin do Cucumber, **os drivers no framework precisam estar compatíveis com os navegadores que serão utilizados durante os testes**.
- **Colocar as credenciais de login nas variáveis em:** `src/test/resources/config.properties`
- Executar os testes com:
`mvn clean -Dbrowser=DRIVE_MAC -Dcucumber.options="--tags @FeatureTag” -Denv.ENVIROMENMENT=ENVIRONMENT test`

Exemplo:
`mvn clean -Dbrowser=CHROME_MAC -Dcucumber.options="--tags @FeatureLogin" -Denv.ENVIROMENMENT=PRD test`

___ 
--- 
*** 

## Automação Android Front-End Mobile

- Ter instalado o Android Studio
- Configurar um dispositivo virtual e escolher a versão de sistema do mesmo no AVD Manager/SDK Platforms(ou utilizar um device físico se preferir)
- Configurar as Capabilities do dispositivo
- Utilizar o comando `adb devices`para ve o udid dos devices conectados
- Instalar as ferramentas (SDK Tools)

**Inserir as credenciais de Login nas variáveis validCPF e validPassword em:** `src/test/java/screen/LoginScreen`

- Executar os testes com: 
`mvn clean test -Dcucumber.options="--tags @FeatureTag” -Ddev.DEVICE=DEVICE -Denv.ENVIROMENMENT=ENVIRONMENT`

Exemplo:
`mvn clean test -Dcucumber.options="--tags @smoketest" -Ddev.DEVICE=ANDROID -Denv.ENVIRONMENT=PRD`

___ 
--- 
*** 

## Allure Report

- Executar o comando após rodar a suite de testes:
  `mvn allure:serve`

___ 
--- 
*** 

### Referencias:

- [Maven Dependency Scopes](https://howtodoinjava.com/maven/maven-dependency-scopes/)

- [Instale o Homebrew](https://brew.sh/index_pt-br)

- [The Movie Database API](https://developers.themoviedb.org/4/getting-started/authorization)

- [Getting started - Appium](https://appium.io/docs/en/about-appium/getting-started/)

- [Appium server arguments](http://appium.io/docs/en/writing-running-appium/server-args/)

- [Cucumber Reference](https://cucumber.io/docs/cucumber/api/)

- [Markdown-it Github.io](https://markdown-it.github.io/)

- [How to preserve insertion order in Hashmap](https://stackoverflow.com/questions/10710193/how-to-preserve-insertion-order-in-hashmap)

- [Hashmap put(), is it always ordering?](https://stackoverflow.com/questions/36026761/hashmap-put-is-it-always-ordering/36027011#:~:text=HashMap%20has%20no%20inherent%20ordering,9)

