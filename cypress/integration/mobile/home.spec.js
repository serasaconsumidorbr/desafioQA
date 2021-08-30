///<reference types="Cypress" />

import data from "../../fixtures/elements.json"

describe('Home tests', () => {
    beforeEach(() => {
        cy.viewport('iphone-x')
        cy.visit(Cypress.config('baseUrl'))
    })
    context('What you need ?', () => {

        it('Consult your CPF', () => {
            cy.get(data.wynConsultYourCPF).click({force:true}).url().should('eq', `${Cypress.config('baseUrl')}/consultar-meu-cpf/`)
            cy.contains('Consultar seu CPF GRÁTIS').should('exist')
        });
    })
})