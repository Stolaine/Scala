object Run extends App {
    val filesHere = new java.io.File(".").listFiles
    for (file <- filesHere)
        Console println file
    
    for (i <- 1 to 4)
        Console println s"Iteration $i"
}