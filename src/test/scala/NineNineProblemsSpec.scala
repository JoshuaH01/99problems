import org.scalatest.{MustMatchers, WordSpec}


class NineNineProblemsSpec extends WordSpec with MustMatchers {


  "NineNineProblems" when {

    "lastElement is called" should {
      "return the last element in a list" in {
        NineNineProblems.lastElement(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) mustBe 9
      }
    }

    "secondLastElement is called" should {
      "return the second last element in a list" in {
        NineNineProblems.secondLastElement(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) mustBe 8

      }
    }

    "kthElement is called" should {
      "return the Kth element in a list" in {
        NineNineProblems.kthElement(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) mustBe Option(5)

      }
    }

    "countList is called" should {
      "return the size of the list" in {
        NineNineProblems.countList(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) mustBe 9

      }
    }

    "Reverse a list is called" should {
      "return a reversed list" in {
        NineNineProblems.reverseList(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) mustBe List(9, 8, 7, 6, 5, 4, 3, 2, 1)

      }
    }

    "palindromeList is called" should {
      "return a list that is the same backwards" in {
        NineNineProblems.reverseList(List(1,1,1,2,2,2,3,3,3,2,2,2,1,1,1)) mustBe List(1,1,1,2,2,2,3,3,3,2,2,2,1,1,1)
      }
    }

    "flattenList is called" should {
      "return a flattened list " in {
        NineNineProblems.flattenList(List(List(1, 1), 2, List(3, List(5, 8)))) mustBe List[Any](1, 1, 2, 3, 5, 8)
      }
    }

/*    "eliminateDuplicates is called" should {
      "return a list with no doubles" in {
        NineNineProblems.eliminateDuplicates(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) mustBe List('a', 'b', 'c', 'a', 'd', 'e')
      }
    }*/
  }
}
