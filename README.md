# Desafio QA

## Objetivo do Desafio
A proposta deste Desafio é analisar as suas habilidades em conceber cenários de testes, programação e boas práticas necessárias para automatização dos testes.
Vamos considerar e avaliar todas etapas, então faça com calma e não tenha medo de errar ! Caso tenha dúvidas referentes ao Desafio, sinta-se a vontade para entrar em contato com nosso time de QA's.
Você terá liberdade para escolher a linguagem de programação e ferramentas utilizadas na automatização dos testes.
Atenção para as **Dicas** de cada etapa, não são obrigatórias mas podem somar mais pontos no desafio.
A terceira parte do Desafio não é obrigatória mas também soma mais pontos no desafio.



## O Desafio

### 1. Escolher a plataforma & escrita de cenários

Nós da Serasa estamos nos mais diversos canais digitais.
Nesta primeira parte do desafio, você deverá:
* escolher a plataforma de sua preferência, seja ela **Web(https://www.serasa.com.br/), Android/iOS**.: Web e Android
* escrever ao menos 5 cenários de teste em **BDD**.
* explicar e detalhar o porquê escolheu esses cenários. 


Dica: **Escolher mais de uma plataforma renderá mais pontos para sua nota**
Dica: **Escrever mais cenários de teste renderá mais pontos para sua nota**

Cenários escritos em: Desafio QA\cypress\integration\cenarios.feature e Desafio QA\cypress\integration\cenarios_mobile.feature

O cenário que mais gostaria de automatizar era o de cálculo do Score, porém, por não ter acesso a mais dados de como o cálculo é realizado e também não ter acesso à um banco de dados de teste, acabei focando em logar, navegar pelas páginas e cadastrar.
Durante os testes comecei a enfrentar um erro com a mensagem  "Ops, ocorreu um erro no sistema. Por favor, tente novamente em alguns minutos." após informar o número do CPF.

### 2. Automação de testes de interface de usuário

Nesta etapa, você precisa criar uma suite de testes automatizada para pelo menos 3 dos cenários que foram escritos na primeira parte deste desafio, em suas respectivas plataformas.
* explicar e detalhar as decisões que você tomou (exemplo: o porquê escolheu determinada linguagem de programação, framework etc). 
* Em seu README, detalhar como realizar as configurações necessárias para rodar o projeto em nossa máquina local.

Dica: **Fazer testes automatizados em plataformas diferentes (Web, Android ou iOS) renderá mais pontos para sua nota**


Automação realizada com Cypress, pois me pareceu de fácil implementação, levando em consideração que não atuo com automação no momento, e me pareceu ter uma curva de aprendizagem menor. Ia implementar também integração com Cucumber, para fazer o link com os cenários em BDD e a automação, mas devido ao tempo escasso e problemas com os testes, decidi manter os testes simples.


### 3. Testes de API **(Extra)**

Esta última etapa do Desafio não é obrigatória, mas rende pontos extras.
Você deve criar uma suite de testes (automatizada ou não) com a API de filmes: https://www.themoviedb.org/
* Tente focar em cenários críticos, focando em testes de contrato.
* explicar e detalhar as decisões que você tomou (exemplo: o porquê escolheu determinada linguagem de programação, framework etc). 
* Em seu README, detalhar como realizar as configurações necessárias para rodar o projeto em nossa máquina local.

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
