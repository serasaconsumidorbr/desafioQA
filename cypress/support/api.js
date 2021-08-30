///<reference types="cypress" />

import login from "../fixtures/login.json"

Cypress.Commands.add('realizeLoginInAPIWithFail', (cpf) => {
    cy.request({
        method: 'POST',
        url: 'https://api-auth.serasa.com.br/v1/user/cpf',
        failOnStatusCode: false,
        body: {
            cpf: cpf
        }
    }).then(res => {
        expect(res.status).eq(400)
        expect(res.body.errorCode).eq("error.datadome")
    })
})

Cypress.Commands.add('realizeLoginInAPI', (cpf) => {
    cy.request({
        method: 'POST',
        url: 'https://api-auth.serasa.com.br/v1/user/cpf',
        failOnStatusCode: false,
        body: {
            cpf: cpf
        }
    }).then(res => {
        expect(res.status).eq(200)
        expect(res.body.errorCode).eq("error.datadome")
    })
})

Cypress.Commands.add('realizeRegisterWithFailInDatadome', () => {
    cy.request({
        method: 'POST',
        url: "https://api-auth.serasa.com.br/v1/user",
        failOnStatusCode: false,
        body: {
            "email": "Ruggero_Santos8@hotmail.com",
            "cpf": 43343623628,
            "name": "Adonias Martins",
            "birth_date": "1994-07-15",
            "password": "teste7496",
            "terms": true,
            "prefs_se": "kWa44j1eJNlY5BSo9z4ofjb75PaK4Vpjt.gEngMQEjZr_WhXTA2s.XTVV26y8GGEDd5ihORoVyFGh8cmvSuCKzIlnY6xljQlpRDv9htWBJpaQhvLG9mhORoVidPZW2AUMnGWVQdgMVQdg1kzoMpwoNJ9z4oYYLzZ1kzDlSgyyITL5q8sgEV18u1.BUs_43wuZPup_nH2t05oaYAhrcpMxE6DBUr5xj6Kkvgera3lILOirhO3f9p_nH1x350.opxUC54bYTIDLSI6KbKhrpwoNSUC56MnGWpwoNN5uQ084akJ1H3dcH3dHrk8j29S1.tHore9zH_y3Cmd.1wcDclr2Rea1xL4SIcTdmcK4wdbuZjpSQe2ReF.j92fRcFg5v25CljQlpRxvEWMZyr6U5lY6RjNNlY52EfQkBMPmVrTffwHbIye4GUApUeHzJfyaCBBOQeWN9Ds1em_bucR.HxFs.aAqkSK52VbKN9VD0Cqut.jJ291Sp_evrW55uKXVFCowr1zUcfbrRAxyXiUSoDUNmlFCLH2Vmoz4XOwZdZVLkvjcger92XlF4XVA4.L901gJ.elF1dukf4.__.gJ2MnGmRgJ2MnGmRgJ.eFmf4.9Z.4XV4h_L90G0VFCCicVrRvw0Bpitrf4.m_ADmumng.RcTq.9IIg4MEuiUs8ozv00ZFbxLNiPDCI86xyAB5v8B8YSYIz0qetHs.p1L28CH6.afJ69L6fJ9KLPDCI86xyAB4uy.AiI",
            "user_prefs2": "rO0ABXNyACdjb20udGhlNDEuY29tbW9ucy5jcnlwdG8uQ3J5cHRvRW52ZWxvcGUAAJbgqPhc8wIAA0wABWFsaWFzdAASTGphdmEvbGFuZy9TdHJpbmc7WwAMZW5jcnlwdGVkS2V5dAACW0JbABBlbmNyeXB0ZWRQYXlsb2FkcQB-AAJ4cHQABGhkaW11cgACW0Ks8xf4BghU4AIAAHhwAAACACfsOa7-Yh_Inx7rcaPU8aRPpTivzmhfA74TEUat7oLj8C9v5d2dkTOFY61aZwnfXZXSVQgdAhYpVF9Js5cCsJJfHEPhbUfSD1bVT-xN6WArZDVFic2ivcHqnljFrULm9rr3bMEg4ZWInyl9YDzG1kBuNjJlh8CrLMDX7GA7TJRDNW8I26fXgbzkXPwv4L3glasJMf2vg7Z5g_XjQMqkMteoJbnW7Fj5y78sDBgzImWEbWob3CWYqzQASAIn9xwm4fBaIjIF95Wy1Cv7vugE8yUKaPWcl2vPyHmjypm7WGzc9KQeBWgju4-Q28xYknrfaHi7EEq4CirWt1Y21ZDLun9NhhOzYdySMzZCzwToqrSQVaRp-hQdxnweQSZacFWdTzKahuQ6so0ubWhXUq_mL2Pmdg72hvptkXLh7sgukz17HGd3hs9wjDGky5lUsDxGYZ8cicSpbWBlJO6HPCIT26D5yPeyeugsmt26zm39BBLekJ2bJ16CpRtA1g__rhEP42nKWB_NR2JkEFvoD7tpwc8fu66zAWgaccA6wQZ0GndLZst5-TMIgF5vof1xO0H_ZfAfE1KLzBAYmpHWlaU-U_FbQxSoUt66zvEwnRvV60hmT7-lBsesEOAcoJF5s5IED8PdVGXjPhetMg8NnSiJ4xrKvbW5zhHB7Xxw-gDV3-jcdXEAfgAFAAADAIxaO_6YhvGX4hsnkx21VdK6aMwi0zWl5E3YCO-Q1Y3GWKtdQhocFrf_s0PmvY5WWGSRsYN_ntoLnXH3j25YXaF0s8XDQ5hmiwXIN07TidcmR6UAwva2c8jW4w9QgZ6-E3nPLFHLpWVMaQX74t9vrvVrnvNtzuu0pszFbvAkPEaw5EU5ljddYpKDb702vsjBES1qr6iandqBpTgXS8w0BZjqbur3zB7MV0qlYbDTZJ4Whb01lSMH54IuTt-LuSRTDJJHCWgwkyrAwXjaWNExWT3bK07OGVAHYqF26lLaSpGdbiAzziOx4KXL5JcfB2T8b8pziJG_LUabt6PTEjJUziriKMqZNrPpgORPoYNlBlr7Jmr41aizuk-b4xA-d4ZX0IxP7uQpkKqhZK57UEekx2sGkF7Jd8SfJCiZHDioNaUKiq0zNAQdX3cBxGwD9RLVldI7MFUz8MuFhHXLN-I9m6slDseyYG19BVyPvtXvquJ6fO3OoQ2HcRgxPKzRqaOIt1Qj6PMyiAAxYOwET2TKc5nnZx1SVIA9WS-AxbyY0s7U_oQGk-KS7rFQU0N3y6r7_9tLTk_0315aac7cyjh9bd9k9WN0gStlXBbm7-nvXr86OzPbV0FB-eCrv1QnVl9yFQylzGepjFHPT9NsfC9lB_x9e0a9GzE78mcHmsf7etCdhhIzUzUVKqbakNxYJcqBmWBl3ku1zQa7gdAPIUMiYLYUFk_Gkk2R7UP5x3bWxJrVdT82AgLw_RsnR9_lFKey6SZVzskVu0ql_CsoPaSOgo7wbB-3f-bxFz9Vkvot0fB1S6jUKqNmlUBrxVfYaPdYeUV7LJLyF-13w_oQCgH5uc2bqj8-QoqugBIEoAO4PmZkj02A3GwH0epymASvj3_EYDLbkb_TjzFgW5N4yNWZGEG2lI49fIAgVENbm5jNzhvvRHs2OajupqMkMn8La4M-0d8zZ0R4I6x6guGv3unBjeNDdajtn_XZv3XVKJ23qV1-meNIev55TF3BXHGS_C4cbQ"
        }
    }).then(res => {
        expect(res.status).eq(400)
        expect(res.body.properties.reason).eq('Reproved by Datadome')
    })
})