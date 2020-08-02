Feature: Musicas

    Background:
        * url baseUrl

    Scenario: Buscar todas as musicas
        Given path '/songs'
        When method GET
        Then status 200
        And match $ == read('songs-get-all.json')

    Scenario: Buscar Bohemian Rhapsody
        Given path '/songs/1'
        When method GET
        Then status 200
        And match $ == read('songs-get-one.json')
