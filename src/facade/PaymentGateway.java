package facade;


public class PaymentGateway {
    public boolean authenticate(String apiKey) {
        System.out.println("Authenticating with API key: " + apiKey);
        return apiKey.equals("VALID_KEY");
    }
}
