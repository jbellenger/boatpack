package org.bellenger.boatpack.model

case class Boat(seats: Iterable[Seat]) extends Reversible[Boat] {
  override def reversed: Boat = {
    copy(seats = seats.map(_.reversed))
  }
}

