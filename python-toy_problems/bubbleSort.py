#usr/bin/python

def bubbleSort(sort):
    for x in xrange(len(sort)-1,0,-1):
        for i in xrange(x):
            if sort[i]>sort[i+1]:
                temp = sort[i]
                sort[i] = sort[i+1]
                sort[i+1] = temp
sort = [23,56,3,4,5,51,222,1,0]       
bubbleSort(sort)
print(sort)
