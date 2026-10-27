// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer


//import kotlinx.datetime.Clock
//import kotlinx.datetime.LocalDate
//import kotlinx.datetime.TimeZone
//import kotlinx.datetime.todayIn

//import java.time.LocalDate

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted }
    val inProgress get() = items.count { it.status == ItemStatus.InProgress }
    val done get() = items.count { it.status == ItemStatus.Done }
    
    val overdue get() = items.count { 
        it.dueDate < LocalDate.parse("2026-10-05") && it.status != ItemStatus.Done
    }
    
    //it.dueDate < LocalDate.parse(java.time.LocalDate.now().toString()) && it.status != ItemStatus.Done}
    
       // compute no. of items with NotStarted status
       // compute no. of items with InProgress status
             // compute no. of items with Done status
          // compute no. of overdue items
          
          
    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        items.clear()
        
        Path(filename).forEachLine { line ->
                val parts = line.split(",", ":", limit = 3)
                if (parts.size == 3) {
                    val dueDate = LocalDate.parse(parts[0].trim())
                    val status = ItemStatus.valueOf(parts[1].trim())
                    val description = parts[2].trim()

                    items.add(ToDoItem(dueDate, status, description))
                    //out.write("${item.dueDate},${item.status},${item.description}\n")
                }
            }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        
        val initialSize = items.size
        items.removeAll { it.status == ItemStatus.Done }
        val removed = initialSize - items.size
        return removed > 0
        
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        
        if (status == null) {
            return items.toList()
        } else {
            return items.filter { it.status == status }
        }
        
        
        
        //return emptyList()
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        //return emptyList()
        
        
        return items.filter { it.dueDate == date }
        
        
    }
    
    
}

