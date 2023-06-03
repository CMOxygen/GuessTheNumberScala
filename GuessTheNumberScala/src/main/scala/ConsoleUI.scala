package com.cmoxygen.guessnum

import scala.io.StdIn

object ConsoleUI:
  def mainMenu(): Unit =
    var s = ""

    while s != "/exit" do
      println("Type /play to play")
      println("Type /exit to exit")
      val whitespace = " "

      s = StdIn.readLine().toLowerCase().filterNot(_.isWhitespace)

      s match
        case "/play" => GameManager.run()
        case "/exit" =>
        case _ => println("Wrong input")

  def inputMaxValue(): Int =
    var i = 0

    while i < 2 do
      println("Input max value you want to guess")

      try
        i = StdIn.readInt()
      catch
        case ex: java.lang.NumberFormatException => println("Wrong input!")

      if i < 1 then
        println("Wrong input")
    i

  def inputAnswer(min: Int, max: Int): Int =
    var s = 0

    while s < min || s > max do
      println(s"Enter number between $min and $max")

      try
        s = StdIn.readInt()
      catch
        case ex: java.lang.NumberFormatException => println("Wrong input!")
    s

  def printResult(value: Int, result: Boolean): Unit =
    println(s"${if result then "You won!" else "You lost!"}" + s"The right answer is $value")

