
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int myNum = 5;

		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum+ " is the value stored in the myNum variable");
		System.out.println(website);
		
		//Arrays
		
		int[] arr = new int[5];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		
		int[] arr2 = {0,1,2,3,4};
		
		
		//System.out.println(arr[4]);
		
		//System.out.println(arr2[4]);
		
		
		//FOR loop
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			//System.out.println(arr[i]);
			
		}
		
		
		for(int i =0 ; i < arr2.length ; i++) {
			
			//System.out.println(arr2[i]);
		}
		
		
		
		//String Array
		
		
		String[] name = {"Mark","Joseph","David"};
		
		
		for(int i = 0 ; i < name.length ; i++) {
			
			//System.out.println(name[i]);
			
		}
		
		
		for(String s : name) {
			
			System.out.println(s);
		}
		
	}

}
