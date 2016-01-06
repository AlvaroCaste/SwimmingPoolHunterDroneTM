package SwimmingPoolHunterDroneTM

import SwimmingPoolHunterDroneTM.Hunter.Direction.Direction

object Hunter {

  private def getResidentialAreaId(coordX: Double, coordY: Double): Int = 13

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
        case Direction.UP => return 0
        case Direction.DOWN => return 6
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 2
      }
    }

    if (originId == 2) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 7
        case Direction.LEFT => return 1
        case Direction.RIGHT => return 3
      }
    }

    if (originId == 3) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 8
        case Direction.LEFT => return 2
        case Direction.RIGHT => return 4
      }
    }

    if (originId == 4) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 9
        case Direction.LEFT => return 3
        case Direction.RIGHT => return 5
      }
    }

    if (originId == 5) {
      direction match {
        case Direction.UP => return 0
        case Direction.DOWN => return 10
        case Direction.LEFT => return 4
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 10) {
      direction match {
        case Direction.UP => return 5
        case Direction.DOWN => return 15
        case Direction.LEFT => return 9
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 15) {
      direction match {
        case Direction.UP => return 10
        case Direction.DOWN => return 20
        case Direction.LEFT => return 14
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 20) {
      direction match {
        case Direction.UP => return 15
        case Direction.DOWN => return 25
        case Direction.LEFT => return 19
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 25) {
      direction match {
        case Direction.UP => return 20
        case Direction.DOWN => return 0
        case Direction.LEFT => return 24
        case Direction.RIGHT => return 0
      }
    }

    if (originId == 24) {
      direction match {
        case Direction.UP => return 19
        case Direction.DOWN => return 0
        case Direction.LEFT => return 23
        case Direction.RIGHT => return 25
      }
    }

    if (originId == 23) {
      direction match {
        case Direction.UP => return 18
        case Direction.DOWN => return 0
        case Direction.LEFT => return 22
        case Direction.RIGHT => return 24
      }
    }

    if (originId == 22) {
      direction match {
        case Direction.UP => return 17
        case Direction.DOWN => return 0
        case Direction.LEFT => return 21
        case Direction.RIGHT => return 23
      }
    }

    if (originId == 21) {
      direction match {
        case Direction.UP => return 16
        case Direction.DOWN => return 0
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 22
      }
    }

    if (originId == 16) {
      direction match {
        case Direction.UP => return 11
        case Direction.DOWN => return 21
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 17
      }
    }

    if (originId == 11) {
      direction match {
        case Direction.UP => return 6
        case Direction.DOWN => return 16
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 12
      }
    }

    if (originId == 6) {
      direction match {
        case Direction.UP => return 1
        case Direction.DOWN => return 11
        case Direction.LEFT => return 0
        case Direction.RIGHT => return 7
      }
    }

    return 0
  }

  def getAllResidentialAreaInARange(coordX: Double, coordY: Double, range: Int): List[Int] = List()

  object Direction extends Enumeration {
    type Direction = Value
    val UP, DOWN, LEFT, RIGHT = Value
  }

}
