/// <reference types="Cypress" />

describe('login CPF inválido', () => {    
    beforeEach(() => cy.acesso())

    it('efetuando login cpf inválido', () => {
        cy.loginCPFInvalido()

        cy.get('.field-error__item').contains('CPF inválido')
    });
});