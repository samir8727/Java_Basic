//Area of a Circle
import java.util.Scanner;
class Program8{
	public static void main(String[] args) {
		final double PI = 3.142;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("plese enter the radious of a circle - ");
		double radious=sc.nextDouble();
		if(radious >= 1){
			double area = PI*radious*radious;
			System.out.println("the \"radious\" of circle is - " +area);

		}
		else{
			System.out.println("redious value should be more than \"0\" ");
		}
	}
}