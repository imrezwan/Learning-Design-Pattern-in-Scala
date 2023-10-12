
trait ExperimentObserver {
  def update(experimentType: ExperimentType)
}


class S3Observer extends ExperimentObserver {

  override def update(experimentType: ExperimentType): Unit = experimentType match {
    case ExperimentType.GENERICEXPERIMENT => println("S3: updated to GENERIC experiment")
    case ExperimentType.CVTRAINEXPERIMENT => println("S3: updated to CV Train experiment")
    case ExperimentType.DEFAULTEXPERIMENT => println("S3: updated to Default experiment")
  }
}


class RedshiftObserver extends ExperimentObserver {

  override def update(experimentType: ExperimentType): Unit = experimentType match {
    case ExperimentType.GENERICEXPERIMENT => println("Redshift: updated to GENERIC experiment")
    case ExperimentType.CVTRAINEXPERIMENT => println("Redshift: updated to CV Train experiment")
    case ExperimentType.DEFAULTEXPERIMENT => println("Redshift: updated to Default experiment")
  }
}