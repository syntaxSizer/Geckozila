#!/usr/bin/python
# Write a function that will calculate the date that someone will celebrate their 1 gigasecond anniversary.

# Note: A gigasecond is one billion (10**9) seconds.

# The input is three parameters representing someone's birthday.

# As a convenience for celebration planning, the function should also calculate the day of the week and the number of days from today.

# The output should be an array formatted as such: ["YYYY-MM-DD", 'day_of_the_week', days_until]

# You can google datetime in python to familiarize yourself with it

import time
from datetime import date,timedelta,datetime

def gigsecond():
    return timedelta(0,10**9)

now = datetime.now()
final=now+timedelta(0,10**9)
final2=abs(final-now)
final2=final2.days
lise=final.strftime("%A %d: %B: %Y ")
lists=[]
lists.append(lise)
lists.append(final2)
print lists

~
~
~
