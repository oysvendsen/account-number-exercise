n = 10
bank_series_dict = {"1234":("76","83"), "1509":("94",)}
filename = "generated_account_numbers.txt"

with open(filename, "w+") as outfile:
	for bank in bank_series_dict.keys():
		for series in bank_series_dict[bank]:
			for i in range(1,n+1):
				string_i = "{:04d}".format(i)
				outfile.write(bank + series + string_i + "?\n")
				#print(bank + " " + series + " " + string_i)	