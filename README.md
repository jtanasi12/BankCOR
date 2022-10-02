# BankCOR

A bank system that allows users to add multiple checking/savings accounts and credit accounts. 
We have a CheckProcessors method we call when a customer has to make a deduction and pay off a check.
The customer can decide the order of accounts the Checkprocesor will deduct from until the request has been made.
If the total amount is unavaiable across all accounts we throw an exception and don't deduct any money. 
