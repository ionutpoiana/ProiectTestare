Feature: Test Sign In page

  Background: Preconditions: user already has an IMDb account
    Given Access "https://www.imdb.com" website
    Then Click "Sign In" from header

  Scenario: Test Sign in with Amazon
    Then Click "Sign in with Amazon" button

  Scenario: Test Sign in with Google
    Then Click "Sign in with Google" button

  Scenario: Test Sign in with Apple
    Then Click "Sign in with Apple" button

  Scenario: Test Sign in with IMDb acount
    Then Click "Sign in with IMDb" button
    Then Enter Email "ne2ion@yahoo.com"
    Then Enter Password "Btqb9evBc-8m-HK"
    Then Select Keep me signed in
    Then Click on Sign in button
