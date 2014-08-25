package org.bellenger.boatpack

package object model {
  /**
   * An 8+, with stroke on Port
   */
  val Boat8Plus_P = Boat(List(
    Seat(8, Port),
    Seat(7, Starboard),
    Seat(6, Port),
    Seat(5, Starboard),
    Seat(4, Port),
    Seat(3, Starboard),
    Seat(2, Port),
    Seat(1, Starboard)
  ))

  /**
   * An 8+, with stroke on Starboard
   */
  val Boat8Plus_S = Boat8Plus_P.reversed

  /**
   * A 4+, with stroke on Port
   */
  val Boat4Plus_P = Boat(List(
    Seat(4, Port),
    Seat(3, Starboard),
    Seat(2, Port),
    Seat(1, Starboard)
  ))

  val Boat4Plus_S = Boat4Plus_P.reversed
}
