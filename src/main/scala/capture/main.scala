package capture

import java.io.FileOutputStream


@main def main(): Unit = {
  val later = Exercise.usingLogFile { file =>
    List(1, 2, 3).map { x => file.write("x\n".getBytes()); x * x }
  }

  later(0)
}
