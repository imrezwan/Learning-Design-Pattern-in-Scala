object AdapterApp extends App{
  val experiment = new OldExperimentAdapter()

  experiment.performTask(ExperimentType.INTERACTIVEEXPERIMENT)
  experiment.performTask(ExperimentType.GENERICEXPERIMENT)
}
