filename = "path/to/sample.txt"
lines = []

with open(filename, "r") as infile:
	lines.append(infile.read())
	
print(lines)