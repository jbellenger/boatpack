package org.bellenger.boatpack.model

sealed trait Side extends Reversible[Side]

case object Port extends Side {
  override def reversed: Side = Starboard
}
case object Starboard extends Side {
  override def reversed: Side = Port
}
case object Both extends Side {
  override def reversed: Side = this
}
