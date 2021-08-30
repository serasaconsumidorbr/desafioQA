///<reference types="Cypress" />

import data from "../../fixtures/elements.json"

const faker = require('faker-br');

    const createNewUser = () => {
        let firstName, lastName
        
        firstName = faker.name.firstName(),
        lastName =  faker.name.lastName()
        const name = `${firstName} ` + lastName
        return {
            name,
            email: faker.internet.email(),
            cpf: faker.br.cpf(),
        }
    }
describe('Register tests', () => {
    beforeEach(() => {
        cy.viewport('iphone-x')
        cy.visit(Cypress.config('baseUrl'))
    })
    context('Alternative Flow', () => {

        it('Realize register with fail, incorrect information', () => {
            const user = createNewUser()
            cy.clickInButtonForLogin(data.buttonEntryMobile)
            cy.fillForCreateANewAccount(user.cpf, user.name, '15071994', user.email, 'teste7496')
            cy.get(data.errorMessage).should('have.text', 'Alguma informação parece estar incorreta. Verifique se você preencheu todos os campos corretamente.')
        });
    })
})