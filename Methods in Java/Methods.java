/*import java.util.Scanner;*/
class MethodsEx{
	public static void main (String[] args){
		 //1.A METHOD WHICH ACCEPTS THREE INTEGERS AS ARGUMENTS AND RETURNS ADDITION OF THREE NUMBERS
		 System.out.println("Program-No \"1\" Output is -  "+Calculator.addInt(97,876));


		 //2.A METHOD WHICH ACCEPTS TWO DOUBLE NUMBERS AS ARGUMENTS AND RETURNS ADDITION OF TWO NUMBERS.
		 System.out.println("Program-No \"2\" Output is -  "+Calculator.addDouble(97.8,876.54));


		 System.out.println("Program-No \"4\" Output is -  "+Calculator.speed(100,5));

 
		 //5. Write an API which accepts radius as input and return area of a Circle as output.
		 System.out.println("Program-No \"5\" Output is -  "+Calculator.area(32.6));


		 //6. A method which accepts a number as input and returns Factorial of that number.
		 System.out.println("Program-No \"6\" Output is -  "+Calculator.factorial(15));



		 /*7. Develop an API which takes an integer as input and returns true
		 if it is even false if it’s not*/
		 System.out.println("Program-No \"7\" Output is -  "+Calculator.isEven(77));


		 /*8. Develop an API which takes an integer as input and returns true 
		 if it is odd false if it’s not*/
		 System.out.println("Program-No \"8\" Output is -  "+Calculator.isOdd(77));


		 /*9. Develop an API which takes an integer as input and returns true 
		 if it is prime false if it’s not*/
		 System.out.println("Program-No \"9\" Output is -  "+Calculator.isPrime(7));




		 /*10. Develop an API which takes an integer as input and returns true 
		 if it is palindrome false if it is not*/
		 System.out.println("Program-No \"10\" Output is -  "+Calculator.ispalindrome(876));

		 /*11. Develop an API which takes an integer as input and returns a Fibonacci series of that size.
		 For this you need to study arrays since we haven’t studied arrays yet you can store all
		  the numbers in a string and return the string itself. Do the same for similar questions.*/

		 System.out.println("Program-No \"11\" Output is -  "+Calculator.fibonacciSeries(9));
 
		 /*12. Develop an API which takes an integer as input and returns true 
		 if it is divisible by 6 false if it’s not*/
		 System.out.println("Program-No \"12\" Output is -  "+Calculator.divisibleBy6(87));


		 //13. A method accepts the time in seconds and returns the time in hours
		 /*Scanner sc;
		 sc=new Scanner(System.in);
		 System.out.print("Enter value of Sec to convert Hour - ");
		 int Sec=sc.nextInt();*/
		 System.out.println("Program-No \"13\" Output is -  "+Calculator.convertSecToHour(564255) +" Hour");


		 /*14. A method that counts the number of Digits in an Integer*/
		 System.out.println("Program-No \"14\" Output is -  "+Calculator.countNumOfDigits(452733899));


		 
		 //15. Write a method that accepts an integer and returns the digits repeated twice.
		 	System.out.println("Program-No \"15\" Output is -  "+Calculator.degitsRepeatedTwice(87654543));



		 //17. Given a 4 digit number as input, find the value of its hundreds digit.
		 System.out.println("Program-No \"17\" Output is -  "+Calculator.hundredsDegit(7865));

		 /*18. Calculate RequiredRunRate : A team is chasing the target set in a 
		 one day international match. The objective is to compute the required run rate.
		 The following have provided as input: target, maxOvers, currentScore, oversBowled*/
		 System.out.println("Program-No \"18\" Output is -  "+"RequiredRunRate to win the match "+Calculator.requiredRunRate(286,50,67,9.3));


		 /*19. MakeDecimal : Given 3 digits a,b and c as input, return a double of the form a.bc*/
		 System.out.println("Program-No \"19\" Output is -  "+Calculator.MakeDecimal("5","7","9"));



		 /* 20. Sum2Digit : Given a 2 digit number as input, compute the sum of its digits. 
		  Assume that the number has 2 digits*/
		  System.out.println("Program-No \"20\" Output is -  "+Calculator.Sum2Digit(56));


		 // 21. AndBooleans : Given three booleans as input, return the and of the all three booleans
		  	System.out.println("Program-No \"21\" Output is -  "+Calculator.AndBooleans(true,false,true));


		 /*22. LargerThanOne : Given three numbers as input, num, num1 and num2,
		  return true if num is greater than atleast one of num1 and num2.
		  Do not use if statement to solve this problem.*/
		  System.out.println("Program-No \"22\" Output is -  "+Calculator.LargerThanOne(54,43,87));



		 /* 23. NumberInAscendingOrder : Given 3 numbers – num1, num2 and num3 as input, 
		 return true if they are in ascending order. Important – Do not use if statement in solution.*/
		 System.out.println("Program-No \"23\" Output is -  "+Calculator.NumberInAscendingOrder(21,65,98));


		 /* 24. SumOf4Digits : Given a number as input, compute the sum of its last 4 digits.
		 Assume that the number has at least 4 digits.*/
		 System.out.println("Program-No \"24\" Output is -  "+Calculator.SumOf4Digits(5678768));


		 /*25. AreaOfSquare : You have been given 4 inputs x1,y1,x2 and y2.
		 The points (x1,y1) and (x2,y2) represent the end points of the diagonal of a square.
		 Return the area of the square.*/
		 System.out.println("Program-No \"25\" Output is -  "+Calculator.AreaOfSquare(1,6,1,6));


		 /*26. AddDigitNumbers : Given three digits as input, 
		 create a 4 digit number out of each input in which all the digits are the same.
		 Then add all the 3 numbers and return the value.*/
		    System.out.println("Program-No \"26\" Output is -  "+Calculator.AddDigitNumbers(3,6,1));


		 //27. Multiple37 : Given a number n, return true if it is divisible by either 3 or 7.
		  System.out.println("Program-No \"27\" Output is -  "+Calculator.Multiple37(21));


		 //28. LargestOfThree : Given three numbers as input, return the largest number.
		 System.out.println("Program-No \"28\" Output is -  "+Calculator.LargestOfThree(45,76,65));


		 /* 29. DaysInMonth : Given the number of the month in 2014 (1 for January, 12 for December),
		 return the number of days in it.*/
		 System.out.println("Program-No \"29\" Output is -  "+Calculator.DaysInMonth(2));


		 //30. ChangeCharCase : A method which accepts a char as intput and returns a char whoes case if changed.
		 System.out.println("Program-No \"30\" Output is -  "+Calculator.ChangeCharCase('g'));


		 /*31. IsDigit : Given a char as input, return true if it is a digit (i.e. between 0 to 9) */
		  System.out.println("Program-No \"31\" Output is -  "+Calculator.IsDigit('a'));	


		  /*32. MiddleChar : Given three chars as input, 
 	      return the char that would come in the middle if the chars were arranged in order. 
 	      Note that > operator can be used for chars.*/
 	      System.out.println("Program-No \"32\" Output is -  "+Calculator.MiddleChar('j','o','a'));


 	     /* 33. SameLastDigit : Given 2 non negative numbers a and b, 
 	     return true if both of them have the same last digit */
 	     System.out.println("Program-No \"33\" Output is -  "+Calculator.SameLastDigit(989,677));


 	     /*34. AddForThird : Given three numbers a, b and c, return true 
 	     if the sum of any two equals the third number.*/
 	     	System.out.println("Program-No \"34\" Output is -  "+Calculator.AddForThird(7,8,1));


 	     /* 35. LotteryPrize: Jack bought a lottery ticket. 
 	     He will get a reward based on the number of the lottery ticket. 
 	     The rules are as follows – If the ticket number is divisible by 4,
 	     he gets 6 – If the ticket number is divisible by 7, he gets 10 – 
 	     If the ticket number is divisible by both 4 and 7, he gets 20 Otherwise,
 	     he gets 0. Given the number of thelottery ticket as input, 
 	     compute the reward he will receive.*/
 	       
 	     System.out.println("Program-No \"35\" Output is -  "+Calculator.LotteryPrize(41));




 	     /* 36. LotteryPrize3 : Jack bought 3 lottery tickets.
 	     He will get a reward based on the number of the lottery ticket. 
 	     The rules are as follows – If the ticket number is divisible by 4, 
 	     he gets 6 – If the ticket number is divisible by 7, he gets 10 – 
 	     If the ticket number is divisible by both 4 and 7, he gets 20 – 
 	     Otherwise, he gets 0. Given the numbers of the 3 lottery tickets as input,
 	     compute the total reward he will receive. 
 	     In this problem define a function to compute the reward given 
 	     the ticket number and use that function to calculate the total reward.*/

 	     System.out.println("Program-No \"36\" Output is -  "+Calculator.LotteryPrize3(28,54,40));



 	     /*37. SumLast3 : Given a number as input, return the sum of its last 3 digits.*/
 	     System.out.println("Program-No \"37\" Output is -  "+Calculator.SumLast3(567898));


 	     /*38. Blackjack : Given 2 int values greater than 0, return whichever value is nearest 
 	     to 21 without being greater than 21. Return -1 if the values are greater than 21. 
 	     Also return -2 if both the values are same and less or equal to 21.*/
 	     System.out.println("Program-No \"38\" Output is -  "+Calculator.Blackjack(21,21));


 	     //39. Reverse3 : Given a 3 digit number as input, reverse it.
 	     System.out.println("Program-No \"39\" Output is -  "+Calculator.Reverse3(354));



 	     /* 40. PerfectNumber: A perfect number is a positive integer that is equal 
 	     to the sum of its factors. For example, 6 is a perfect number because 6=1+2+3;
 	     but 24 is not perfect because 24<1+2+3+4+6+8+12. Given a number n, 
 	     the objective is find out whether it is a perfect number or not.*/
 	     System.out.println("Program-No \"40\" Output is -  "+Calculator.PerfectNumber(24));


 	     /*41. A method accepts a number as input and returns a string filled with
 	      natural numbers as many as the input*/
 	      System.out.println("Program-No \"41\" Output is -  "+Calculator.naturalNumbers(18));



 	     /*42. A method accepts a number as input and returns a string filled with
 	     random integers as many as the input*/
 	     //System.out.println("Program-No \"41\" Output is -  "+Calculator.randomNum(10));

 	     /* 43. Write a method to generate even numbers between from and to 
 	     ( you should not write the logic to check if number is even or not,
 	      instead you should call isEven() method which you create earlier)*/
 	      int from=10;
 	      int to=20;
 	      System.out.println("Program-No \"43\" Output is - ");	
 	      for(int i=from;i<=to;i++){
 	     		if(Calculator.isEven(i))
 	     				
 	     		 System.out.println(i);
 	     		}

 	     	/*	Program-No "43" Output is - 
				10
				12
				14
				16
				18
				20*/


 	     /* 44. Write a method to generate odd numbers between from and to 
 	     ( you should not write the logic to check if number is odd or not, 
 	     instead you should call isOdd() method which you create earlier)*/

 	     from=5;
 	     to =17;
 	     System.out.println("Program-No \"44\" Output is - ");
 	     for(int i=from;i<=to;i++){
 	    	if(Calculator.isOdd(i))
 	    		
 	    		System.out.println(i);
 	     }

 	    /* Program-No "44" Output is - 
		5
		7
		9
		11
		13
		15
		17*/




 	     /* 45. Write a method to generate prime numbers between from and to
 	     ( you should not write the logic to check if number is prime or not, 
 	     instead you should call isPrime() method which you create earlier)*/
 	     from=1;
 	     to=16;
 	     System.out.println("Program-No \"45\" Output is - ");
 	     for(int i=from;i<=to;i++){
 	     	if(Calculator.isPrime(i))
 	     		System.out.println(i);
 	     }
/*
 	     Program-No "45" Output is - 
		2
		3
		5
		7
		11
		13*/





	}
}