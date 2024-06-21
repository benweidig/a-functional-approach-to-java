//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-8. Scala’s Try/Success/Failure pattern
//

import java.nio.file.Path
import scala.util.{Failure, Success, Try}

object TrySuccssFailure extends App {

  def readString(path: Path): Try[String] = Try {
    // code that will throw an Exception
    return Try("")
  }

  val path = Path.of("");

  readString(path) match {
    case Success(value) => println(value.toUpperCase())
    case Failure(e) => println("Couldn't read file: " + e.getMessage)
  }
}

