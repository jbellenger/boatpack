package org.bellenger.boatpack.model

case class Rower(
    weightPounds: Int,
    ageYears: Int,
    sides: Iterable[Side],
    gender: Gender,
    latest: HistoricPerformance)
