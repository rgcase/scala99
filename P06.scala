package scala99

import scala99.P05._

object P06 {
  def isPalindrome[T](elems: List[T]): Boolean = elems == reverse(elems)
}
