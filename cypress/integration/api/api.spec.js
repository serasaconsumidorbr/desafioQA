///<reference types="cypress" />

import data from "../../fixtures/elements.json"
import login from "../../fixtures/login.json"
describe('Realize tests in API', () => {

    context('Test in API', () => {
        it.skip('Realize Login with success', () => {
            cy.realizeLoginInAPI(login.cpf)
        });
        it('Unexpected Error in Login', () => {
            cy.realizeLoginInAPIWithFail(login.cpf)
        })
        it('Realize register with fail in Datadome', () => {
            cy.realizeRegisterWithFailInDatadome()
        });
    });
})