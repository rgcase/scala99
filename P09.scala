package scala99

object P09 {
  def pack[T](elems: List[T]): List[List[T]] = {
    def packAcc[T](list: List[T], acc: List[T]): List[List[T]] = (list, acc) match {
      case (Nil, ac) => if (ac == Nil) Nil else List(ac)
      case (ls, Nil) => packAcc(ls.tail, List(ls.head))
      case (ls, ac) => if (ls.head == ac.head) packAcc(ls.tail, ls.head :: ac)
                       else ac :: packAcc(ls.tail, List(ls.head))
    }

    packAcc(elems, Nil)
  }
}
