// Command: Abstract command representing an experiment
trait ExperimentCommand {
  def execute(): Unit
}

// Receiver: The object that performs the actual experiment
class ExperimentRunner {
  def runMLModelExperiment(modelName: String): Unit = {
    println(s"Running the ML model experiment for model: $modelName")
  }

  def processTableDataExperiment(tableName: String): Unit = {
    println(s"Processing table data experiment for table: $tableName")
  }

  // NEW REQUIREMENT FIX - Processing Video Data--------
  def processVideoExperiment(videoType: String): Unit = {
    println(s"Processing video experiment for type: $videoType")
  }
}

// Concrete Commands: MLModelExperimentCommand and TableDataExperimentCommand
class MLModelExperimentCommand(experimentRunner: ExperimentRunner, modelName: String) extends ExperimentCommand {
  override def execute(): Unit = experimentRunner.runMLModelExperiment(modelName)
}

class TableDataExperimentCommand(experimentRunner: ExperimentRunner, tableName: String) extends ExperimentCommand {
  override def execute(): Unit = experimentRunner.processTableDataExperiment(tableName)
}

// Invoker: ExperimentManager takes experiment commands and processes them
class ExperimentManager {
  private var experimentCommands: List[ExperimentCommand] = List()

  def addExperimentCommand(experimentCommand: ExperimentCommand): Unit = {
    experimentCommands = experimentCommands :+ experimentCommand
  }

  def executeExperiments(): Unit = {
    experimentCommands.foreach(_.execute())
    experimentCommands = List() // Clear the experiment commands after processing
  }
}

//------------------------------------------ NEW REQUIREMENT --------------------- Need to process video data now
// New Command: videoProcessingExperimentCommand
class VideoProcessingExperimentCommand(experimentRunner: ExperimentRunner, videoType: String) extends ExperimentCommand {
  override def execute(): Unit = experimentRunner.processVideoExperiment(videoType)
}

