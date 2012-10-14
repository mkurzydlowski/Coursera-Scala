package week4

trait List[+T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

object Nil extends List[Nothing] {
	def isEmpty = true
	def head = throw new Exception("nil.head")
	def tail = throw new Exception("nil.tail")
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
	def isEmpty = false
}

object List {
	def apply[T](x1: T, x2: T): List[T] = new Cons[T](x1, new Cons[T](x2, Nil))
}