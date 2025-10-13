import factory.factory_method.factories.CreditCardFactory;
import factory.factory_method.factories.PaymentFactory;
import factory.factory_method.PaymentService;


public class Main {
    public static void main(String[] args) {
        /* strategy design pattern
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(new BankTransferPayment());
        paymentProcessor.pay(); */

        /* observer design pattern
        NewsAgency publisher = new NewsAgency();
        Subscriber subscriber1 = new NewsSubscriber();
        Subscriber subscriber2 = new SecondSubscriber();
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.postNews("Our first news!!!");
        publisher.postNews("Our second news!!!");
        publisher.unSubscribe(subscriber1);
        publisher.postNews("Our third news!!!");
        */

        /* decorator design pattern
        Text text = new PlainText("Hello World");
        text = new BoldDecorator(text);
        text = new ItalicDecorator(text);

        System.out.println(text.render());
        // Output: <i><b>Hello World</b></i>
         */

        /* simple factory
        PaymentService service = new PaymentService();
        service.makePayment("creditcard", 150.0);
        service.makePayment("paypal", 85.5);
        */

        /* factory method */
        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentService service = new PaymentService(paymentFactory);
        service.makePayment(150.0);
    }
}
