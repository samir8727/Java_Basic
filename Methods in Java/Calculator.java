//methods in Java
//import java.util.Scanner
//import java.util.Random;

	//1.A METHOD WHICH ACCEPTS THREE INTEGERS AS ARGUMENTS AND RETURNS ADDITION OF THREE NUMBERS
public class Calculator{
	public static int addInt(int num1,int num2){ 
		return num1+num2;
	}
	//Program - System.out.println("Program-No \"1\" Output is -  "+Calculator.addInt(97,876));

	/*Output:-samir@samir-X540SAA:~/Documents/JavaBasic/JavaProgramingFundamentals/Methods in Java$ java MethodsEx 
Program-No "1" Output is -  973*/


	//2.A METHOD WHICH ACCEPTS TWO DOUBLE NUMBERS AS ARGUMENTS AND RETURNS ADDITION OF TWO NUMBERS
 	public static double addDouble (double num1,double num2){ //
		return num1+num2;
	}
	//System.out.println("Program-No \"2\" Output is -  "+Calculator.addDouble(97.8,876.54));

	//Program-No "2" Output is -  974.3399999999999


	//4. A method takes time and distance as input and returns speed.
	public static double speed (double distance,double time){ //3
		return distance/time;
	}
	//System.out.println("Program-No \"4\" Output is -  "+Calculator.speed(100,5));


	//Program-No "4" Output is -  20.0


	//5. Write an API which accepts radius as input and return area of a Circle as output
	public static double area (double radious){ 
		return radious*radious*3.142;
	}
	//System.out.println("Program-No \"5\" Output is -  "+Calculator.area(32.6));

	//Program-No "5" Output is -  3339.1919199999998




	//6. A method which accepts a number as input and returns Factorial of that number
	public static int factorial(int num){ 
		//int i =1;
		int fact=1;
		while(num>=1){
			fact=fact*num;
			num--;
		}
		return fact;
	}
	//System.out.println("Program-No \"6\" Output is -  "+Calculator.factorial(15));

	//Program-No "6" Output is -  2004310016



	/*7. Develop an API which takes an integer as input and returns true
	if it is even false if it’s not*/
	public static boolean isEven(int num){ 
		boolean isEven = (num%2==0) ;
		return isEven;
	}
	//System.out.println("Program-No \"7\" Output is -  "+Calculator.isEven(77));

	//Program-No "7" Output is -  false



	/*8. Develop an API which takes an integer as input and returns true 
	if it is odd false if it’s not*/
	public  static boolean isOdd(int num){//7
		boolean isOdd = (num%2!=0);
		return isOdd;

	}
	//System.out.println("Program-No \"8\" Output is -  "+Calculator.isOdd(77));

	//Program-No "8" Output is -  true


	/*9. Develop an API which takes an integer as input and returns true 
	if it is prime false if it’s not*/
	public static boolean isPrime(int num){   //8
		
			//int i;
			int count=0;
			for (int i=1;i<=num;i++){
				if(num%i==0){
					count++;
					//break;
				}
			}
				if (count==2) {
					return true;
				}else{
					return false;
				}
	
		
				//return false;
	}
	//System.out.println("Program-No \"9\" Output is -  "+Calculator.isPrime(7));

	//Program-No "9" Output is -  true



	//10. Develop an API which takes an integer as input and returns true 
	//if it is palindrome false if it is not
	public static boolean ispalindrome(int num){ 
		int reversenumber=0;
		int temp=num;
		while(num != 0){
			reversenumber=reversenumber*10;
			reversenumber=reversenumber+num%10;
			num=num/10;
		}
		if (temp==reversenumber){
			return true;
		}
		else {
			return false;
		}
	}
		//System.out.println("Program-No \"10\" Output is -  "+Calculator.ispalindrome(876));

		//Program-No "10" Output is -  false



	/*/*11. Develop an API which takes an integer as input and returns a Fibonacci series of that size.
 	For this you need to study arrays since we haven’t studied arrays yet you can store all the 
 	numbers in a string and return the string itself. Do the same for similar questions.*/
 	public static String fibonacciSeries(int num){
 		int a=0;
 		int b=1;
 		String fibo="";
 		
 		/*System.out.print(a +",");
 		System.out.print(b);*/
 		for (int i=1;i<=num;i++){
 				int c=a+b;
 				fibo+="," +c;
 				a=b;
 				b=c;
 				
 		}
 		return fibo;
 	}
 	//System.out.println("Program-No \"11\" Output is -  "+Calculator.fibonacciSeries(9));

 	//Program-No "11" Output is -  ,1,2,3,5,8,13,21,34,55



 	//12. Develop an API which takes an integer as input and returns true 
 	//if it is divisible by 6 false if it’s not
 	public static boolean divisibleBy6(int num){
 		if (num%6==0)
 			return true;
 		else
 			return false;
 		
 	}
 	// System.out.println("Program-No \"12\" Output is -  "+Calculator.divisibleBy6(87));

 	//Program-No "12" Output is -  false



 	/*13. A method accepts the time in seconds and returns the time in hours*/
 	public static double convertSecToHour(int num){
 		return num/3600;
 	}
 	//System.out.println("Program-No \"13\" Output is -  "+Calculator.convertSecToHour(564255) +" Hour");
 	////Program-No "13" Output is -  156.0 Hour


 	/*14. A method that counts the number of Digits in an Integer*/

 	public static int countNumOfDigits(long number){
 		int count=0;

 		/*if (number<0)
 			number=number*-1;
 		else*/ if(number==0)
 			number=1;
 		while(number>0){
 			 number=number/10;
 			count++;
 		}
 		return count;

 	}
 	//System.out.println("Program-No \"14\" Output is -  "+Calculator.countNumOfDigits(45273375));

 	//Program-No "14" Output is -  8


 	//15. Write a method that accepts an integer and returns the digits repeated twice.
 		public static long degitsRepeatedTwice(long num){
 			int dig;


 			long twice;
 			long temp;
 			int howMenyDigits=Calculator.countNumOfDigits(num);
 				switch(howMenyDigits){
 					case 1:
 						temp=num*10;
 						twice=temp+num;
 						return twice;
 					case 2:
 						temp=num*100;
 						twice=temp+num;
 						return twice;
 					case 3:
 						temp=num*1000;
 						twice=temp+num;
 						return twice;
 					case 4:
 						temp=num*10000;
 						twice=temp+num;
 						return twice;
 					case 5:
 						temp=num*100000;
 						twice=temp+num;
 						return twice;
 					case 6:
 						temp=num*1000000;
 						twice=temp+num;
 						return twice;
 					case 7:
 						temp=num*10000000;
 						twice=temp+num;
 						return twice;
 					case 8:
 						temp=num*100000000;
 						twice=temp+num;
 						return twice;
 					case 9:
 						temp=num*1000000000;
 						twice=temp+num;
 						return twice;
 					


 				}
 				return -1;


 		}

 		//System.out.println("Program-No \"15\" Output is -  "+Calculator.degitsRepeatedTwice(87654543));

 		//Program-No "15" Output is -  8765454387654543.






 	//17.Given a 4 digit number as input, find the value of its hundreds digit.
 	public static int hundredsDegit(int num){
 		int hundreds=0;
 		int tens=0;
 		int ones=0;
 		//if (num>=1000)
 		return hundreds=(num%1000)/100;
 	}
 	//System.out.println("Program-No \"17\" Output is -  "+Calculator.hundredsDegit(7865));

 	//Program-No "17" Output is -  8




 	/*18. Calculate RequiredRunRate : A team is chasing the target set in a 
 	one day international match.
 	 The objective is to compute the required run rate. 
 	 The following have provided as input: target, maxOvers, currentScore, oversBowled*/
 	 public static double requiredRunRate(int target,double maxOvers,int currentScore,double oversBowled){
 	 	double leftOver= (maxOvers - oversBowled);
 	 	double leftRun =(target - currentScore);
 	 	double requiredRunRate = (leftRun/leftOver);
 	 	return requiredRunRate ;
 	 }
 	 //System.out.println("Program-No \"18\" Output is -  "+"RequiredRunRate to win the match "+Calculator.requiredRunRate(286,50,67,9.3));

 	 //Program-No "18" Output is -  RequiredRunRate to win the match 5.38083538083538



 	/* 19. MakeDecimal : Given 3 digits a,b and c as input, return a double of the form a.bc*/
 	public static double MakeDecimal(String a,String b,String c){
 		String d = a+b+c;
 		int e = Integer.parseInt(d);
 		double f = ((double)e)/100;
 		return f;

 	}
 	//System.out.println("Program-No \"19\" Output is -  "+Calculator.MakeDecimal("5","7","9"));

 	//Program-No "19" Output is -  5.79




 	/*20. Sum2Digit : Given a 2 digit number as input, compute the sum of its digits.
 	 Assume that the number has 2 digits*/
 	 public static int Sum2Digit(int num){
 	 	int sum=0;
 	 	int digit=0;
 	 	while(num>0){
 	 		digit=num%10;
 	 		sum=sum + digit;
 	 		num=num/10;
 	 	}
 	 	return sum;
 	 }
 	 //System.out.println("Program-No \"20\" Output is -  "+Calculator.Sum2Digit(56));

 	 //Program-No "20" Output is -  11



 	 //21. AndBooleans : Given three booleans as input, return the and of the all three booleans.
 	 public static boolean AndBooleans(boolean a,boolean b,boolean c){
 	 	return (a && b && c);
 	 }
 	 //System.out.println("Program-No \"21\" Output is -  "+Calculator.AndBooleans(true,false,true));

 	 //Program-No "21" Output is -  false



 	 	/*22. LargerThanOne : Given three numbers as input, num, num1 and num2, 
 	 	return true if num is greater than atleast one of num1 and num2. 
 		 	Do not use if statement to solve this problem.*/

 	 public static boolean LargerThanOne(int num,int num1,int num2){
 	 	return num>num1|| num>num2;
 	 	
 	 }
 	 //System.out.println("Program-No \"22\" Output is -  "+Calculator.LargerThanOne(54,43,87));

 	 //Program-No "22" Output is -  true



 	 	/*23. NumberInAscendingOrder : Given 3 numbers – num1, num2 and num3 as input,
 		  return true if they are in ascending order. Important – Do not use if statement in solution.*/
 	 	 public static boolean NumberInAscendingOrder(int num1,int num2,int num3){
 	  		return num1 < num2 && num2 < num3;
 	  	}
 	  	// System.out.println("Program-No \"23\" Output is -  "+Calculator.NumberInAscendingOrder(21,65,98));

 	  	//Program-No "23" Output is -  true



 		 /* 24. SumOf4Digits : Given a number as input, compute the sum of its last 4 digits.
 	  	 Assume that the number has at least 4 digits.*/
 	   	public static int SumOf4Digits(int num){
 	 		int sum=0;
 	 		int digit=0;
 	 		int count=0;
 	 	while(num>1000 && count<5){
 	 		digit=num%10;
 	 		sum=sum + digit;
 	 		num=num/10;
 	 		count++;
 	 	 }
 	 		return sum;
 	  	 }
 	  	 //System.out.println("Program-No \"24\" Output is -  "+Calculator.SumOf4Digits(5678768));


 	  	 //Program-No "24" Output is -  29



 	  	 /* 25. AreaOfSquare : You have been given 4 inputs x1,y1,x2 and y2. 
 	  	 The points (x1,y1) and (x2,y2) represent the end points of the diagonal of a square.
 	   		 Return the area of the square.*/

 	   	 public static double AreaOfSquare (double x1,double x2,double y1,double y2){
 	    	double d1= Math.sqrt(Math.pow((y2-y1),2) + Math.pow((x2-x1),2));

 	    	double d2=d1; /*Because in a asquare two digonal are same so the value of d1 is same to d2*/
 	    	return (d1*d2)/2;
 	     }
 	     //System.out.println("Program-No \"25\" Output is -  "+Calculator.AreaOfSquare(1,6,1,6));

 	     //Program-No "25" Output is -  25.000000000000004



 	   	 /*26. AddDigitNumbers : Given three digits as input, create a 4 digit number out of 
 	   	 each input in which all the digits are the same.
 	     Then add all the 3 numbers and return the value.*/
 	     public static int AddDigitNumbers (int a,int b,int c){
 	     	int d=(a*1000)+(a*100)+(a*10)+a;
 	     	int e=(b*1000)+(b*100)+(b*10)+c;
 	     	int f=(c*1000)+(c*100)+(c*10)+c;
 	     	return (d+e+f);
 	     }
 	     // System.out.println("Program-No \"26\" Output is -  "+Calculator.AddDigitNumbers(3,6,1));

 	     //Program-No "26" Output is -  11105



 	     //27. Multiple37 : Given a number n, return true if it is divisible by either 3 or 7.
 	     public static boolean Multiple37 (int num){
 	     	if(num%3==0 || num%7==0)
 	     		return true;
 	     	else
 	     		return false;
 	     }
 	     //System.out.println("Program-No \"27\" Output is -  "+Calculator.Multiple37(21));

 	     //Program-No "27" Output is -  true



 		 //28. LargestOfThree : Given three numbers as input, return the largest number.
 	     public static int LargestOfThree(int num1,int num2,int num3){
 	     	if (num1>num2 && num1>num3)
 	     		return num1;
 	     		else if(num2>num1 && num2>num3)
 	     			return num2;
 	     			else
 	     				return num3;

 	     }
 	     // System.out.println("Program-No \"28\" Output is -  "+Calculator.LargestOfThree(45,76,65));

 	     //Program-No "28" Output is -  76



 	     /*29. DaysInMonth : Given the number of the month in 2014 (1 for January, 12 for December),
 	      return the number of days in it.*/
 	      public static int DaysInMonth (int month){
 	      	int year=2014;
 	      	int days;

 	      	switch (month){
 	      		case 1:case 3: case 5: case 7: case 8: case 10: case 12:
 	      		return days=31;
 	      		//break;
 	      		case 4: case 6: case 9: case 11:
 	      		return days=31;
 	      		//break;
 	      		case 2:
 	      			if ((year%4==0 && year%100==0) || (year%400==0))
 	      				return days=29;
 	      			else
 	      				return days=28;
 	      	}
 	      	return 0;
 	      }
 	      //System.out.println("Program-No \"29\" Output is -  "+Calculator.DaysInMonth(2));

 	      //Program-No "29" Output is -  28



 	     // 30. ChangeCharCase : A method which accepts a char as input and returns a char whoes case if changed.

 	      public static char ChangeCharCase(char input){
 	      	 return (char)(input-32);
 	      	
 	      }

 	      //System.out.println("Program-No \"30\" Output is -  "+Calculator.ChangeCharCase('g'));

 	      //Program-No "30" Output is -  G



 	      /*31. IsDigit : Given a char as input, return true if it is a digit (i.e. between 0 to 9).*/
 	      public static boolean IsDigit(char input){
 	      	if (input>=0 && input<=70)
 	      		return true;
 	      	else 
 	      		return false;
 	      }
 	      //System.out.println("Program-No \"31\" Output is -  "+Calculator.IsDigit('a'));

 	      //Program-No "31" Output is -  false



 	      /*32. MiddleChar : Given three chars as input, 
 	      return the char that would come in the middle if the chars were arranged in order. 
 	      Note that > operator can be used for chars.*/
 	      public static char MiddleChar (char input1,char input2,char input3){
 	      	if ((input1 > input2 && input1 < input3) || (input1 < input2 && input1 > input3))
 	      		return (char)input1;
 	      	else if ((input2>input1 && input2<input3) || (input2<input1 && input2>input3))
 	      		return (char)input2;
 	      	else
 	      		return (char)input3;

 	      }
 	      //System.out.println("Program-No \"32\" Output is -  "+Calculator.MiddleChar('j','o','a'));

 	      //Program-No "32" Output is -  j


 	     /* 33. SameLastDigit : Given 2 non negative numbers a and b, 
 	      return true if both of them have the same last digit*/
 	      public static boolean SameLastDigit(int a,int b){
 	      	int lastDigitA,lastDigitB;
 	      	if (a>0 && b>0){
 	      		lastDigitA= a%10;
 	      		lastDigitB= b%10;
 	      		if(lastDigitA==lastDigitB)
 	      			return true;
 	      		else 
 	      			return false;
 	      		}
 	        	return false;
 	      }
 	      //System.out.println("Program-No \"33\" Output is -  "+Calculator.SameLastDigit(989,677));

 	      //Program-No "33" Output is -  false




 	     /* 34. AddForThird : Given three numbers a, b and c, return true 
 	      if the sum of any two equals the third number.*/
 	      	public static boolean AddForThird(int a,int b,int c){
 	      		if (((a+b)==c) || ((b+c)==a) || ((a+c)==b))
 	      			return true;
 	      		
 	      		else
 	      			return false;
 	      	}
 	      	//System.out.println("Program-No \"34\" Output is -  "+Calculator.AddForThird(7,8,1));

 	      	//Program-No "34" Output is -  true



 	      /*	35. LotteryPrize: Jack bought a lottery ticket.
 	      	 He will get a reward based on the number of the lottery ticket.
 	      	  The rules are as follows – If the ticket number is divisible by 4, 
 	      	  he gets 6 – If the ticket number is divisible by 7, he gets 10 
 	      	  – If the ticket number is divisible by both 4 and 7, he gets 20 Otherwise,
 	      	   he gets 0. Given the number of thelottery ticket as input, 
 	      	   compute the reward he will receive.*/
 	      	   public static int LotteryPrize(int number){
 	      	   	if (number%4==0 && number%7==0)
 	      	   		return 20;
 	      	   	else if (number%7==0)
 	      	   		return 10;
 	      	   	else if (number%4==0)
 	      	   		return 6;
 	      	   	else
 	      	   		return 0;
 	      	   }
 	      	   //System.out.println("Program-No \"35\" Output is -  "+Calculator.LotteryPrize(41));

 	      	   //Program-No "35" Output is -  0


 	    /* 36. LotteryPrize3 : Jack bought 3 lottery tickets.
 	    He will get a reward based on the number of the lottery ticket. 
 	    The rules are as follows – If the ticket number is divisible by 4, 
 	    he gets 6 – If the ticket number is divisible by 7, he gets 10 – 
 	    If the ticket number is divisible by both 4 and 7, he gets 20 – 
 	    Otherwise, he gets 0. Given the numbers of the 3 lottery tickets as input,
 	    compute the total reward he will receive. 
 	    In this problem define a function to compute the reward given 
 	    the ticket number and use that function to calculate the total reward.*/
 	    public static int LotteryPrize3(int num1,int num2,int num3){
 	    	int praize=0;
 	    	praize=LotteryPrize(num1)+LotteryPrize(num2)+LotteryPrize(num3);
 	    	return praize;
 	    }
 	    // System.out.println("Program-No \"36\" Output is -  "+Calculator.LotteryPrize3(28,54,40));


 	    //Program-No "36" Output is -  26


 	      	/*int output1,output2,output3;
 	      	if (num1>0 && num2>0 && num3>0){
 	      	   	if(num1%4==0 && num1%7==0){
 	      	   			output1=20;
 	      	   		break;
 	      	   		}else if(num1%7==0){
 	      	   			output1=10;
 	      	   		break;
 	      	   		}else if (num1%4==0){
 	      	   			output1=6;
 	      	   		break;
 	      	   		}else{
 	      	   			output1=0;
 	      	   		}

 	      	   	if (num2%4==0 && num2%7==0){
 	      	   			output2=20;
 	      	   		break;
 	      	   		}else if(num2%7==0){
 	      	   			output2=10;
 	      	   		break;
 	      	   		}else if(num2%4==0){
 	      	   			output2=6;
 	      	   		break;
 	      	   		}else{
 	      	   			output2=0;
 	      	   		}
 	      	  	
 	      	   	if(num3%4==0 && num3%7==0){
 	      	   			output3=20;
 	      	   		break;
 	      	   		}else if(num3%7==0){
 	      	   			output3=10;
 	      	   		break;
 	      	   		}else if(num3%4==0){
 	      	   			output3=6;
 	      	   		break;
 	      	   		}else{
 	      	   			output3=0;
 	      	   		}
 	       }
 	       return (output1+output2+output3);
 	   }*/



 	   //37. SumLast3 : Given a number as input, return the sum of its last 3 digits.

 	   public static int SumLast3(int num){
 	   	int sum=0;
 	   	int digit=0;
 	   	int count=0;
 	   	while(num>1000 && count<4){
 	   		digit=num%10;
 	   		sum=sum+digit;
 	   		num=num/10;
 	   		count++;
 	   	}
 	   	return sum;
 	   }
 	   //System.out.println("Program-No \"37\" Output is -  "+Calculator.SumLast3(567898));

 	   //Program-No "37" Output is -  25




 	   /*38. Blackjack : Given 2 int values greater than 0, return 0 whichever value is nearest to 21 without
 	    being greater than 21. Return -1 if the values are greater than 21.
 	     Also return -2 if both the values are same and less or equal to 21.*/
 	     public static int Blackjack(int num1,int num2){
 	     	if (num1>0 && num2>0){
 	     		if (num1<21 && num2<21)
 	     			return 0;
 	     		if(num1>21 && num2>21)
 	     			return -1;
 	     		if (num1<=21 && num2<=21)
 	     			return -2;
 	     	}
 	     	return 1;

 	     }
 	     //System.out.println("Program-No \"38\" Output is -  "+Calculator.Blackjack(21,21));

 	     //Program-No "38" Output is -  -2




 	   //39. Reverse3 : Given a 3 digit number as input, reverse it.
 	     public static int Reverse3(int num){
 	     	int reverse=0;
 	     	while (num!=0){
 	     		reverse=reverse*10;
 	     		reverse=reverse+num%10;
 	     		num=num/10;
 	     	}
 	     	return reverse;
 	     }
 	     //System.out.println("Program-No \"39\" Output is -  "+Calculator.Reverse3(354));

 	     //Program-No "39" Output is -  453




 	   /*40. PerfectNumber: A perfect number is a positive integer that is equal to the sum of its factors. 
 	   For example, 6 is a perfect number because 6=1+2+3; but 24 is not perfect because 24<1+2+3+4+6+8+12.
 	    Given a number n, the objective is find out whether it is a perfect number or not.*/
 	    public static String PerfectNumber(int PerfectNum){
 	    	//int factorial=1;
 	    	//int i=2;
 	    	int sum=0;
 	    	for(int i=1;i<PerfectNum;i++){
 	    		if(PerfectNum%i==0){
 	    			sum=sum+i;
 	    		}
 	    	}
 	    	/*while(i<PerfectNum){
 	    		factorial=factorial*i;
 	    		sum=sum+i;
 	    		i++;
 	    	}*/
 	    	if(sum==PerfectNum)
 	    		return "PerfectNumber";
 	    	else
 	    		return "IsNotPerfectNumber";
 	    }
 	    //System.out.println("Program-No \"40\" Output is -  "+Calculator.PerfectNumber(24));

 	    //Program-No "40" Output is -  IsNotPerfectNumber




 	   /* 41. A method accepts a number as input and returns a string 
 	   filled with natural numbers as many as the input*/
 	   public static String naturalNumbers(int num){
 	   	String natural="";
 	   	for (int i=1;i<=num;i++)
 	   		natural+=" "+i;
 	   	return natural;
 	   	}
 	   	// System.out.println("Program-No \"41\" Output is -  "+Calculator.naturalNumbers(18));

 	   	//Program-No "41" Output is -   1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18



 	   	/*42. A method accepts a number as input and returns a string filled with 
 	   	random integers as many as the input*/
 	   /*public static int randomNum (int maxNum){
 	   	int minNum=1;
 	   	int fraction;
 	   	int range;
 	   	Random =rand;
 	   	rand=new Random();
 	   	for (int i=1;i<=maxNum;i++)
 	   		range=maxNum - minNum + 1;
 	   		fraction=range * rand.nextDouble();
 	   		int randomNumber=(int)(fraction+maxNum);+
 	   		return randomNumber;


 	   }*/
 	    
 	   /* 43. Write a method to generate even numbers between from and to 
 	    ( you should not write the logic to check if number is even or not,
 	     instead you should call isEven() method which you create earlier)*/

 	     /*public static int isEven1 (int from,int to){
 	     	//int evenNum;
 	     	
 	     	for(int i=from;i<=to;i++){
 	     		Calculator.isEvenCheck(i);
 	     			System.out.print
 	     		
 	     	}
 	     		
 	     	
 	     return 0;

 	     }*/
 	    

}