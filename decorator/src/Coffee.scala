import scala.collection.mutable.ListBuffer

trait Coffee {
  def getCoffeeIngredients: ListBuffer[String]
  def getCost: Int
  def getDescription: String = this.getCoffeeIngredients.mkString(" , ")
}


class SimpleCoffee extends Coffee {
  override def getCoffeeIngredients: ListBuffer[String] = ListBuffer("Coffee Beans", "Water")

  override def getCost: Int = 50
}

trait MilkAdded extends Coffee {
  abstract override def getCoffeeIngredients: ListBuffer[String] = super.getCoffeeIngredients :+ "Steamed Milk"

  abstract override def getCost: Int = super.getCost + 50
}

trait FoamAdded extends Coffee {
  abstract override def getCoffeeIngredients: ListBuffer[String] = super.getCoffeeIngredients :+ "Foam"

  abstract override def getCost: Int = super.getCost + 30
}

trait SugarAdded extends Coffee {
  abstract override def getCoffeeIngredients: ListBuffer[String] = super.getCoffeeIngredients :+ "Sugar"

  abstract override def getCost: Int = super.getCost + 40
}