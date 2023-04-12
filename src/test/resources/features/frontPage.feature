Feature: Test front page presentation functionality

  Background: Preconditions: user already has an IMDb account
    Given Access "https://www.imdb.com" website

  Scenario: Add a title from homepage presentation to watchlist
    Then Scroll through front page presentation
    Then Add movie to watchlist