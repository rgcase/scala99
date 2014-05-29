package scala99

import scala99.P04._
import scala99.P09._

object P10 {
  def encode[T](elems: List[T]): List[(Int, T)] =
    pack(elems) map { (elem) => (length(elem), elem.head) }
}
