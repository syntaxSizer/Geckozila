#!usr/bin/python

y = int(raw_input('Enter number '))


def prime_num(x):
  # for i in range(x):
    if x % x == 0 and x % 1 == 0:
        if x % 2 != 0:
            print "is prime %s " % x
            return True

        else:
            print "not a prime %s " % x
            return False

prime_num(y)
# print x
