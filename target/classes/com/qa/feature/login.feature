
Feature: FreeCRM Application
 
 
  Scenario: Validate FreeCRM Page 
    Given User opens browser
    And User on browser
    When User enter uname and pwd
    And home page is displayed
    
Scenario: Validate HomePage
		Given user on loginpage
		Then  Login  user 
		And   user on  homepage
		Then  validate current user
		Then  click on contacts
		
		
		@tag2
Scenario: Contact Page Form
Given User is on homepage
Then Get homepage title
Then Enter user details
|fname | Mname | Lname | CompanyName | id             | Position | Department |Category | Status |
|shital| Ravi  | Bade   | Infy       | abc @gmail.com | HR       | DRR        | High     | Pass   |
Then User Clic on save button


Scenario: Company Page Form
Given User is on HomePage
Then User get Search Methods
Then User find Company details
| name  | address | ZipCode | state       | city |
|Shital | Bavdhan | 411013  | Maharashtra | Pune |

Then User Find remaing company details
| Description          | Industry | EmployeeID | AnnualRvenue  | VatNumber |
| This is IT comapny   | Software | 123457     | 23455697868   | 678909875 |
Then ClicK on save button





 

  