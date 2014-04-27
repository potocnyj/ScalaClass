object Lecture1_7
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(247); 
   // gcd's last call is to itself - this is
   // an example of tail recursion and allows
   // gcd to evaluate in constant stack space.
   def gcd(x: Int, y: Int): Int =
   {
       if(y == 0) x
       else gcd(y, x % y)
   };System.out.println("""gcd: (x: Int, y: Int)Int""");$skip(19); val res$0 = 
   
   gcd(14, 21);System.out.println("""res0: Int = """ + $show(res$0));$skip(143); 
   
   // factorial is not a tail recursive function.
   def factorial(x: Int): Int =
   {
   		if(x == 0) 1
   		else x * factorial(x-1)
   };System.out.println("""factorial: (x: Int)Int""");$skip(20); val res$1 = 
   
   factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(213); 
   
   // Make factorial tail recursive.
   def factorialTail(x: Int): Int =
   {
   		def loop(acc: Int, x: Int): Int =
   		{
   			if(x == 0) acc
   			else loop(acc * x, x-1)
   		}
   		
   		loop(1, x)
   };System.out.println("""factorialTail: (x: Int)Int""");$skip(24); val res$2 = 
   
   factorialTail(4);System.out.println("""res2: Int = """ + $show(res$2))}
}
