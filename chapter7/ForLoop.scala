import java.io.File

class ForLoop(filesHere: Array[File]) {
    val files: Array[File] = filesHere

    def grep(pattern: String): Unit = {
        for {
            file <- files
            if file.getName.endsWith(".txt")
            line <- fileLines(file)
            if line.trim.matches(pattern)}
            Console println s"${file}: ${line.trim}"
    }

    def fileLines(file: File) = 
        scala.io.Source.fromFile(file).getLines().toList
}