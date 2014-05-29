package scala99

object P05 {
  def reverse[T](elems: List[T]): List[T] = {
    def reverseAcc[T](list: List[T], acc: List[T]): List[T] = list match {
      case Nil => acc
      case _ => reverseAcc(list.tail, list.head :: acc)
    }

    reverseAcc(elems, Nil)
  }
}
