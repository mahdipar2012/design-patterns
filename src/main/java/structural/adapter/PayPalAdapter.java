package structural.adapter;

public class PayPalAdapter implements PayAdapter {
    private PayPal payPal = new PayPal();

    @Override
    public void pay(double amount) {
        payPal.sendPay(amount);
    }
}
