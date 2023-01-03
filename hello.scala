import scala.io.Source

for (line <- Source.fromFile("hello.scala").getLines()) {
    println(s"${line.length} $line")
}