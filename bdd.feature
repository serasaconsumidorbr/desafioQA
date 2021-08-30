Funcionalidade: Serasa Experian Features

    #Consult your CPF
    #Escolhi esse cenário pois acredito que seja o mais utilizado na plataforma, um usuário que deseja visualizar seu score ou sua situação
    #Clica no primeiro botão que aparece ao entrar no site pois é o que chama mais atenção, digo por experiencia própria com o Serasa hahaha
    Cenário: Consultar seu CPF com sucesso com usuário já cadastrado
        Dado que o cliente já tem um cadastro
        E que ele ainda não está logado
        E ele visitar a página da web
        E clicar no botão de Consultar CPF Grátis
        E inserir o CPF
        E inserir a Senha
        E clicar no botão de Logar
        Quando ele realizar o login
        Então o usuário verá se seu nome está limpo
    
    #Realize Login
    #Além do botão de Consultar CPF Grátis, essa função é necessária como um pré-requisito para qualquer cliente que deseja realizar uma consulta
    Cenário: Login realizado com sucesso
        Dado que o cliente já tem um cadastro
        E que ele ainda não está logado
        E ele visitar a página da web
        E clicar no botão de Entrar
        E inserir o CPF
        E inserir a Senha
        Quando clicar no botão de Logar
        Então o login será realizado com sucesso

    #Realize a registration
    #Clientes novos são importantes para o desenvolvimento da empresa, por isso sempre busco dar bastante atenção para essa feature
    Cenário: Cadastro realizado com sucesso
        Dado que o cliente não tem um cadastro
        E ele visitar a página da web
        E clicar no botão de Entrar
        E clicar no botão de criar uma conta
        E inserir todos os dados necessários
        E aceitar os Termos de Uso
        Quando clicar no botão Criar conta Grátis
        Então seu cadastro será realizado com sucesso

    #Consult your Score
    #Score é um das features do carro forte da empresa, onde os clientes se vêem no mercado, por isso eu estou focando no Score
    #Para garantir que o Score nunca suba com problemas para produção, esse teste será automatizado para garantia de qualidade
    Cenário: Consultar seu Score
        Dado que o cliente já tem um cadastro
        E que ele ainda não está logado
        E ele visitar a página da web
        E clicar no botão de Consultar CPF Grátis
        E inserir o CPF
        E inserir a Senha
        E clicar no botão de Logar
        Quando ele realizar o login
        Então o usuário verá seu score em seu dashboard

    #Consult your wallet
    #Para clientes que recebam ou guardem seu dinheiro com a Serasa, deve ter garantia que sempre conseguiram entrar e consultar seu saldo
    #Por isso foi minha escolha para esse cenário
    Cenário: Consultar seu saldo na carteira
        Dado que o cliente já tem um cadastro
        E que ele ainda não está logado
        E ele visitar a página da web
        E clicar no botão de Consultar CPF Grátis
        E inserir o CPF
        E inserir a Senha
        E clicar no botão de Logar
        E ele realizar o login
        Quando ele clicar no botão do olho
        Então o usuário verá seu saldo na carteira

