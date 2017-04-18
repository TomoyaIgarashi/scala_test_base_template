package org.example

import org.scalatest.{DiagrammedAssertions, FunSuite}

class ScalaTestSampleSuite extends FunSuite with DiagrammedAssertions {
  test("1: 1 + 1") {
    val answer = 1 + 1
    assert(answer == 3)
  }

  test("2: 1 + 1") {
    val answer = 1 + 1
    assertResult(3) {
      answer
    }
  }

  test("3: List#contains") {
    assert(List(1, 2, 3).contains(4))
  }

  test("4: List#apply") {
    assertThrows[IllegalArgumentException] {
      val answer = List(1, 2, 3)
      answer(3)
    }
  }

  test("5: List#apply") {
    val caught = intercept[IndexOutOfBoundsException] {
      val answer = List(1, 2, 3)
      answer(3)
    }
    assert(caught.getMessage == "")
  }
}
