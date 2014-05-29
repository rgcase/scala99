package scala99

object P08 {
  def compress[T](elems: List[T]): List[T] = elems match {
    case Nil => Nil
    case List(_) => elems
    case _ if elems.head == elems.tail.head => compress(elems.tail)
    case _ => elems.head :: compress(elems.tail)
  }
}
