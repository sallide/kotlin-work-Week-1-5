// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    
    
    "Median when size=1" {
        val list = listOf(5f)
        median(list) shouldBe (5f plusOrMinus tolerance)
    }
    
    
    
    "Median when size=2" {
        val list = listOf(4f, 8f)
        median(list) shouldBe (6f plusOrMinus tolerance)
    }
    
    
    "Median when size=3" {
        val list = listOf(3f, 1f, 9f)
        median(list) shouldBe (3f plusOrMinus tolerance)
    }
    
    
    "Median when size=4" {
        val list = listOf(10f, 2f, 8f, 4f)
        median(list) shouldBe (6f plusOrMinus tolerance)
    }
    
    
})
