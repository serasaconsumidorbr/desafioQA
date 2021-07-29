#language: pt

Funcionalidade: Meu CPF

  @meucpf
    Cenário: Consulta dívidas negativadas
    Dado que estou logado
    Quando clico na aba meu CPF e dividas negativas
    Então valido que nao possuo dividas negativas
