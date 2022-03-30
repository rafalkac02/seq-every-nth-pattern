class SeqPattern {

  def checkSeq(n: Int, s: Seq[Int]): Boolean = {
    if (n == 0 || s.isEmpty) return false

    s.grouped(n).toSeq.foreach{
      seq => if (seq.length == n && seq(n-1) != seq.dropRight(1).sum) return false
    }
    true
  }
}
