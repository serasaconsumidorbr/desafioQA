@regression
Feature: Sign up flow

  Background: User is not a customer yet
		Given I navigate through the onboarding screens

  Scenario: Sign up a new customer
  	Given I input the CPF "29938706029"
  	When I submit the form with valid data
  	Then Should display the title "Crie sua senha" 
  
  Scenario: Input an invalid CPF
  	Given I input the CPF "1255699"
  	Then Should display the input error message "Digite um CPF válido"
  
  Scenario: Input a birthday under eighteen years old
  	Given I input the CPF "29938706029"
  	When I submit the form with the birthday "08112019"
		Then Should display the sign-up error "Você precisa ter mais de 18 anos"	
		
 Scenario: Input an invalid birthday
  	Given I input the CPF "29938706029"
  	When I submit the form with the birthday "36082001"
		Then Should display the sign-up error "Data inválida"	
