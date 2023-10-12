
case class MongoDBClient(val url: String)

object MongoClientManager {
  val url = "mongodb://localhost:27017"

  def createMongoDBClient: MongoDBClient = MongoDBClient(url)
}
