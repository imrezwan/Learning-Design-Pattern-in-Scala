

trait PaymentMethod {
  def processPayment(amount: Double): Unit
}


class CreditCardPayment extends PaymentMethod {
  override def processPayment(amount: Double): Unit = {
    println(s"Processing credit card payment of $$${amount}")
  }
}

class SSLCommercePayment extends PaymentMethod {
  override def processPayment(amount: Double): Unit = {
    println(s"Processing PayPal payment of $$${amount}")
  }
}

abstract class PaymentProcessor {
  def createPaymentMethod(): PaymentMethod

  def purchase(amount: Double): Unit = {
    val paymentMethod = createPaymentMethod()
    paymentMethod.processPayment(amount)
  }
}

class CreditCardProcessor extends PaymentProcessor {
  override def createPaymentMethod(): PaymentMethod = new CreditCardPayment()
}

class SSLCommerceProcessor extends PaymentProcessor {
  override def createPaymentMethod(): PaymentMethod = new SSLCommercePayment()
}
