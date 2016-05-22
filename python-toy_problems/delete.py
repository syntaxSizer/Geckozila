"""Delete functions 'remove item from list"""
n = [1, 3, 5,6]
# Removes 1 from the list,
# NOT the item at index 3
n.remove(3)
# Another possible solution, will remove the item at the given index:
del(n[0])
# Another possible solution will remove the item at index from the list and return it to you:
n.pop(0)
print n

