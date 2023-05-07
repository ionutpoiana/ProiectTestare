Feature: Test watchlist and search pages

  Background: Preconditions: user already has an IMDb account and Signs in
    Given Access "https://www.imdb.com" website
    Then Click "Watchlist" from header
    Then Click "Sign in with IMDb" button
    Then Enter Email "ne2ion@yahoo.com"
    Then Enter Password "Btqb9evBc-8m-HK"
    Then Select Keep me signed in
    Then Click on Sign in button

  Scenario: Create a new list
    Then Click "Create a new list" from top-right side
    Then Fill List Title "Automation Test"
    Then Fill List Description "this is a test watchlist"
    Then Select Type of List "Images"
    But Select Type of List "Titles"
    Then Click the "CREATE" button

  Scenario: Use search function, find a given title and add it to Watchlist using + button
    Then Use the "Search IMDb" section from header and search for "Iron Man"
    Then Select "Iron Man" title
    Then After the title page is loaded, add the title to Watchlist
    Then Use the "Search IMDb" section from header and search for "Omul de fier"
    Then Select "Omul de fier" title
    Then After the title page is loaded, add the title to Watchlist
    Then Use the "Search IMDb" section from header and search for "Guardians of the Galaxy Volume 3"
    Then Select "Guardians of the Galaxy Volume 3" title
    Then After the title page is loaded, add the title to Watchlist

  Scenario: Edit Watchlist and delete two titles
    Then Enter Edit mode
    Then Select titles numbers 1, 2, 5 to delete
    Then Delete items
    Then Click the "Done" button

  Scenario: Use search function, find a given title then remove it from Watchlist
    Then Use the "Search IMDb" section from header and search for "Iron Man"
    Then Select "Iron Man" title
    But After the title page is loaded, remove the title from Watchlist
    Then Use the "Search IMDb" section from header and search for "Omul de fier"
    Then Select "Omul de fier" title
    But After the title page is loaded, remove the title from Watchlist



