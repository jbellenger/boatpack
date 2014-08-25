package org.bellenger.boatpack.core

import org.bellenger.boatpack.model.{Boat, Rower}

/**
 * Based on values defined here:
 * http://www.usrowing.org/Libraries/Masters/mhandchart.sflb.ashx
 *
 * Handicap values are seconds per 1000m
 */
object UsRowingAgeFilter extends Filter {
  override def apply(r: Boat): Boat = ???
}
