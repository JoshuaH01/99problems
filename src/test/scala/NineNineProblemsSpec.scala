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
  }
}
