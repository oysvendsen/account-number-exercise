"""
To install the proper dependencies:
sudo apt-get install pip
pip install requests
"""
import requests

def validate(account_number):
	response = requests.get("https://account-number-exercise.herokuapp.com/validate?bban="+account_number)
	print("account-number " + account_number + " is valid? " + bool(response.json()))