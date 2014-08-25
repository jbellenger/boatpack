package org.bellenger.boatpack.core

import org.bellenger.boatpack.model.Boat

/**
 * A weight adjustment calculator
 * @see http://www.concept2.com/indoor-rowers/training/calculators/weight-adjustment-calculator
 */
object Concept2WeightFilter extends Filter {
  // Wf = [body weight in lbs / 270] raised to the power .222
  override def apply(r: Boat): Boat = ???
}
