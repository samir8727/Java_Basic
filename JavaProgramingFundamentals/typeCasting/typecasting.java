//Type casting in java
class TypeCasting1{
	public static void main (String[] args){
		byte b=100;
		int i=b; // This is a implicit casting 
		System.out.println(i); //the value of i here is withot loss 

		float F =i; //this is also implicit casting
		System.out.println(F) ;//the value of f is as same as i because its a imlicit casting .

		double d =10.1;
		float f =(float) d;
							/*it's a explicit casting so here we use (float) type casting 
								so that we say to compiler that we ready to take loss 
									and then compiler compile it as pe our instruction*/

		System.out.println(f); //the value with no loss because it's on the range of byte.

		float var = (float) 128.128;//its convert float to float so don't need to do type cast here.
		System.out.println(var);

		int num = (int)var;//this is a Explicit Type casting becuse here we convert float to num
		System.out.println(num);//output is with loss becuse num is not support desimal nuber.

		b=(byte) num;//it's also from Explicit type casting
		System.out.println(b);//here the value is come randemly becuse byte range is -128 to 127 .

	}
}