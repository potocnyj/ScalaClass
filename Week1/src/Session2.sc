object session2 {
  def abs(x: Double) = if(x<0) -x else x          //> abs: (x: Double)Double
  
  // Clean up the implementation of session 1
  // by encapsulating sqrt's supporting functions in a block.
  
  // Putting the supporting functions in a block allows us to remove redundant
  // definitions of x (we no longer have to pass x into sqrtIter,
  // isGoodEnough and improve because it has the same value
  // throughout sqrt's scope).
  def sqrt(x: Double) =
  {
      def sqrtIter(guess: Double): Double =
        {
          if (isGoodEnough(guess)) guess
          else sqrtIter(improve(guess))
        }

      def isGoodEnough(guess: Double): Boolean =
        {
          abs(guess * guess - x) / x < 0.001
        }

      def improve(guess: Double): Double =
        {
          (guess + x / guess) / 2
        }

			// Our first guess will always be 1.0.
      sqrtIter(1.0)
   }                                              //> sqrt: (x: Double)Double
    
    sqrt(2)                                       //> res0: Double = 1.4142156862745097
}