# Testes Automatizados - Serasa​ :man_technologist: :woman_technologist:

Esse projeto de automação foi criado com a utilização do Selenium WebDriver com Java e Junit e é importante mencionar que toda a sua estrutura está no padrão Page Object.

A suite de teste apresenta três validações sendo elas:

- ***Validar tentativa de cadastro com dados invalidos***
- ***Validar realização login na pagina do Serasa***
- ***Validar acesso ao Histórico do Score na aba Saúde Financeira*** 



#### **Materiais de Apresentação do Projeto:**

1. ***Video 1 - Explicação da estratégia de teste e apresentação dos testes Escritos***

   https://youtu.be/-CUJeqW2gcQ

2. ***Video 2 - Apresentação da Automação criada e explicação da construção***

   https://youtu.be/XrzzRSoPlvQ

3. ***Planilha com a escrita dos testes:***

   https://drive.google.com/file/d/1OsRbwcb_WYcWEhIViziYQTJx4kP9NTEL/view?usp=sharing



#### **Abaixo o que é necessário para rodar o projeto:**

1. IDE: Eclipse

   1. https://www.eclipse.org/downloads/

2. Selenium WEB Driver

3. JAVA e declaração de suas variáveis no sistema

   1. https://openjdk.java.net/projects/jdk/15/

   2. https://www.java.com/pt-BR/download/help/path_pt-br.html

      

#### **Ajustes de diretórios em algumas páginas do projeto e no CSV**

Abaixo irei listar alguns ajustes necessarios referente a diretorios e no arquivo CSV.

**Pages - Alterações** 

1. ***Web Page*** - Alterar no metódo ***createChrome*** o diretorio do driver do navegador para onde o driver do seu navegador esta localizado.
2. ***InformacoesUsuarioTest Page*** - Na variável ***diretorio*** alterar para o diretorio onde você deseja que as evidências sejam salvas.



**CSV - InformacoesUsuarioTest.csv - Alterações**

1. ***testValidaLogin*** - em INSERIR CPF, INSERIR SENHA, INSERIR NOME COMPLETO DO USUARIO
   1. INSERIR CPF - Inserir CPF valido com cadastro ativo para realizar login.
   2. INSERIR SENHA - Inserir Senha valida para realizar o login
   3. INSERIR NOME COMPLETO DO USUARIO - Inserir nome completo apresentado após clicar na sigla do usuario quando realizado o login.
2. ***testHistorico*** - em INSERIR CPF, INSERIR SENHA
   1. INSERIR CPF - Inserir CPF valido com cadastro ativo para realizar login.
   2. INSERIR SENHA - Inserir Senha valida para realizar o login

