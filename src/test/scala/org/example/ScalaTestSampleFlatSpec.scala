package org.example

import org.scalatest.{FlatSpec, Matchers}

class ScalaTestSampleFlatSpec extends FlatSpec with Matchers {
  val xs = List(1, 2, 3)
  "List(1, 2, 3)" should "be three length" in {
    xs.length should be(3)
  }
  it should "throw an IndexOutOfBoundsException if specified index 3" in {
    an[IndexOutOfBoundsException] should be thrownBy {
      xs(3)
    }
  }
}
