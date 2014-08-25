package org.bellenger.boatpack.model

// bow always has position=1
case class Seat(position: Int, side: Side) extends Reversible[Seat] {
  override def reversed: Seat = copy(side = side.reversed)
}
