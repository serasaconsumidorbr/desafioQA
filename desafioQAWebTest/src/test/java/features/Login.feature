#language: pt

  @login
  Funcionalidade: Login

     @loginValido
      Cenário: Login usuario valido
      Dado que estou no site
      Quando faco o login com CPF valido
      Então valido a tela inicio

      @loginInvalido
      Cenário: Login usuario invalido
      Dado que estou no site
      Quando faco o login com CPF invalido
      Então valido a mensagem de CPF invalido