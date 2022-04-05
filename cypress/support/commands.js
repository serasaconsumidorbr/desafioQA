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
    cy.get('#current-password').type(Cypress.env('senhaInvalida')) ;
    cy.get('.ea-button').click();


});

Cypress.Commands.add('loginCPFInvalido', () => {
    
    cy.get('.ecs_hl_gd > svg').click()
    cy.get('#f-cpf').type(Cypress.env('cpfInvalido'));
       

});

Cypress.Commands.add('centralAjuda', () => {

    cy.get('.ecs_hl_p > :nth-child(1) > .ecs_hl_ab > svg').click();
    cy.get('[href="https://ajuda.serasa.com.br/hc/pt-br"]').click();
    cy.get('#query').click();
    cy.get('#query').type('emprestimo{enter}');
})

