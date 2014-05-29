package scala99

object P04 {
  def length[T](elems: List[T]): Int = {
    def lengthAcc[T](elems: List[T], acc: Int): Int = elems match {
      case Nil => acc
      case _ =>lengthAcc(elems.tail, 1 + acc)
    }

    lengthAcc(elems, 0)
  }
}
