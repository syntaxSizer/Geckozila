#!/usr/bin/python
names = ['bob', 'yay','qusai','booter']
pictures = ['girls', 'football','code']
war = ['call of duty', 'modren war fear']
anime = ['bleach']
names = []
people = ['Sylvie', 'Sylia Stingray', 'Linna Yamazaki', 'Priscilla S. Asagiri',
          'Largo', 'Galatea', 'Brian J. Mason', 'Nigel', 'Leon McNichol', 'Anri', 'Daley Wong']
p = len(people)

def likes(names):
    size = p - 2
    for i in xrange(len(names)):
        if len(names) == 1:
            return " ".join(str(x) for x in names) + ' likes this'

        if len(names) == 2:
            names.insert(1, 'and')
            return " ".join(str(x) for x in names) + ' like this'

        if len(names) == 3:
            # for i in xrange(len(names), 4):
            names[0]+=','
            names.insert(2, 'and')
            return " ".join(str(x) for x in names) + ' like this'

        if len(names) == 4:
            names[0]+=','
            names.insert(2,'and 2 others')
            del names[3:]
            return" ".join(str(x) for x in names) + ' like this'

        if len(names) > 4:
            size = len(names)
            names[0] += ','
            names.insert(2, 'and')
            del names[3:]
        return " ".join(str(x) for x in names) + ' %d otheres like this' % size

    else:
        return 'no one likes this'


likes(names)
print likes(names)

