// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt


import kotlin.math.sqrt


/*
typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here


fun isValidTriangle(triangle: Triangle): Boolean {


    val (a, b, c) = triangle

    return a + b > c && a + c > b && b + c > a
}


fun triangleArea(triangle: Triangle): Double {

     if (!isValidTriangle(triangle)) {
        throw IllegalArgumentException("Not a valid triangle")

    }


    val (a, b, c) = triangle


    val s = (a + b + c) / 2


    return sqrt(s * (s - a) * (s - b) * (s - c))

    }


    

//./kotlin test -m triangles

*/

class Triangle (val sideA: Double, val sideB: Double, val sideC: Double) {

    init{
        
        
        if (!(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)) {
            throw IllegalArgumentException("Not a valid triangle")
        }
    }
    
    val perimeter: Double
        get() = sideA + sideB + sideC
        
    val semiPerimeter: Double
        get() = perimeter / 2
    
    
    //val s = ((sideA + sideB + sideC) / 2)
        
    val area get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
        
    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
    
    }
    
    
    
    
    
    