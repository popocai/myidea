package patrick.cai

import java.io.File

import scala.io.Source
import scala.util.control.Breaks
import scala.util.control.Breaks._

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    val files = (new File(".")).listFiles();

    val loop = new Breaks;
    loop.breakable {
      for (f <- files) {
        println(f)
        if (f.isFile()) {
          val file = Source.fromFile(f);
          for (line <- file.getLines()) {
            println(line)
          }
          loop.break;
        }
      }


    }

    println("----------------Map---------------")
    val ages = Map("a" -> 1, "b" -> 2);
    for ((k, v) <- ages) {
      println(k + " is " + v + " years old")
    }


    //doWhile();
  }

  def doWhile(): Unit = {
    var line = "";
    do {
      line = scala.io.StdIn.readLine();
      println("read:" + line)
    } while (!line.isEmpty)
  }

}
