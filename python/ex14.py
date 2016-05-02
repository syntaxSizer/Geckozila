#!/usr/bin/python
#pormoting and passing using raw_input and argv combination

from sys import argv

script, user_name = argv
prompt = '@_@ ? '

print "Hi %s, I'm the %s script." % (user_name, script)
print "I'd like to ask you a few questions."
print "Do you like me %s?" % user_name
likes= raw_input(prompt)
print "Where do you live %s?" % user_name
lives = raw_input(prompt)
print "What kind of computer do you have?"
computer = raw_input(prompt)
print "what you do for living %s?" % user_name
work=raw_input(prompt)
print """
Alright, so you said %r about liking me.
You live in %r. Not sure where that is.
And you have a %r computer. And you %r Nice.
""" % (likes, lives, computer,work)
