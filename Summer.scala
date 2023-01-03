import CheckSumAccumulator.calculate

object Summer {
    def main(args: Array[String]) = {
        for (arg <- args)
            Console println s"${arg}: ${calculate(arg)}"
    }
}