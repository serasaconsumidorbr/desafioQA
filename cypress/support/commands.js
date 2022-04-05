/// <reference types="Cypress" />

Cypress.Commands.add('acesso', () => {

    cy.visit('');
});

Cypress.Commands.add('loginSuccesso', () => {
    
    cy.get('.ecs_hl_gd > svg').click()
    cy.get('#f-cpf').type(Cypress.env('cpfValido'));
    cy.get('.ea-button').click();  
    cy.get('#current-password').type(Cypress.env('senhaValida'))  

});

Cypress.Commands.add('loginSenhaInvalida', () => {
    
    cy.get('.ecs_hl_gd > svg').click()
    cy.get('#f-cpf').type(Cypress.env('cpfValido'));
    cy.get('.ea-button').click();    
    cy.get('#current-password').type(Cypress.env('senhaInvalida')) 


});

Cypress.Commands.add('loginCPFInvalido', () => {
    
    cy.get('.ecs_hl_gd > svg').click()
    cy.get('#f-cpf').type(Cypress.env('cpfInvalido'));
       

});

