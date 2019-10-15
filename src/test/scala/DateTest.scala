import org.scalatest.FunSuite

class DateTest extends FunSuite {
  test("new instance") {
    val d = new Date(2019,9,32)
    assert(d.year == 2019)
  }
}
