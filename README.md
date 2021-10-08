# Java Mortgage Calculator

Beginner Series: Java Calculator for Mortgage Payment and Schedule of installments. 

## Tasks:

1. Program to calculate a Loan or Mortgage Schedule for given Loan Amount, Term in Years and Yearly Interest Rate. 
2. The Program Will calculate the Monthly Payment and Display It. 
3. The Program will also display the amortization table. 

## Solution

1. Prompt the User to enter Loan Amount, Yearly Interest Rate and Term in Years. 
2. Calculate the Loan Payment Amount Using Formula:  (Monthly rate * Amount) / (1 – (1+rate)^-Months)
3. Program will create amortization table like this

Month      Old Balance      Payment     Interest    Principal   New Balance
    1         10000.00       207.58        75.00       132.58       9867.42
    2          9867.42       207.58        74.01       133.58       9733.84
  ...
   12          8485.64       207.58        63.64       143.94       8341.70
