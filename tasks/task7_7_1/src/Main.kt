// Task 7.7.1: program to compute stats for a numeric dataset



fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("File name: ")
        return
    }

    val filename = args[0]

    val data = readData(filename)

    disStats(data)
}