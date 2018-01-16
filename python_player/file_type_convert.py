ffile = open("myfile.txt", "w+")
for line in ffile:
  splitted_line = line.split(' ')
  for values in splitted_line:
    value_as_int = int(values)
    ffile.write(value_as_int)
print(ffile.read())    
