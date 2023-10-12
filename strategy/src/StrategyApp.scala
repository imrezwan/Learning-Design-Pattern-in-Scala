object StrategyApp extends App {
  val pmeWork = new ProjectWork(new PMEWorkStrategy)
  pmeWork.doWork()

  val deepcortexWork = new ProjectWork(new DeepcortexWorkStrategy)
  deepcortexWork.doWork()
}
