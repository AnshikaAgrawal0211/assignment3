class SubSequence {
  def hasSubSequence[A](list: List[A], sub: List[A]): Boolean = {
      list match {
        case _ if (list.isEmpty) => false
        case _ if (sub.isEmpty) => true
        case _ if (sub.head == list.head ) => hasSubSequence(list.tail,sub.tail)
        case _ if (sub.head != list.head) => hasSubSequence(list.tail,sub)
    }
  }

}
