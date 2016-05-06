a='strin'
b='star'
c={'up':'upper','down':'downer','left':'lefter','right':'righter'}

def movment(a,b,c,x=3):
    d=[]
    for i in c:
        if (i == len(a)):
            d[i].append(a)
            return d
        elif (i==len(b)):
            d[i].append(b)
            return d
    else:
            return b
        print d
movment(a,b,c)
