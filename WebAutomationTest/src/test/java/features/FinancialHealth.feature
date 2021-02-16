# language: pt
@FeatureFinancialHealth
Funcionalidade: Consultar Saúde financeira

  @financialHealth @test
  Cenário: Acessar Saúde financeira
    Dado que estou na tela de início
    Quando toco em Saúde financeira
    Então vejo meu Score e histórico de pagamentos

  @financialHealth
  Cenário: Consultar motivos que aumentam
    Dado que estou na tela de saúde financeira
    Quando toco em Motivos que Aumentam
    Então vejo os fatores que estão fazendo meu Score aumentar

  @financialHealth
  Cenário: Consultar motivos que Diminuem
    Dado que estou na tela de saúde financeira
    Quando toco em Motivos que Diminuem
    Então vejo os fatores que estão fazendo meu Score diminuir