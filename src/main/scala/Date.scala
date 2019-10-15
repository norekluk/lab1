case class Date(year :Int, month: Int, day: Int) {

  def check(): Unit ={
    (year > 0) && (12 >= month) && (month >0) && day <31
  }
}
