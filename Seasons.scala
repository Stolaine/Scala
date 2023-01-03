import CheckSumAccumulator.calculate

object Seasons extends App {
    for (arg <- args)
        Console println s"${arg}: ${calculate(arg)}"
}