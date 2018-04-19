object NineNineProblems extends App {

  /** Find the last element of a list **/
def lastElement(listA : List[Int]) : Int = {
  listA.last

  }

  /** Find the last but one element of a list **/
  def secondLastElement(listB : List[Int]) : Int = {
    listB.last - 1
  }

  /** Find the Kth element of a list **/
  def kthElement(listC : List[Int]) : Option[Int] = {
    listC.lift(4)
  }

  /** Find the number of elements of a list **/
  def countList(listD : List[Int]) : Int = {
    listD.length
  }

  /** Reverse a list.**/
  def reverseList(listE : List[Int]) : List[Int] = {
    listE.reverse
  }

  /** Find out whether a list is a palindrome **/
  def palindromeList(listF : List[Int]) : List[Int] = {
    listF.reverse
  }

  /** Flatten a nested list structure **/
  def flattenList(listG : List[Any]) : List[Any] = {
   listG match  {
      case _: List[Any] =>
      case _ =>
    }
  }


  /** Eliminate consecutive duplicates of list elements **/
  def eliminateDuplicates(listH: List[Char]) : List[Char] = ???


}
