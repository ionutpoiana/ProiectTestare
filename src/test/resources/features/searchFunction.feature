Feature: Test search functionality
  Background: Preconditions
    Given Access "https://www.imdb.com" website

  Scenario: Test Search functionality
    Then Use the "Search IMDb" section from header and search for "Iron Man"

  Scenario: Test Search suggestions list after writing a movie title
    Then Use the "Search IMDb" section and write "Deadpool"
    Then Select first title


