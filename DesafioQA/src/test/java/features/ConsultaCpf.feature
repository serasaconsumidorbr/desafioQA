# language: pt

@ConsultaCPF
Funcionalidade: Consulta CPF

  @CpfGratis
  Cenário: Consultar o CPF grátis
    Dado que estou no site Serasa
    E clico no botão Consultar seu cpf gratis
    Quando faço login valido
    Então vejo informações da minha conta

