Feature: Registration

Scenario: Registration into the page
Given I navigate to the website
When User enters valid data

| Fields  	| Values |
| FirstName | Viveka |
| LastName  | varthini |
| phone 	| 8737821982 |
| email  	| vive99@gmail.com |
| Address   | 2,Abc stree |
| City 		| cbe |
| State		| Tamil Nadu |
| pin 		| 580432 |
| country	| INDIA |
| userName	| vivekavarthini |
| password	| vive5793 |
| confirmPassword| vive57935 |
Then Registration should be done