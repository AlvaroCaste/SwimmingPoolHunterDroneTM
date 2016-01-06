package SwimmingPoolHunterDroneTM

import SwimmingPoolHunterDroneTM.Hunter.Direction.Direction

object Hunter {

  private def getResidentialAreaId(coordX: Double, coordY: Double): Int = {
    if (coordX == 38.56889 && coordY == 40.511107) return 13
    if (coordX == 28.56889 && coordY == 45.511107) return 7
    0
  }

  private def getAdjacent(originId: Int, direction: Direction): Int = {
    if (originId == 13) {
      direction match {
        case Direction.UP => return 8
        case Direction.DOWN => return 18
        case Direction.LEFT => return 12
        case Direction.RIGHT => return 14
      }
    }

    if (originId == 7) {
      direction match {
        case Direction.UP => return 2
        case Direction.DOWN => return 12
        case Direction.LEFT => return 6
        case Direction.RIGHT => return 8
      }
    }

    if (originId == 8) {
      direction match {
        case Direction.UP => return 3
        case Direction.DOWN => return 13
        case Direction.LEFT => return 7
        case Direction.RIGHT => return 9
      }
    }

    if (originId == 9) {
      direction match {
        case Direction.UP => return 4
        case Direction.DOWN => return 14
        case Direction.LEFT => return 8
        case Direction.RIGHT => return 10
      }
    }

    if (originId == 14) {
      direction match {
        case Direction.UP => return 9
        case Direction.DOWN => return 19
        case Direction.LEFT => return 13
        case Direction.RIGHT => return 15
      }
    }

    if (originId == 19) {
      direction match {
        case Direction.UP => return 14
        case Direction.DOWN => return 24
        case Direction.LEFT => return 18
        case Direction.RIGHT => return 20
      }
    }

    if (originId == 18) {
      direction match {
        case Direction.UP => return 13
        case Direction.DOWN => return 23
        case Direction.LEFT => return 17
        case Direction.RIGHT => return 19
      }
    }

    if (originId == 17) {
      direction match {
        case Direction.UP => return 12
        case Direction.DOWN => return 22
        case Direction.LEFT => return 16
        case Direction.RIGHT => return 18
      }
    }

    if (originId == 12) {
      direction match {
        case Direction.UP => return 7
        case Direction.DOWN => return 17
        case Direction.LEFT => return 11
        case Direction.RIGHT => return 13
      }
    }

    if (originId == 1) {
      direction match {
        case Direction.UP => return 27
        case Direction.DOWN => return 6
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 2
      }
    }

    if (originId == 2) {
      direction match {
        case Direction.UP => return 28
        case Direction.DOWN => return 7
        case Direction.LEFT => return 1
        case Direction.RIGHT => return 3
      }
    }

    if (originId == 3) {
      direction match {
        case Direction.UP => return 29
        case Direction.DOWN => return 8
        case Direction.LEFT => return 2
        case Direction.RIGHT => return 4
      }
    }

    if (originId == 4) {
      direction match {
        case Direction.UP => return 30
        case Direction.DOWN => return 9
        case Direction.LEFT => return 3
        case Direction.RIGHT => return 5
      }
    }

    if (originId == 5) {
      direction match {
        case Direction.UP => return 31
        case Direction.DOWN => return 10
        case Direction.LEFT => return 4
        case Direction.RIGHT => return 34
      }
    }

    if (originId == 10) {
      direction match {
        case Direction.UP => return 5
        case Direction.DOWN => return 15
        case Direction.LEFT => return 9
        case Direction.RIGHT => return 36
      }
    }

    if (originId == 15) {
      direction match {
        case Direction.UP => return 10
        case Direction.DOWN => return 20
        case Direction.LEFT => return 14
        case Direction.RIGHT => return 38
      }
    }

    if (originId == 20) {
      direction match {
        case Direction.UP => return 15
        case Direction.DOWN => return 25
        case Direction.LEFT => return 19
        case Direction.RIGHT => return 40
      }
    }

    if (originId == 25) {
      direction match {
        case Direction.UP => return 20
        case Direction.DOWN => return 48
        case Direction.LEFT => return 24
        case Direction.RIGHT => return 42
      }
    }

    if (originId == 24) {
      direction match {
        case Direction.UP => return 19
        case Direction.DOWN => return 47
        case Direction.LEFT => return 23
        case Direction.RIGHT => return 25
      }
    }

    if (originId == 23) {
      direction match {
        case Direction.UP => return 18
        case Direction.DOWN => return 46
        case Direction.LEFT => return 22
        case Direction.RIGHT => return 24
      }
    }

    if (originId == 22) {
      direction match {
        case Direction.UP => return 17
        case Direction.DOWN => return 45
        case Direction.LEFT => return 21
        case Direction.RIGHT => return 23
      }
    }

    if (originId == 21) {
      direction match {
        case Direction.UP => return 16
        case Direction.DOWN => return 44
        case Direction.LEFT => return 41
        case Direction.RIGHT => return 22
      }
    }

    if (originId == 16) {
      direction match {
        case Direction.UP => return 11
        case Direction.DOWN => return 21
        case Direction.LEFT => return 39
        case Direction.RIGHT => return 17
      }
    }

    if (originId == 11) {
      direction match {
        case Direction.UP => return 6
        case Direction.DOWN => return 16
        case Direction.LEFT => return 37
        case Direction.RIGHT => return 12
      }
    }

    if (originId == 6) {
      direction match {
        case Direction.UP => return 1
        case Direction.DOWN => return 11
        case Direction.LEFT => return 35
        case Direction.RIGHT => return 7
      }
    }

    if (originId == 26) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 33
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 27
      }
    }

    if (originId == 27) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 1
        case Direction.LEFT => return 26
        case Direction.RIGHT => return 28
      }
    }

    if (originId == 28) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 2
        case Direction.LEFT => return 27
        case Direction.RIGHT => return 29
      }
    }

    if (originId == 29) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 3
        case Direction.LEFT => return 28
        case Direction.RIGHT => return 30
      }
    }

    if (originId == 30) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 4
        case Direction.LEFT => return 29
        case Direction.RIGHT => return 31
      }
    }

    if (originId == 31) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 5
        case Direction.LEFT => return 30
        case Direction.RIGHT => return 32
      }
    }

    if (originId == 32) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 34
        case Direction.LEFT => return 31
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 34) {
      direction match {
        case Direction.UP => return 32
        case Direction.DOWN => return 36
        case Direction.LEFT => return 5
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 36) {
      direction match {
        case Direction.UP => return 34
        case Direction.DOWN => return 38
        case Direction.LEFT => return 10
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 38) {
      direction match {
        case Direction.UP => return 36
        case Direction.DOWN => return 40
        case Direction.LEFT => return 15
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 40) {
      direction match {
        case Direction.UP => return 38
        case Direction.DOWN => return 42
        case Direction.LEFT => return 20
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 42) {
      direction match {
        case Direction.UP => return 40
        case Direction.DOWN => return 49
        case Direction.LEFT => return 25
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 49) {
      direction match {
        case Direction.UP => return 42
        case Direction.DOWN => return 0
        case Direction.LEFT => return 48
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 48) {
      direction match {
        case Direction.UP => return 25
        case Direction.DOWN => return 0
        case Direction.LEFT => return 47
        case Direction.RIGHT => return 49
      }
    }

    if (originId == 47) {
      direction match {
        case Direction.UP => return 24
        case Direction.DOWN => return 0
        case Direction.LEFT => return 46
        case Direction.RIGHT => return 48
      }
    }

    if (originId == 46) {
      direction match {
        case Direction.UP => return 23
        case Direction.DOWN => return 0
        case Direction.LEFT => return 45
        case Direction.RIGHT => return 47
      }
    }

    if (originId == 45) {
      direction match {
        case Direction.UP => return 22
        case Direction.DOWN => return 0
        case Direction.LEFT => return 44
        case Direction.RIGHT => return 46
      }
    }

    if (originId == 44) {
      direction match {
        case Direction.UP => return 21
        case Direction.DOWN => return 0
        case Direction.LEFT => return 43
        case Direction.RIGHT => return 45
      }
    }

    if (originId == 43) {
      direction match {
        case Direction.UP => return 41
        case Direction.DOWN => return 0
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 44
      }
    }

    if (originId == 41) {
      direction match {
        case Direction.UP => return 39
        case Direction.DOWN => return 43
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 21
      }
    }

    if (originId == 39) {
      direction match {
        case Direction.UP => return 37
        case Direction.DOWN => return 41
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 16
      }
    }

    if (originId == 37) {
      direction match {
        case Direction.UP => return 35
        case Direction.DOWN => return 39
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 11
      }
    }

    if (originId == 35) {
      direction match {
        case Direction.UP => return 33
        case Direction.DOWN => return 37
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 6
      }
    }

    if (originId == 33) {
      direction match {
        case Direction.UP => return 26
        case Direction.DOWN => return 35
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 1
      }
    }

    return 0
  }

  def getAllResidentialAreaInARange(coordX: Double, coordY: Double, range: Int): Set[Int] = {
    if (range == 0) return Set()
    val originId = getResidentialAreaId(coordX, coordY)
    val adjacents: Set[Int] = Direction.values.map(getAdjacentByRange(originId, _, range)).toSet
    val otherAdjacents: Set[Int] = getOtherAdjacents(originId, range, range)
    adjacents ++ otherAdjacents
  }

  def getAdjacentByRange(originId: Int, direction: Direction, range: Int): Int = {
    val adjacent: Int = getAdjacent(originId, direction)
    if (range == 1) return adjacent
    val rangeDown = range - 1
    return getAdjacentByRange(adjacent, direction, rangeDown)
  }

  def getOtherAdjacents(originId: Int, range: Int, rangeDown: Int): Set[Int] = {
    val adjacents = Direction.values.flatMap( direction =>
      getAdjacentsSide(getAdjacentByRange(originId, direction, range), direction, rangeDown)
    ).toSet
    if (rangeDown == 1) return adjacents
    return adjacents ++ getOtherAdjacents(originId, range, rangeDown - 1)
  }

  def getAdjacentsSide(originId: Int, direction: Direction, range: Int): Set[Int] = {
    if (direction == Direction.UP || direction == Direction.DOWN)
      return Set(getAdjacentByRange(originId, Direction.LEFT, range),
                  getAdjacentByRange(originId, Direction.RIGHT, range))
    return Set(getAdjacentByRange(originId, Direction.UP, range),
                getAdjacentByRange(originId, Direction.DOWN, range))
  }

  object Direction extends Enumeration {
    type Direction = Value
    val UP, DOWN, LEFT, RIGHT = Value
  }

}
