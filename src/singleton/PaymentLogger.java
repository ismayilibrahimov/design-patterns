package singleton;

public enum PaymentLogger {
    INSTANCE;  // The single, global instance

    public void log(String message) {
        System.out.println("[LOG] " + message + " | Thread: " + Thread.currentThread().getName());
    }
}

