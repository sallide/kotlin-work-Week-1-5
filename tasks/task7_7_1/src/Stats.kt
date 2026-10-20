// Task 7.7.1: statistics functions


import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun median(values: List<Float>): Float {

    if (values.isEmpty()) {
        println("List cannot be empty")
        exitProcess(1)
    }

    val sorted = values.sorted()
    val n = sorted.size
    if (n % 2 == 1) {
        return sorted[n / 2]
    } else {
        return (sorted[n / 2 - 1] + sorted[n / 2]) / 2f}


}


fun stats(values: List<Float>): Triple<Float, Float, Float> {
    if (values.isEmpty()) {
        println("List cannot be empty")
        exitProcess(1)
    }


    val minimum = ("Minimum: ${values.minOrNull()}")
    val maximum = ("Maximum: ${values.maxOrNull()}")
    val mean = ("Mean: ${values.average()}")
    val median = ("Median: ${median(values)}")
    

    return Triple(minimum.toFloat(), maximum.toFloat(), mean.toFloat(), median.toFloat())
}

