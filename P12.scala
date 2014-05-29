package scala99

object P12 {
  def decode[T](elems: List[(Int, T)]): List[T] =
    elems.
    map {
      (elem) => List.fill(elem._1)(elem._2)
    }.
    flatten
}
