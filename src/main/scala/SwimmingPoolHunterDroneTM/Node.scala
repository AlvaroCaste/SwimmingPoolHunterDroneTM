package SwimmingPoolHunterDroneTM

import SwimmingPoolHunterDroneTM.Hunter.Direction
import SwimmingPoolHunterDroneTM.Hunter.Direction.Direction

case class Node(id: Int, direction: Option[Direction]) {

  def getAdjacents(): Set[Node] = {
    Direction.values.map(direction =>
      Node(Hunter.getAdjacent(this.id, direction), Option(direction))
    )
  }

  def getResidentialAreaInARange(range: Int): Set[Int] = {

    def isOtherAdjacent(node: Node): (Node) => Boolean = {
      otherNode => otherNode.direction != node.direction &&
        otherNode.direction.get != Direction.getOpposite(node.direction.get)
    }

    val adjacentsOfFirstAdjacents = getFirstAdjacentsInARange(range)
      .flatMap(node => node.getAdjacents().filter(isOtherAdjacent(node)))

    return (getFirstAdjacentsInARange(range)
      ++ adjacentsOfFirstAdjacents
      ++ getRestOfAdjacentsInARange(adjacentsOfFirstAdjacents, range - 1))
      .map(_.id)

  }

  private def getFirstAdjacentsInARange(range: Int): Set[Node] = {
    if (range == 1) return this.getAdjacents()
    val rangeDown: Int = range - 1
    return getFirstAdjacentsInARange(rangeDown)
      .flatMap(node => node.getAdjacents()
        .filter(isNextAdjacent(node)))
  }

  private def getRestOfAdjacentsInARange(firstFour: Set[Node], range: Int): Set[Node] = {
    if (range == 0) return Set()
    val nextNext: Set[Node] = firstFour
      .flatMap(node => node.getAdjacents()
        .filter(isNextAdjacent(node)))
    if (range == 1) return nextNext
    val rangeDown: Int = range - 1
    return getRestOfAdjacentsInARange(nextNext, rangeDown) ++ nextNext
  }

  private def isNextAdjacent(node: Node): (Node) => Boolean = {
    otherNode => node.direction == otherNode.direction
  }
}
