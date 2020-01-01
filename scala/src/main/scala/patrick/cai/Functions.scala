package patrick.cai

object Functions {
  def main(args: Array[String]): Unit = {
    def addA(x: Int) = x + 100;

    val add = (x: Int) => {
      var a = x + 100
      a = a + a
      a
    }

    println(addA(1))
    println(add(1))
  }
}
