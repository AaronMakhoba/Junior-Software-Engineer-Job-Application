import java.util.Scanner;

public class TestArea {

	public static void main(String[] args) {

	//declaring base and height 
	    int base = 0;
		int height = 0;
		
		int area = 0;
		
	// declaring Scanner Object	
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter base of base: ");
		base = sc.nextInt();
		
		System.out.println("Enter base of triangle: ");
		height = sc.nextInt();
		
		sc.close();
		
		area = (base * height) / 2;
		
		
		System.out.println("The Area Of Triangle Is :" + area) ;
		
		
	}

}
