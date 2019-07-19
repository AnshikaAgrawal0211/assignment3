class Concate {
  def concateList[A](l1: List[A], l2: List[A]): List[A] = {
    l1 match {
      case _ if (l2.isEmpty) => l1
      case _ if (l1.isEmpty) => l2
      case _ => concateList(l2.head :: l1, l2.tail)
    }
  }
}
