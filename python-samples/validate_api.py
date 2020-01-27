"""
To install the proper dependencies:
sudo apt-get install pip
pip install requests
"""
import requests

response = requests.get("https://account-number-exercise.herokuapp.com/validate?bban=12345678911")

print(bool(response.content))