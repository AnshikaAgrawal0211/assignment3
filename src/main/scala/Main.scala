object Main extends App {
  val list: List[Int] = List(1,2,8,9,6,4,10)
  val sub: List[Int]=List(2,8,60 )
  val len = new Length
  println (len.length(list))

  val subSeq = new SubSequence
  println(subSeq.hasSubSequence(list,sub))

  val concate = new Concate
  println(concate.concateList(list,sub))

}
