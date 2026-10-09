// Task 2.3

fun main() {


    val myAge = 29u
    val universeAge = 13_800_000_000L
    val status = 'M'
    val name = "Sarah"
    val height = 1.78f
    val root2 = Math.sqrt(2.0)


    println(myAge::class)
    println(universeAge::class)
    println(status::class)
    println(name::class)
    println(height::class)
    println(root2::class)


//sal@DESKTOP-12RV4CD:~/2850/kotlin-work-Week-1-5/tasks/task2_3/src$ kotlin build
//✓ Compilation successful for task2_3 [jvm]
//Build successful
//sal@DESKTOP-12RV4CD:~/2850/kotlin-work-Week-1-5/tasks/task2_3/src$ kotlin run
//class kotlin.UInt
//class kotlin.Long
//class kotlin.Char
//class kotlin.String
//class kotlin.Float
//class kotlin.Double

}
