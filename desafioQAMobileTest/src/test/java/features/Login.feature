#language: pt

  @login
  Funcionalidade: Login

    @loginCorreto
    Cenário: Realizo login com sucesso
      Dado que estou na tela de login
      Quando insiro dados corretos
      Então vejo a tela de login

    @loginInvalido
    Cenário: Realizo login sem sucesso
      Dado que estou na tela de login
      Quando insiro usuario incorreto
      Então vejo a mensagem de usuario invalido
