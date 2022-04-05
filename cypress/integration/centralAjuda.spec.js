/// <reference types="Cypress" />

describe('Central de ajuda', () => {    
    beforeEach(() => cy.acesso())

    it('Pesquisar sobre emprestimo na central de ajuda', () => {
        cy.centralAjuda()

        cy.get('#main-content').contains('Resultados de busca');
    });
});