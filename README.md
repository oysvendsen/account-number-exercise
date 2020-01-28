account-number-exercise
=======================

The purpose of this exercise is to calculate the correct controldigit that goes on the end of a norwegian Basic Bank Account Number.
Rules for the algorithm along with the exercise data is found in the subfolder [norwegian-account-numbers](norwegian-account-numbers).
To check if you calculated the correct account number, you must query a rest api. 
Sample code for how to query the rest api and read the file can be found in "python-samples"

Instructions
------------
 1. Read the txt-file in [norwegian-account-numbers](norwegian-account-numbers/).
 2. Calculate the appropriate controldigit for each accountnumber and replace the '?' in the account-number.
 3. Query the rest api to check that the control digit is correct.
 4. If a control digit cannot be calculated for the given account number; declare that it is invalid.
