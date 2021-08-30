///<reference types="cypress" />

import data from "../fixtures/elements.json"
import login from "../fixtures/login.json"

Cypress.Commands.add('clickInButtonForLogin', (element) => {
    cy.get(element).click().url().should('eq', `${Cypress.config('baseUrl')}/entrar?product=portal&redirectUrl=/area-cliente/`)
})

Cypress.Commands.add('fillDataForLogin', (cpf, password) => {
    cy.get(data.continueButton).should('be.visible').and('be.disabled')
    cy.get(data.fillCPF).should('be.visible').type(cpf)
    cy.get(data.continueButton).should('be.enabled').click()
    cy.get(data.labelCPFInPutYourPassword).should('have.text', 'CPF')
    cy.get(data.confirmCPFInPutYourCPF).should('eq', cpf)
    cy.get(data.changeYourCPF).should('be.visible')
    cy.get(data.continueButton).should('be.visible').and('be.disabled')
    cy.get(data.inpurYourPassword).type(password)
    cy.get(data.continueButton).click()
})

Cypress.Commands.add('fillDataForLoginWithError', (cpf, password) => {
    cy.intercept(
        'POST',
        'https://api-auth.serasa.com.br/v1/user/cpf',
        {
            statusCode: 400,
            body: {
                errorCode: 'error.datadome'
            }
        }
    ).as('interceptUnexpectedError')
    cy.get(data.continueButton).should('be.visible').and('be.disabled')
    cy.get(data.fillCPF).should('be.visible').type(cpf)
    cy.get(data.continueButton).should('be.enabled').click()
    cy.wait('@interceptUnexpectedError').its('response').then(res => {
        expect(res.statusCode).eq(400)
        expect(res.body.errorCode).eq('error.datadome')
    })
})

Cypress.Commands.add('fillForCreateANewAccount', (cpf, name, birthDay, email, pass) => {
    cy.contains(data.createANewAccount).click({force: true}).url().should('eq', `${Cypress.config('baseUrl')}/cadastrar?product=portal&redirectUrl=%2Farea-cliente%2F`)
    cy.get(data.buttonCreateAccount).should('be.disabled')
    cy.get(data.newAccountCPF).should('be.empty').type(cpf)
    cy.get(data.newAccountName).should('be.empty').type(name)
    cy.get(data.newAccountBirthDate).should('be.empty').type(birthDay)
    cy.get(data.newAccountEmail).should('be.empty').type(email)
    cy.get(data.newAccountPassword).should('be.empty').type(pass)
    cy.get(data.acceptTerms).click()
    cy.get(data.buttonCreateAccount).should('be.enabled').click()
})