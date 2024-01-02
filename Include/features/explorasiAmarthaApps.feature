@testingCallFromFeatureTag
Feature: Sebagai user saya bisa melakukan explorasi pada aplikasi Amartha

  @testingCallFromScenarioTag
  Scenario Outline: Explorasi Amartha Apps
    Given saya membuka aplikasi Amartha
    When saya berada pada halaman awal aplikasi Amartha
    And saya melakukan login email <email> dan password <password> serta memastikan <errorMessage> yang sesuai jika user gagal login
    Then saya sudah selesai melakukan explorasi

    Examples: 
      | email                      | password                 | errorMessage            |
      | MahfudhNaufalUBL@gmail.com | 8SQVv/p9jVTHLrggi8kCzw== | Username/Password Salah |