package com.cmoxygen.guessnum

import org.scalatest.funsuite.AnyFunSuite

import java.io.{ByteArrayOutputStream, StringReader}
import scala.util.Random

class ConsoleUITest extends AnyFunSuite:

  val rn = new RandomNumber(10)
  val r = new Random()

  test("ConsoleUI.inputMaxValue() : Int") {

    val arr = Array.fill(100) {
      r.nextInt(19).toString
    }
    val in = new StringReader(arr.mkString("\n"))
    val out = new ByteArrayOutputStream()

    Console.withOut(out) {
      Console.withIn(in) {
        assert(ConsoleUI.inputMaxValue() >= rn.min)
      }
    }
    System.out.println("I'M FABOLOUS")
  }

  test("ConsoleUI.inputAnswer(min: Int, max: Int) : Int") {

    val arr = Array.fill(100) {
      r.nextInt(19).toString
    }
    val in = new StringReader(arr.mkString("\n"))
    val out = new ByteArrayOutputStream()

    Console.withOut(out) {
      Console.withIn(in) {
        assert(ConsoleUI.inputAnswer(rn.min, rn.max) >= rn.min && ConsoleUI.inputAnswer(rn.min, rn.max) <= rn.max)
      }
    }
  }
