package com.cmoxygen.guessnum

import scala.util.Random

class RandomNumber(m: Int = 1, v: Int):

  require(m > 1)

  val min = 1
  val max: Int = m
  val value: Int = v

  def this(m: Int) = this(m, 0)

  def generateValue(that: RandomNumber): RandomNumber =
    new RandomNumber(
      that.max,
      min + new Random().nextInt((max - min) + 1)
    )
