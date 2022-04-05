/// <reference types="Cypress" />

describe('login Senha Invalida', () => {    
    beforeEach(() => cy.acesso())

    it('efetuando login com cpf válido e senha invalida', () => {
        cy.loginSenhaInvalida()

        cy.get().contains('Dados incorretos. Confira seu usuário e senha e tente novamente')
    });
});