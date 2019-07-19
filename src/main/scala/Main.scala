object Main extends App {
  val list: List[Int] = List(1,2,3,4,5)
  val sub: List[Int]=List(2,4)
  val len = new Length
  println (len.length(list))

  val subSeq = new SubSequence
  println(subSeq.hasSubSequence(list,sub))

  val concate = new Concate
  println(concate.concateList(list,sub))

//  val twoList=new Split
//  println(twoList.splitList())
}
