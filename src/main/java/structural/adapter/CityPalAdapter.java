package structural.adapter;

public class CityPalAdapter extends CityPal implements PayAdapter {
    @Override
    public void pay(double amount) {
        this.doPay((long) amount);
    }
}
