object Lecture1_7
{
   // gcd's last call is to itself - this is
   // an example of tail recursion and allows
   // gcd to evaluate in constant stack space.
   def gcd(x: Int, y: Int): Int =
   {
       if(y == 0) x
       else gcd(y, x % y)
   }                                              //> gcd: (x: Int, y: Int)Int
   
   gcd(14, 21)                                    //> res0: Int = 7
   
   // factorial is not a tail recursive function.
   def factorial(x: Int): Int =
   {
   		if(x == 0) 1
   		else x * factorial(x-1)
   }                                              //> factorial: (x: Int)Int
   
   factorial(5)                                   //> res1: Int = 120
   
   // Make factorial tail recursive.
   def factorialTail(x: Int): Int =
   {
   		def loop(acc: Int, x: Int): Int =
   		{
   			if(x == 0) acc
   			else loop(acc * x, x-1)
   		}
   		
   		loop(1, x)
   }                                              //> factorialTail: (x: Int)Int
   
   factorialTail(4)                               //> res2: Int = 24
}