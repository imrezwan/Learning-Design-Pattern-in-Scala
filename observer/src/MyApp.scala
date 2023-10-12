


object MyApp extends App {
  val experiment = new Experiment()
  experiment.subscribe(new S3Observer)
  experiment.subscribe(new RedshiftObserver)

  experiment.changing(ExperimentType.GENERICEXPERIMENT);
  experiment.changing(ExperimentType.CVTRAINEXPERIMENT);
}