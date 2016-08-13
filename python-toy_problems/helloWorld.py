#/usr/bin/python 
import optparse

def main():
	p = optparse.OptionParser()
	# -p is the variable that the program can take 
	p.add_option('--person','-p', default="world")
	options, arguments =p.parse_args()
	print 'Hello %s' % options.person
if __name__=="__main__":
		main()	