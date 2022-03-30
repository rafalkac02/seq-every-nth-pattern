object SeqPattern {

  def checkSeq(n: Int, ns: Seq[Int]): Boolean = {
    if (n == 0 || ns.isEmpty) return false

    ns.grouped(n).forall { seq =>
      if (seq.length != n) true
      else {
        seq.last == seq.init.sum
      }
    }
  }
}
