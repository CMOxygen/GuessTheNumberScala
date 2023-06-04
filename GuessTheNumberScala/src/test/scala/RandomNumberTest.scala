package com.cmoxygen.guessnum

import org.scalatest.funsuite.AnyFunSuite

class RandomNumberTest extends AnyFunSuite:
  val randomNumberToTest = new RandomNumber(10)

  test("RandomNumber.min") {
    assert(randomNumberToTest.min == 1)
  }

  test("RandomNumber.max") {
    assert(randomNumberToTest.max == 10)
  }

  test("RandomNumber.value") {
    assert(randomNumberToTest.value == 0)
  }

  test("RandomNumber.generateValue(that: RandomNumber): RandomNumber") {

    for i <- 0 to 100 do
      assert(randomNumberToTest.generateValue(randomNumberToTest).value > 0)
      assert(randomNumberToTest.generateValue(randomNumberToTest).value <= 10)
  }



