#usr/bin/python
mylist = [1,2,3,4,5,6,6,7,7,7,7,7,77,8,8,8,8,]
def values (li):
    myset = list(set(mylist))
    counter = 0
    for i in xrange(len(myset)-1,0,-1):
        for x in xrange( i):
            mynewlist = myset[i]*myset[i-1]
    print mynewlist
#mynewlist = list(myset)
values(mylist)
  #return  myset
