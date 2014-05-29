package scala99

import scala99.P04._
import scala99.P09._

object P11 {
  def encodeModified[T](elems: List[T]): List[Any] =
    pack(elems) map { (elem) => elem match {
      case List(_) => elem.head
      case x => (length(x), x.head)
      }
    }
}
