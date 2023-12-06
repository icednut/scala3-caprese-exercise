package capabilities

@main
def main(xs: Double*): Unit = {
  try
    println(xs.map(Exercise.f).sum)
  catch
    case e: Exercise.LimitExceeded => println("too large")
}