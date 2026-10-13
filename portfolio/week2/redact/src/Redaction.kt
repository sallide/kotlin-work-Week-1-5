// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
import kotlin.io.path.Path
import kotlin.io.path.appendText

fun redact(text: String, textReplace: String, censor: Char = 'X'): String {

    if (textReplace.isEmpty()) {
        return text
    }
    
    val replacement = censor.toString().repeat(textReplace.length)
    val redactedWord = text.replace(textReplace, replacement)
    
    try {
        val document = Path("document.txt")
        document.appendText(text)
        
        val redacted = Path("redacted.txt")
        redacted.appendText(redactedWord)
    } catch (e: Exception) {

    }

    return redactedWord
}