package scala99

object P07 {
  def flatten(elems: List[Any]): List[Any] = {
    if (elems == Nil) Nil
    else elems.head match {
      case list: List[Any] => flatten(list) ++ flatten(elems.tail)
      case _ => elems.head :: flatten(elems.tail)
    }
  }
}
