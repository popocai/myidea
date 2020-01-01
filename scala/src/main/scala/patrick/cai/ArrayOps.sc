import scala.collection.mutable.ArrayBuffer


println("ArrayOps")

val ab = ArrayBuffer[Int]()

ab += 1
ab ++= Array(2, 3, 5)
ab ++= Array(2, 3, 7)

ab += 10

ab.trimEnd(5)
ab.insert(0, 9)
ab.appendAll(Array(9, 9, 21))

val ab2 = for (e <- ab) yield e * 2
ab2.filter(_ % 3 == 0).map( _ / 3)

ab2.filter(e => e % 3 == 0).map(_ / 3)
ab2.sum
ab2.max
ab.sorted

val a = 1






