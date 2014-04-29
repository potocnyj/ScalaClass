package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
  {
    if(c == 0 || c == r) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = 
  {
    def countParens(chars: List[Char], parenCount: Int): Int =
    {
      if(chars.isEmpty) 0
      else if(chars.head.equals('(')) 1 + countParens(chars.drop(1), parenCount+1)
      else if(chars.head.equals(')') && (parenCount > 0)) countParens(chars.drop(1), parenCount-1) - 1
      else if(chars.head.equals(')') && (parenCount <= 0)) -1
      else countParens(chars.drop(1), parenCount)
    }
        
    if(chars.isEmpty) true
    else if(countParens(chars, 0) == 0) true
    else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 
  {
    if(money == 0 || coins.isEmpty) 0
    else 0
  }
}