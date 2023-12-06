package capture

import java.io.FileOutputStream

object Exercise:

  def usingLogFile[T](op: (FileOutputStream^) => T): T =
    val logFile = FileOutputStream("Exercise.scala")
    val result = op(logFile)
    logFile.close()
    result

