///<reference types="Cypress" />

import data from "../../fixtures/elements.json"
import login from "../../fixtures/login.json"
describe('Login tests', () => {
    beforeEach(() => {
        cy.visit(Cypress.config('baseUrl'))
    })
    context('Principal Flow', () => {

        it.skip('Realize Login with success', () => {
            cy.clickInButtonForLogin(data.buttonEntry)
            cy.fillDataForLogin(login.cpf, login.password)
        });

        it.skip('Realize Login to button consult CPF', () => {
            cy.clickInButtonForLogin(data.consultCPF)
            cy.fillDataForLogin(login.cpf, login.password)
        });
    });
    context('Alternative Flow', () => {
        it('Unexpected error in login', () => {
            cy.clickInButtonForLogin(data.buttonEntry)
            cy.fillDataForLoginWithError(login.cpf, login.password)
        });
    });
});