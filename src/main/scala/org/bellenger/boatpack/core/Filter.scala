package org.bellenger.boatpack.core

import org.bellenger.boatpack.model.Boat

trait Filter {
  def apply(r: Boat): Boat
}
