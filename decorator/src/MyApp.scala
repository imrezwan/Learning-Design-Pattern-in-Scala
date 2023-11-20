


object MyApp extends App {

  val expressoCoffee = new SimpleCoffee with SugarAdded
  println("Expresso => cost: " + expressoCoffee.getCost + " ; description: " + expressoCoffee.getDescription)

  val latteCoffee = new SimpleCoffee with SugarAdded with FoamAdded with MilkAdded
  println("Latte => cost: " + latteCoffee.getCost + " ; description: " + latteCoffee.getDescription)
}
