from sys import argv

script, input_file = argv
#this function takes one parameter and all it dose is it read file
def print_all(f):
    print f.read()

#i am not sure about rewind ,but seek it determian the pointer position when writing or reading file in this case  we are telling the function " when you rewind statrt ate the beginning of the file", thats right the defualt plase of the pointer is ate the beginning , though we have done oparation before rewind was called and we have moved fro the defualt position
def rewind(f):
    f.seek(0)

# this function it takes two parameters and  all it dose it print
# the first parmeter and the f.readline function , which is reading line
def print_a_line(line_count, f):
#f.readline() will return it's own '/n' ,to change that add ',' at the end .
    print"this is line", line_count, f.readline(),
# this line is passing value to current_file varible which is the open function that will allow us to access the file that we are passing to it  nd it's empty at this point 
current_file = open(input_file)
print "First let's print the whole file:\n"

#passing current_file varible to function that will print it's value
print_all(current_file)

# this function is returning the pointer to the beginning of the file
print "Now let's rewind, kind of like a tape."
rewind(current_file)
print "Let's print three lines:"
#passing value to current_line variable which represent lines in the file 
current_line = 1
#incrementing current_line value three times meaning in each line it will have different value
print_a_line(current_line, current_file)
current_line +=1
print_a_line(current_line, current_file)
current_line +=1 
print_a_line(current_line, current_file)
