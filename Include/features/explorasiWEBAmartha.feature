@tag
Feature: Sebagai user saya bisa explorasi di website amartha

  @tag1
  Scenario Outline: Web exploration
    Given Saya berada pada halaman website amartha
    When 
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |