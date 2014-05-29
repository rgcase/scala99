package scala99

object P02 {
  def penultimate[T](elems: List[T]): T = elems match {
    case Nil => throw new NoSuchElementException("Empty List")
    case List(_) => throw new NoSuchElementException("Singleton List")
    case _ if elems.tail.tail == Nil => elems.head
    case _ => penultimate(elems.tail)
  }
}
