package scala99

object P03 {
  def nth[T](num: Int, elems: List[T]): T = (num, elems) match {
    case (_, Nil) => throw new NoSuchElementException("List is too short")
    case (0, list) => list.head
    case _ => nth(num - 1, elems.tail)
  }
}
