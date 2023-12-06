package capabilities

object Exercise:

  val limit = 10e9
  class LimitExceeded extends Exception

  def f(x: Double): Double throws LimitExceeded = {
    if x < limit then
      x * x
    else
      throw LimitExceeded()
  }
