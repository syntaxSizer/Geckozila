
public class Small {
//find the smallest number
	public static int findSmallestInt(int[] args) {
        // store first element of the array in variable 'min'
    	int min=args[0];
        // loop through the array
    	for(int i=0; i<args.length; i++){
            // compare the array element the first element which is min 
            //the condition is that it should be smaller then all the array elements
    		if(args[i]<min){
                
    			min=args[i];

    		}
    		}
    	
		return min;

	

}
    //find the largest
    public static int findlargestInt(int[] args) {
        // the same steps in smallest method except the condition now will look for the greatest 
    	int max=args[0];
    	for(int i=0; i<args.length; i++){
    		if(args[i]>max){
    			max=args[i];

    		}
    		}
    	
		return max;
}

    


	
	public static void main(String[] args) {
		// test case
		int args1[]={1,1,2,-50,59,2,4,4,-1,-2};
		System.out.println("The smallest number is :"+findSmallestInt(args1));
		System.out.println("The largest number is :"+findlargestInt(args1));
		

	}
}
    