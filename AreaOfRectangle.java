import java.util.*;


public class AreaOfRectangle {

	public static void main(String[] args) {
		
		int lgt,bdt,area;
		System.out.println("Please enter the length of rectangle:");
		Scanner length = new Scanner(System.in);
		lgt = length.nextInt(); 
		System.out.println("Please enter the breadth of rectangle:");
		Scanner breadth = new Scanner(System.in);
		bdt = breadth.nextInt();
		
	    area = areaOfRectangle(lgt,bdt);	
	    System.out.println("Area of the rectangle is : "+area);
			
	}
	
	public static int areaOfRectangle(int l,int b) {
	
			int area;
			area = l*b;
			return area;
	
	}
	

}
