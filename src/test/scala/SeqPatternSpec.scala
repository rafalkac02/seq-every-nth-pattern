import org.scalatest._
import flatspec._
import matchers._
import SeqPattern._

class SeqPatternSpec extends AnyFlatSpec with should.Matchers {

  "checkSeq" should "verify ???" in {
    checkSeq(4, Seq(1, 2, 3, 6, 5, 6, 7)) shouldBe true
    checkSeq(3, Seq(0, 0, 0, 1, 2, 3)) should be(true)
  }

  it should "be false for empty collection or n=0" in {
    checkSeq(0, Seq.empty) should be(false)
    checkSeq(0, 0 to 10) should be(false)
    checkSeq(10, Seq.empty) shouldBe false

  }

  it should "be true for ..." in {
    checkSeq(3, Seq(0, 0, 0, 1, 2)) should be (true)
    checkSeq(3, Seq(0, 5, 0, 1, 2)) should be (false)
  }
}