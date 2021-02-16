# language: pt
@FeatureLogin
Funcionalidade: Login na aplicação

  @login @test
  Cenário: Realizar login com sucesso
    Dado que estou na tela de login
    Quando faço login com dados válidos
    Então vejo a tela de início

  @loginInvalido
  Cenário: Realizar login com CPF inválido
    Dado que estou na tela de login
    Quando faço login com CPF inválido
    Então vejo mensagem de usuário inválido

  @logout
  Cenário: Realizar logout da aplicação
    Dado que estou logado na aplicação
    Quando faço logout
    Então vejo a tela de login

