def read_account_number_file(filename):
	lines = []
	with open(filename, "r") as infile:
		lines.append(infile.read())
	return lines