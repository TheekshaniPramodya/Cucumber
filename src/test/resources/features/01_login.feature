Feature: MySLT Portal Comprehensive Navigation

  Scenario: Verify all portal sections in a single session
    Given I open the browser
    And I enter username and password
    When I navigate directly to "broadBand/summary"
    Then the page URL should contain "broadband"
    When I navigate directly to "peoTV"
    Then the page URL should contain "peotv"
    When I navigate directly to "bill/0"
    Then the page URL should contain "bill"
    When I navigate directly to "voice"
    Then the page URL should contain "voice"
    When I navigate directly to "mobile"
    Then the page URL should contain "mobile"
    When I navigate directly to "promotion"
    Then the page URL should contain "promotion"
    When I navigate directly to "add_complaint"
    Then the page URL should contain "complaint"
    When I navigate directly to "broadBand/history"
    Then the page URL should contain "history"
    When I navigate directly to "broadBand/redeemData"
    Then the page URL should contain "redeem"