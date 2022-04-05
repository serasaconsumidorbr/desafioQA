/// <reference types="Cypress" />

describe('acesso', () => {
    
    it('acessando home da serasa', () => {
        cy.acesso()

        cy.get('.text-left').contains('Todos os serviços da Serasa. Um só lugar.');
  
    });
  });