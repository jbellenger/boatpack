package org.bellenger.boatpack.model

import org.scalatest.{FlatSpec, Matchers}

class SideTest extends FlatSpec with Matchers {
  "Port" should "reverse to Starboard" in {
    Port.reversed shouldBe Starboard
  }
  "Starboard" should "reverse to Port" in {
    Starboard.reversed shouldBe Port
  }
  "Both" should "reverse to itself" in {
    Both.reversed shouldBe Both
  }
}
