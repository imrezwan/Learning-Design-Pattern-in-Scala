


trait S3 {
  def read(bucketName: String)
  def write(data: String): Unit
}

trait RedShift {
  def processTheData()
}

class S3Service extends S3 {
  override def read(bucketName: String) {
    println("Reading... from S3 bucket - " + bucketName)
  }

  override def write(data: String) {
    println("Writing... " + data)
  }
}

class RedShiftService extends RedShift {
  override def processTheData(): Unit = {
    println("Processing the data...")
  }
}

class TableDataHandlerFacade extends S3 with RedShift {
  val s3Service = new S3Service()
  val redshiftService = new RedShiftService()

  override def read(bucketName: String): Unit = {
    println("Going to read from S3 bucket ==> ")
    s3Service.read(bucketName)
  }

  override def write(data: String): Unit = {
    println("Going to write S3 bucket ==> ")
    s3Service.write(data)
  }

  override def processTheData(): Unit = {
    redshiftService.processTheData();
  }
}

// Client
object FacadeClient extends App {
  var tableDataHandlerFacade = new TableDataHandlerFacade()
  tableDataHandlerFacade.read("Facade_Bucket")
  tableDataHandlerFacade.write("FACADE_CLIENT_DATA")
  tableDataHandlerFacade.processTheData()
}