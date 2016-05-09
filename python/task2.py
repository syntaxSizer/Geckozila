a='strin'
b='star'
c={'up':'upper','down':'downer','left':'lefter','right':'righter'}
print "dictionary before %r" %c
def movment(a,b,c,x=3):
    d1={}
    for i in c:
        if (i ==  4) :
             c[i]=b
        else:
             c[i]=a
   
    print"dictionary after %r " % c
movment(a,b,c)
