// Task 7.7.1: statistics functions


import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun median(values: List<Float>): Float {

    if (values.isEmpty()) {
        //println("List cannot be empty")
        throw IllegalArgumentException("List cannot be empty")
    }

    val sorted = values.sorted()
    val n = sorted.size
    if (n % 2 == 1) {
        return sorted[n / 2]
    } else {
        return (sorted[n / 2 - 1] + sorted[n / 2]) / 2f}


}


fun disStats(values: List<Float>): List<Float> {
    if (values.isEmpty()) {
        println("List cannot be empty")
        exitProcess(1)
    }


    
    val minimum = values.minOrNull() ?: 0f
    val maximum = values.maxOrNull() ?: 0f
    val mean = values.average().toFloat()
    val median = median(values)
    

    return listOf(minimum, maximum, mean, median)

    //println("Minimum: ${values.minOrNull()}")
    //println("Maximum: ${values.maxOrNull()}")
    //println("Mean: ${values.average()}")
    //println("Median: ${median(values)}")
    
    }

