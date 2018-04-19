object NineNineProblems extends App {

  /** Find the last element of a list **/
def lastElement(listA : List[Int]) : Int = {

  listA.last

  }

  /** Find the last but one element of a list **/
  def secondLastElement(listB : List[Int]) : Option[Int] = {
    listB.lift(7)
  }

  /** Find the Kth element of a list **/
  def kthElement(listC : List[Int]) = ???

}
