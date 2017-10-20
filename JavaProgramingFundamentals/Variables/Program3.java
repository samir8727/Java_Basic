//VariablesExample(FinalVariables)
import java.util.Scanner;
class VariablesEx3{
	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner (System.in) ;

		double radious,area;
		System.out.print("Enter the \"radious\" of Circle - ");
		radious=sc.nextDouble();     
		final double PI = 3.14 ;   
		area = PI*radious*radious; 

		System.out.println("Area of a \"circle\" is " +area );

		
	}
}