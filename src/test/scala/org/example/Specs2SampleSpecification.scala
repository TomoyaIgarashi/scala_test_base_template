package org.example

/**
  * Created by tomoya.igarashi on 2017/04/03.
  */

import org.specs2.mutable._

object Specs2SampleSpecification extends Specification {
  "1 + 1" should {
    "be equal to 2" in {
      val answer = 1 + 1
      answer must_== 3 // Test FAILED!!
    }
  }

  "List(1, 2, 3)" should {
    val xs = List(1, 2, 3)
    "be length 3" in {
      xs.length must_== 3
    }
    "throw an IndexOutOfBoundsException if specified index 3" in {
      xs(3) must throwA[IndexOutOfBoundsException]
    }
  }
}
