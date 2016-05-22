#!/usr/bin/python

# print text
def count_numbers():
    print "coding all night long"

a=7
b=1

def count_numbers_two(a,b):
    print "total is :%r " % a + b

count_numbers_two(4,6)


def count_numbers_glob(hey, you):
    print "you are doing fine"


def count_number_like_argv(arg1,arg2,*arg):

    print "arg1 : %r , arg2: %r , arg3 %r" %(arg1,arg2)

def count_number_optional(arg1, arg2=5):
    print "arg1 , arg2"

def count_numbers_inaddition(5+2,6+1):
    
