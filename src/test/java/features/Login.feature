Feature: Orange HRM Application Login 

@smoke
Scenario Outline: TC01 Login Functionality
Given Enter the username as <username>
And Enter the Password as <password>
When Click on Login
Then Dashboard Page displays

Examples:
|username|password|
|Admin|admin123|
|Admin|admin123|


