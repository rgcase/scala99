package scala99

object P01 {
  def last[T](elems: List[T]): T = elems match {
    case Nil => throw new NoSuchElementException("Empty List")
    case _ if elems.tail == Nil => elems.head
    case _ => last(elems.tail)
  }
}
