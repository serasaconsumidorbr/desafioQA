///<reference types="cypress" />

Cypress.Commands.add('takeTokenAccess', () => {
    cy.request({
        method: 'GET',
        url: `https://api.themoviedb.org/3/authentication/token/new?api_key=${Cypress.env('apiKeyMovies')}`,
        failOnStatusCode: false
    }).then((res) => {
        expect(res.status).eq(200)
        expect(res.body.success).eq(true)
        expect(res.body.request_token).exist
        return res.body.request_token
    })
})

Cypress.Commands.add('takeTokenAccessGuest', () => {
    cy.request({
        method: 'GET',
        url: `https://api.themoviedb.org/3/authentication/guest_session/new?api_key=${Cypress.env('apiKeyMovies')}`
    }).then(res => {
        expect(res.status).eq(200)
        expect(res.body.success).eq(true)
        expect(res.body.guest_session_id).exist
        return res.body.guest_session_id
    })
})
Cypress.Commands.add('takeTokenSession', (token) => {
    cy.request({
        method: 'POST',
        url: `https://api.themoviedb.org/3/authentication/session/new`,
        failOnStatusCode: false,
        qs: {
            api_key: Cypress.env('apiKeyMovies')
        },
        body: {
            request_token: token
        }
    }).then((res) => {
        console.log(res)
    })
})

Cypress.Commands.add('invalidAPIKey', () => {
    cy.request({
        method: 'GET',
        url: `https://api.themoviedb.org/3/authentication/token/new?api_key=432432432432}`,
        failOnStatusCode: false
    }).then((res) => {
        expect(res.status).eq(401)
        expect(res.body.success).eq(false)
        expect(res.body.status_code).eq(7)
        expect(res.body.status_message).eq("Invalid API key: You must be granted a valid key.")
    })
})

Cypress.Commands.add('getDetailsMovies', (idMovie) => {
    cy.request({
        method: 'GET',
        url: `https://api.themoviedb.org/3/movie/${idMovie}?api_key=${Cypress.env('apiKeyMovies')}&language=en-US`
    }).then(res => {
        expect(res.status).eq(200)
        expect(res.body.adult).false
        expect(res.body.id).eq(idMovie)
        expect(res.body.original_title).eq("PAW Patrol: The Movie")
        expect(res.body.genres[0].name).eq('Animation')
        expect(res.body.genres[1].name).eq('Family')
        expect(res.body.genres[2].name).eq('Adventure')
        expect(res.body.genres[3].name).eq('Comedy')

        console.log(res.body)
    })
})

Cypress.Commands.add('rateAMovie', (movie_id, guest) => {
    cy.request({
        method: 'POST',
        url: `https://api.themoviedb.org/3/movie/${movie_id}/rating`,
        failOnStatusCode: false,
        headers: {
            "Content-Type": "application/json;charset=utf-8"
        },
        qs: {
            "api_key": Cypress.env('apiKeyMovies'),
            "guest_session_id": guest
        },
        body: {
            "value": "8.5"
        }
    }).then((res) => {
        expect(res.status).eq(201)
        expect(res.body.success).true
        expect(res.body.status_code).eq(1)
        expect(res.body.status_message).eq('Success.')
    })
})