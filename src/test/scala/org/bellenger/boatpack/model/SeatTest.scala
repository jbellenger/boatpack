package org.bellenger.boatpack.model

import org.scalatest.{FlatSpec, Matchers}

class SeatTest extends FlatSpec with Matchers {
  "A Seat" should "be reversible" in {
    Seat(42, Port).reversed shouldBe Seat(42, Starboard)
  }
}
