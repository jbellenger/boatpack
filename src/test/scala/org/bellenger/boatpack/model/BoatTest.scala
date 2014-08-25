package org.bellenger.boatpack.model

import org.scalatest.{FlatSpec, Matchers}

class BoatTest extends FlatSpec with Matchers {
  "A Boat" should "be reversible" in {
    Boat(List(Seat(42, Port))).reversed shouldBe Boat(List(Seat(42, Starboard)))
  }
}
