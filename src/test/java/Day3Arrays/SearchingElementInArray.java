package Day3Arrays;

public class SearchingElementInArray {

	public static void main(String[] args) {
	
		int a[]= {10,20,30,40,50};
		
		int search_element=300;
		
		boolean status=false;
		
		for(int i=0; i<=a.length;i++) {
			System.out.println(a[i]);
		
		
		//if(a[i]== search_element)
			if(status==false)
		{
			System.out.println("Element found");
			status=true;
			break;
		}
		System.out.println("Element not found");
	
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
