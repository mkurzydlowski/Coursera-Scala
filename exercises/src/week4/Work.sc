package week4

object Work {
	new Succ(Zero) - Zero                     //> res0: week4.Nat = week4.Succ@39e6258e
	Zero + Zero                               //> res1: week4.Nat = week4.Zero$@69091c3f
	List(1, 2)                                //> res2: week4.List[Int] = week4.Cons@1899de83
	val sum = Sum(Number(1), Number(2))       //> sum  : week4.Sum = Sum(Number(1),Number(2))
	sum.eval                                  //> res3: Int = 3
	sum.show                                  //> res4: String = 1+2
}