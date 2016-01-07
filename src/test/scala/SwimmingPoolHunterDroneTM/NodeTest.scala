package SwimmingPoolHunterDroneTM

import org.scalatest._

class NodeTest extends FlatSpec with ShouldMatchers {

  "Residential area" should "be 7, 8, 9, 12, 14, 17, 18 ,19 ids when range is 1" in {
    val node = Node(13, None)
    node.getResidentialAreaInARange(1) shouldBe Set(7, 8, 9, 12, 14, 17, 18 ,19)
  }

  it should "be 1, 2, 3, 4, 5, 6, 10, 11, 15, 16, 20, 21, 22, 23, 24, 25 ids when range is 2" in {
    val node = Node(13, None)
    node.getResidentialAreaInARange(2) shouldBe Set(1, 2, 3, 4, 5, 6, 10, 11, 15, 16, 20, 21, 22, 23, 24, 25)
  }

  it should "be from 26 until 49 ids when range is 3" in {
    val node = Node(13, None)
    node.getResidentialAreaInARange(3) shouldBe (26 to 49).toSet
  }
}
