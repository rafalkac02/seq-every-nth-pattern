import org.scalatest._
import flatspec._
import matchers._

class SeqPatternSpec extends AnyFlatSpec with should.Matchers {

  "checkSeq" should "verify ???" in {
    import SeqPattern._
    checkSeq(4, Seq(1, 2, 3, 6, 5, 6, 7)) shouldBe true
    checkSeq(0, Seq.empty[Int]) should be(false)
    checkSeq(3, Seq(0, 0, 0, 1, 2, 3)) should be(true)
  }

  it should "be true for ..." in {
    import SeqPattern._
    checkSeq(3, Seq(0, 0, 0, 1, 2)) should be (true)
    checkSeq(3, Seq(0, 5, 0, 1, 2)) should be (false)
  }
}