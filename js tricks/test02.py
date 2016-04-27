#python getting the current date and time 
#importing datetime library

from datetime import datetime

now =datetime.now()
#print the date
print now

#extract only day month year 
current_year=now.year
current_month=now.month
current_day=now.day
#print each of them
print current_year
print current_month
print current_day


print '%s/%s/%s'%(now.year , now.month ,now.date)
#print hh:mm:ss
print '%s:%s:%s'%(now.hour,now.minute,now.second)
