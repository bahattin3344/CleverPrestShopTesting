Feature: All Us
  Background:
    Given Navigate to Clever

    Scenario: Register Account
      And Click on the element in Elements
      | login |
     And User sending the keys in Elements
      | createEmail | bahattin33@gmail.com|
      And Click on the element in Elements
        | createBtn |
      And Click on the element in Elements
        | gender |
      And User sending the keys

      And Click on the element in Elements
        | link1 |
      And Click on the element in Elements
        | sumbitBtn |
      Then Success message should be displayed
      And Click on the element in Elements
        | logOut |

      And User sending the keys in Elements
        | email | bahattin33@gmail.com|
        | password |deniz3344 |
      And Click on the element in Elements
        | sumbitLogin |
        | adress |
        | adressAdd |

      And User sending the keys in Elements
        | adress1 | istanbul|
        | city |istanbul2 |
        | postCode | 34345 |
        | phone | 05544483434 |
        | phoneMobile | 05544483432 |
      And User select state
      And User Select country
      And Click on the element in Elements
        | save |
      And Hover on the element in Woman

      And Click on the element in Elements
        | t_shirt |

     And Click on the iframe add
      And Click on the element in Elements


        | add3Tsirt |
        | add4Tsirt |
        | checkBox |
        | add5Tsirt |
        | pay |
        | payAcces |
        | contact |

      And User select subject,order,product and enter msg
      And Click on the element in Elements
        | msgAccess |