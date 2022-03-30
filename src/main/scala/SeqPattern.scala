object SeqPattern {

  def checkSeq(n: Int, ns: Seq[Int]): Boolean = {
    if (n == 0 || ns.isEmpty) return false

    ns.grouped(n).forall {
      case seq if seq.length != n => true
      case seq => seq.last == seq.init.sum
    }
  }
}
