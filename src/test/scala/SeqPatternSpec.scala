import org.scalatest._
import flatspec._
import matchers._

class SeqPatternSpec extends AnyFlatSpec with should.Matchers {

  "A Function" should "return true or false after checking Seqs" in {
    val f = new SeqPattern
    f.checkSeq(4, List(1, 2, 3, 6, 5, 6, 7)) should be (true)
    f.checkSeq(0, List[Int]()) should be (false)
    f.checkSeq(3, Seq(0, 0, 0, 1, 2, 3)) should be (true)
    f.checkSeq(3, Seq(0, 0, 0, 1, 2)) should be (true)
    f.checkSeq(3, Seq(0, 5, 0, 1, 2)) should be (false)
  }

//  it should "throw NoSuchElementException if an empty stack is popped" in {
//    val emptyStack = new Stack[Int]
//    a [NoSuchElementException] should be thrownBy {
//      emptyStack.pop()
//    }
//  }
}