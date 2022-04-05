/// <reference types="Cypress" />

describe('login Successo', () => {    
    beforeEach(() => cy.acesso())

    it('efetuando login com sucesso', () => {
        cy.loginSuccesso()

        
    });
});