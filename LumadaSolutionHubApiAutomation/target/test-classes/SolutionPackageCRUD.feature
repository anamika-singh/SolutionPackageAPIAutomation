Feature: Solution Package CRUD API
  @Tag
  Scenario: User makes call POST method to register solution package
    When User register solution package 
    Then User receives status code of 200
    And User receives solution package "id"
    When User edit solution package "id"
    Then User receives status code of 200
    And User receives solution package "id"
    When User delete solution package "id"
    Then User receives status code of 200
    And User verify success message "Solution package deleted successfully"
  
  