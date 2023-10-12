class OldExperimentAdapter extends NewExperiment {
  private val oldExperiment = new OldExperiment

  override def performTask(experimentType: ExperimentType): Unit = experimentType match {
    case ExperimentType.INTERACTIVEEXPERIMENT => {
      println("Adapter is adding interactive environment for the experiment")
      oldExperiment.runTheExperiment()
    }
    case _ => {
      println("Adapter is running the old experiment only")
      oldExperiment.runTheExperiment()
    }
  }
}
