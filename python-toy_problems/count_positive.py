def manipulate_data(alist):
    my_list = []
    positive = []
    negative = []
    sum_negative =0
    if not isinstance(alist,list):
    	return 'Only lists allowed'
    for i in alist:
        if i >=0:
            positive.append(i)
        else:
            negative.append(i)
    for x in negative:
        sum_negative+=x
    my_list.append(len(positive))
    my_list.append(sum_negative)
    return my_list 
print manipulate_data({1:[1,2,3,4,-1,-2,-3]}) 
