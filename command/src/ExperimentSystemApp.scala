

object ExperimentSystemApp extends App {
  val experimentRunner: ExperimentRunner = new ExperimentRunner()
  val experimentManager: ExperimentManager = new ExperimentManager()

  val mlModelExperiment: ExperimentCommand = new MLModelExperimentCommand(experimentRunner, "ImageRecognitionModel")
  val tableDataExperiment: ExperimentCommand = new TableDataExperimentCommand(experimentRunner, "SalesData")

  experimentManager.addExperimentCommand(mlModelExperiment)
  experimentManager.addExperimentCommand(tableDataExperiment)

  experimentManager.executeExperiments()
}

