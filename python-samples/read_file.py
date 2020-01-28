def read_account_number_file(filename):
	with open(filename, "r") as infile:
		return infile.readlines()
