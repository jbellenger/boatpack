package org.bellenger.boatpack.model

import scala.concurrent.duration.FiniteDuration

/**
 * An individual performance by a rower
 */
case class HistoricPerformance(distanceMeters: Int, duration: FiniteDuration)
