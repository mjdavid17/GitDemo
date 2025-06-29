import java.util.ArrayList;
import java.util.Iterator;

public class CoreJavaBrushUp2 {
	
	
	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
				
		
		//regular for loop
		
		for(int i=0 ; i < arr2.length ; i++) {
			
			
			if(arr2[i] % 2 == 0) {
				
				//System.out.println(arr2[i]);
			}
			
			
		}
		
		
		//enhanced for loop
		
		for(int n : arr2) {
			
			if(n % 2 == 0) {
				
				//System.out.println(n);
			}
			
		}
		
		
		
		//Arraylist
		
		
		ArrayList<String> name = new ArrayList<String>();
		
		
		name.add("Mark");
		name.add("Joseph");
		name.add("David");
		
		
		
		//enhanced for loop
		
		for(String e : name) {
			
			//System.out.println(e);
			
		}
		
		//for loop
		
		for(int i = 0 ; i < name.size() ; i++) {
			
			
			
			if(name.get(i).contains("Dav")) {
			
			//	System.out.println(name.get(i));
				
			}
		}
		
		
		
		//split
		
		
		String name1 = "Feline Marenz Magno";
		
		
		
		
		String[] name1_1 = name1.split(" ");
		
		
		for(String e : name1_1) {
			
			System.out.println(e);
			
		}
		
		
		System.out.println(name1.charAt(0));
		
		
		
		
		
	}

}
