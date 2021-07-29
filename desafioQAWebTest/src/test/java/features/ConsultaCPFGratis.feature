#language: pt

Funcionalidade: Consulta CPF gratis


  @consutaGratis @consultaValido
    Cenário: Consulta CPF grátis valido
    Dado que estou no site
    Quando clico no botao Consultar CPF gratis
    E faco o login com usuario valido
    Então valido meu Score

  @consutaGratis @consultaInvalido
    Cenário: Consuta CPF grátis invalido
    Dado que estou no site
    Quando clico no botao Consultar CPF gratis
    E faco o login com usuario invalido
    Então valido a mensagem de dados invalido