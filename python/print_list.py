"""how to print items of a list in a function """


n = [3, 5, 7]
#function start here
def print_list(x):
    for i in range(0, len(x)):
        print x[i]
#calling the function
print_list(n)
