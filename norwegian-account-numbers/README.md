Norwegian Basic Bank Account Numbers
====================================

Data-file
---------
The file [generated-account-numbers](generated_account_numbers.txt) contains newly generated accountnumber where the controll digits have not been calculated yet. They have '?' instead.

Algortihm
---------
The account number is valid if the weighted digit sum _modulo eleven_ is zero.
The algorithm for calculating the controll digit is described in [this pdf](algoritme_kontrollsiffer_norske_bban.pdf).

_*There are three special rules that the document does not describe*_:
 - if the weighted sum _modulo eleven_ is zero, the control digit is also zero.
 - if the weighted sum _modulo eleven_ is one, the control digit is '-', however this is not allowed for account numbers (print 'invalid' instead or something of the sort).
 - if the 5th and 6th digits are both zero, the account is a NICS account, and the control digits are calculated using a different set of weights. However the testdata does not account for this, so you do not have to worry about this either.
