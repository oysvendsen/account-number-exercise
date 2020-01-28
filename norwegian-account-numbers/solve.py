import requests

def validate(account_number):
	response = requests.get("https://account-number-exercise.herokuapp.com/validate?bban="+account_number)
	print("account-number " + account_number + " is valid? " + str(bool(response.json())))
	
def read_account_number_file(filename):
	with open(filename, "r") as infile:
		return infile.readlines()
	
def calc_controll_digit(bban_wo_controlldigit):
	sum = 0
	weights = [5,4,3,2,7,6,5,4,3,2]
	for i in range(len(weights)):
		sum += weights[i]*int(bban_wo_controlldigit[i])
	mod_value = sum % 11
	if mod_value == 0:
		return 0
	elif mod_value == 1:
		print(bban_wo_controlldigit + '-' + " is invalid")
		return -1
	else:
		return 11 - mod_value;

def solve():
	filename = "generated_account_numbers.txt"
	lines = read_account_number_file(filename)
	empty_acc_nums = [line[:10] for line in lines]
	for empty_acc_num in empty_acc_nums:
		controlldigit = calc_controll_digit(empty_acc_num)
		if (controlldigit >= 0):
			validate(empty_acc_num + str(controlldigit))
	
if __name__ == "__main__":
	solve()