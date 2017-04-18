package org.example

import org.scalatest.WordSpec
import org.scalatest.prop.PropertyChecks
import org.scalatest.MustMatchers

/**
  * Created by tomoya.igarashi on 2017/04/12.
  */
class ScalaTestSampleWordSpec extends WordSpec with PropertyChecks with MustMatchers {
  "Adding positive integer by Int" must {
    "be positive integer" in {
      forAll { (a: Int, b: Int) =>
        whenever(a > 0 && b > 0) {
          val answer = a + b
          answer must be > 0 // overflow!!
        }
      }
    }
  }
  "Adding positive integer by BigInt" must {
    "be positive integer" in {
      forAll { (a: BigInt, b: BigInt) =>
        whenever(a > 0 && b > 0) {
          val answer = a + b
          answer must be > BigInt(0)
        }
      }
    }
  }
}
