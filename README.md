# Serasa Consumidor - Teste para QA
 
O objetivo deste teste é verificar suas habilidades de resolução de um problema e avaliar suas escolhas. Para isso você receberá um problema simples onde poderá mostrar suas técnicas.
 
Nós encorajamos você a exagerar um pouco na solução para mostrar do que você é capaz.
 
Considere um cenário em que você esteja construindo uma solução, onde outros QA’s precisarão trabalhar e manter essa solução ao longo do tempo. 
 
Na entrevista de "revisão", esteja preparado para responder algumas perguntas sobre a solução adotada.
Como e por que você as escolheu e com quais outras alternativas você está familiarizado, serão algumas dessas perguntas.
 
## Problema:
 
Você possui um marketplace de produtos financeiros. A disponibilização desses produtos ocorre por meio de integrações com várias instituições financeiras através de microservices.
Esses microservices acessam uma base de dados previamente cadastradas pelas instituições financeiras.
Para que um produto seja exibido no seu marketplace você precisa ao menos que um dos parceiros te envie os dados para realizar cadastro prévio em dois locais distintos.
Em algum momento esses dados não são disponibilizados pelas instituições financeiras, impossibilitando que esse produto seja exibido no seu marketplace.
 
Considerando o problema descrito acima, qual solução você daria para que a dependência dos dados enviados pelas instituições financeiras não fosse um problema?

Qual arquitetura de testes você implantaria de forma que poderia ser integrada ao SDLC?
Obs: Considere que o framework utilizado para o SDLC é o scrum.

Que técnicas de testes e qualidade poderiam ser aplicadas nesse cenário para que a qualidade de novas features de seu marketplace não fossem afetadas?


## Respostas
Para suportar o problema descrito acima, optaria em utilizar o padrão Saga por Orquestração. 
O padrão Saga implementa cada transação financeira que abrange vários serviços como uma saga. Uma saga é uma sequência de transações locais. Cada transação local atualiza o banco de dados e publica uma mensagem ou evento para acionar a próxima transação local na saga. 
Se uma transação local falhar porque viola uma regra de negócios, a saga executa uma série de transações de compensação que desfazem as alterações feitas pelas transações locais anteriores.

Utilizaria as seguintes estratégias/abordagens de testes: Testes Unitários, Integração, Componentes, Contrato e talvez End-To-End.

 - Testes Unitários: utilizados para testar parte isoladas (uma única classe ou seu conjunto). Facilita testes como Happy and Unhappy path, Comportamento, logica, etc. 
 "Adapters" podem ser incluidos nesta etapa, sendo executados utilizando o auxílio de "objetos mock" - Nem sempre os dados recebidos são tratados da mesma maneira, garantir que as informações estão sendo utilizadas de maneira correta (ex: Recebo nome e sobrenome e trato como Nome completo).
 Utilizar principios de TDD (Test Driven-Development).
 
 - Testes de Integração: Teste para multiplos serviços integrados (valida a comunicação entre os serviços). Valida os fluxos principais e alternativos (utilizando requisições HTTP)com base nas respostas que serão fornecidos por cada um;
 Utiliza ferramentas que permitem validar os testes de Integração focados nas chamadas dos serviços REST (REpresentation State Transfer), verificando se eles estão respondendo de forma adequada as respectivas chamadas e os retornos produzidos pelas mesmas.
 
 - Testes de Componente: utilizados para testar as funcionalidades completas de um único microserviço. Chamadas utilizadas para solicitar os serviços externos são simuladas (objetos mock). 
 Pode também, validar como partes interdependentes, podem funcionar caso sejam chamados de forma isolada ou integrados a outros serviços;
 Podem ser utilizadas ferramentas que permitem simular as latencias/media de consumo da API e falhas de comunicação entre as mesmas.
 
 - Testes de Contrato: utilizados para testar os acordos/contratos estabelecidos para o consumo dos serviços das APIs e outros recursos que são fornecidos pelos microserviços. 
 Os teste verificam se os componentes desenvolvidos estão conseguindo consumir os serviços conforme as regras estabelecidas pelo contrato;
 
 - Testes End-To-End (User Interface Testing): utilizados para testar o fluxo completo de um sistema de microserviços, tem como principal objetivo verificar se todos os critérios de aceitação estão cobertos e contemplados por todos os serviços, buscando testar o sistema por inteiro, de ponta-a-ponta (este tipo de teste é o que se aproxima muito do chamado teste Funcional na abordagem tradicional).
 Por ser um teste mais caro (pois leva mais tempo para ser feito e não garante que todos os possíveis bugs serão encontrados) é preciso aaliar até onde sua execução é válida.

