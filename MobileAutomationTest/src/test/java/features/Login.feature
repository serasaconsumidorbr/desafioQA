# language: pt
@FeatureLogin
Funcionalidade: Login

  @login @smoketest
  Cenário: Login com sucesso
    Dado que estou na tela de login
    Quando insiro dados de login válidos
    Então vejo a home

  @login
  Cenário: Login com CPF inválido
    Dado que estou na tela de login
    Quando insiro CPF de login inválido
    Então vejo mensagem de erro