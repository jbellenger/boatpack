package org.bellenger.boatpack.model

trait Reversible[T] {
  def reversed: T
}
