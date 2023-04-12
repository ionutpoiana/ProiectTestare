Feature: Test Sign In buttons

  Background: Preconditions
    Given Access "https://www.imdb.com" website

  Scenario: Test Sign In button from header
    Then Click "Sign In" from header
    
  Scenario: Test Sign In through Watchlist button from header
    Then Click "Watchlist" from header


