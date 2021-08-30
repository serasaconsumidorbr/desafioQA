///<reference types="cypress" />
import api from "../../fixtures/api.json"
describe('Realize tests in API Movies', () => {
    beforeEach(() => {
 
    });

    context('Test in API', () => {
        it('Take authentication Token ', () => {
            cy.takeTokenAccess()
        })

        it('Take authentication Token for Guest', () => {
            cy.takeTokenAccessGuest()
        })
        it.skip('Take session Token', () => {
            cy.takeTokenAccess().then(res => {
                cy.takeTokenSession(res)
                })
        })
        it('API Key Invalid', () => {
            cy.invalidAPIKey()
        })
        it('Get Details about a Movie', () => {
            cy.getDetailsMovies(675445)
        });

        it('rateAMovie', () => {
            cy.takeTokenAccessGuest().then(res => {
                cy.rateAMovie(675445, res)
            })
        })
    });
})