package com.cmoxygen.guessnum

object GameManager:

  def run(): Unit =
    var randNum = new RandomNumber(ConsoleUI.inputMaxValue(), 0)
    randNum = randNum.generateValue(randNum)
    ConsoleUI.printResult(
      randNum.value,
      ConsoleUI.inputAnswer(randNum.min, randNum.max) == randNum.value)


