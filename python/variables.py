#!/usr/bin/python

cars =100
space_in_a_car=4
drivers=30
passengers=90
cars_not_driven=cars-drivers
cars_driven = drivers
carpool_capacity=cars_driven*space_in_a_car
average_passengers_per_car=passengers/cars_driven

print "Hey %s there." % "you"

print "There are " , cars ,"cars available."
print "there are only " ,drivers , "drivers available."
print "there will be ", cars_not_driven, "empty cars today."
print "we can transport ",carpool_capacity,"people today."
print "we need to putabout " ,average_passengers_per_car,"in each car."


# format string
name = 'Zed A. Shaw'
age = 35 # A lie
height = 1.73 # miters
weight = 64 # k
eyes = 'brown'
teeth = 'yellow'
hair = 'black'


print "lets talk about %s." % name
print "He\'s %d miters tall." % height
print "He\'s %d k heavy. " % weight
print "Actually that not too heavy"
print "He's got %s eyes and %s hair." % (eyes, hair)
print "his teeth are usually %s depending on coffee." % teeth

print "if i add %d, %d, and %d i get %d. " % (age, height, weight,+ age+ height +weight)

