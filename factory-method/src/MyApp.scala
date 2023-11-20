

object MyApp extends App {
  val creditCardProcessor: PaymentProcessor = new CreditCardProcessor()
  creditCardProcessor.purchase(100.0)

  val sslProcessor: PaymentProcessor = new SSLCommerceProcessor()
  sslProcessor.purchase(50.0)
}
