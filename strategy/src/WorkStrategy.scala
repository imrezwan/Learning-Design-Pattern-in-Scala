trait WorkStrategy {
  def doWork(): Unit
}


class PMEWorkStrategy extends WorkStrategy {
  override def doWork(): Unit = {
    println("working according to PME guideline")
  }
}


class DeepcortexWorkStrategy extends WorkStrategy {
  override def doWork(): Unit = {
    println("working according to Deepcortex guideline")
  }
}