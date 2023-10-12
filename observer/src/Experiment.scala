import scala.collection.mutable

class Experiment {
  val observers = mutable.ListBuffer[ExperimentObserver]()
  var currentExperimentType: ExperimentType = ExperimentType.DEFAULTEXPERIMENT

  def subscribe(ob: ExperimentObserver): Unit = {
    observers.append(ob)
  }

  def unsubscribe(ob: ExperimentObserver): Unit = {
    val index = observers.indexOf(ob)
    if (index != -1) {
      observers.remove(index)
    }
  }

  def changing(experimentType: ExperimentType): Unit = {
    currentExperimentType = experimentType
    notifyObservers()
  }

  def notifyObservers(): Unit = {
    observers.foreach { ob =>
      ob.update(currentExperimentType)
    }
  }
}
