//String to Intger Type casting
class StringToInt{
	public static void main (String[] args){
		String empId="1001";
		int id = Integer.parseInt(empId);
		/*Integer is awrapper Class
			Through it we are calling method
			called parseInt() which convert String value to Intger 
			if appropriate data is present in empId or there will 
			an expection and program will break
			*/
		System.out.println("The employee id is "+id);

	}
}