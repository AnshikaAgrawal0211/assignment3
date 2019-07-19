class Length {

  def length[A](l: List[A]): Int = l.foldRight(0)((_, n) => n + 1)

}
