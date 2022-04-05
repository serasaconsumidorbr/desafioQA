# Desafio QA

## O Desafio

### 1. Escolher a plataforma & escrita de cenários

*Foi escolhido a plataforma WEB*

As escritas dos cenários estão descritos no link https://docs.google.com/spreadsheets/d/1KYRMG9O-N64ae4vsULZlciel9wfWlnz8ZgcLHGqyjw0/edit?usp=sharing


### 2. Automação de testes de interface de usuário

*Foram criados testes automatizados para 5 fluxos descritos na planilha acima.
*Foi utilizado o Cypress como framework escrito em Javascript, sendo um dos framworks de automações que cresce bastante, tem uma comunidade ativa e pode ser usado também para testes de API, acredito que hoje é a melhor escolha para automatizações front.

* Para executar a suite de testes deve-se fazer o clone desse projeto, executar o comando "npx cypress open".
* Deve criar um .json na raiz do projeto com o nome "cypress.env.json" e alterar o exemplo abaixo com um login valido do serasa:
{
    "cpfValido": "inserir cpf valido",
    "senhaValida": "inserir senha valida",

    "cpfInvalido": "12345678910",
    "senhainvalida": "12345678"
  }

Dica: **Fazer testes automatizados em plataformas diferentes (Web, Android ou iOS) renderá mais pontos para sua nota**


### 3. Testes de API **(Extra)**

Foi criado dois testes no postman apenas para validar conhecimento.

* Para executar deve-se ter instalado o postman e o newman
* Para acessar deve acessar o link https://app.getpostman.com/join-team?invite_code=748596f2468eeadcab50d78ab0e36c2e&ws=9bf01ba7-4bdd-4450-bcc8-e1c467dc2e85
* Para executar em linha de comando deve exportar a Collection para um diretório e executar o comando "$ newman run SUA_COLLECTION"

Dica: **Fazer testes automatizados renderá mais pontos para sua nota**


### 4. Processo de Submissão e Prazo de entrega

Para o processo de submissão, você deverá seguir os passos abaixo:
1. Você deverá fazer um fork deste repositório (não clonar!)
2. Desenvolva todo seu projeto neste fork
3. Todos commits e alterações deverá ser feita em seu fork
4. Quando tiver tudo pronto, envie um Pull Request para este repositório.

**Você tem 5 dias para concluir e enviar o Desafio.**


### 5. Considerações Finais

Para realiazação dos testes, você pode escolher a linguagem de programação, framework, etc. que você se sentir mais confortável.
Não se esqueça de prover informações detalhadas de como instalar e rodar as suítes de teste.
Vamos considerar e avaliar todas etapas, não tenha medo de errar !
