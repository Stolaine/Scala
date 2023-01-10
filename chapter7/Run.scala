object Run extends App {
    val filesHere = new java.io.File(".").listFiles
    for (file <- filesHere
        if file.isFile
        if file.getName.endsWith(".scala"))
        Console println file
    
    for (i <- 1 to 4)
        Console println s"Iteration $i"
    
    for (i <- 1 until 4)
        Console println s"Iteration $i"
    
    val obj = new ForLoop(filesHere)
    obj.grep(".*gcd.*")
}