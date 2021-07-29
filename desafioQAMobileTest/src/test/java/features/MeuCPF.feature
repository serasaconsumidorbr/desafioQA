#language: pt


  Funcionalidade: Meu CPF

  @meuCPF
  Cenário: Consulta dívidas negativadas
    Dado que estou na tela de login
    Quando insiro dados corretos
    E clico na aba meu CPF e dividas negativas
    Então valido que nao possuo dividas negativas