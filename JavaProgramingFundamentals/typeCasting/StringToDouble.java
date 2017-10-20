//String to Double
class StringToDouble{
	public static void main(String[] args){
		String empSalary="55000.76";
		double salary= Double.parseDouble(empSalary);
		//here we use wrapper class to convert String to double

		System.out.println("salary is " + salary);
	}
}