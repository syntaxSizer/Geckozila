"""how to print items of a list in a function """


n = [3, 5, 7]
#function start here
def print_list(x):
    for i in range(0, len(x)):
        print x[i]
#calling the function
print_list(n)




#modify list items
def double_list(n):
    #loop through the list items and double each item
    for i in range(0, len(n)):
        # double each item in the list and store the new value back in the list (override the old value)
        n[i] = n[i] * 2
# Don't forget to return your new list!
    return n

print double_list(n)
