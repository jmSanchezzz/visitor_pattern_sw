public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.showAllowance(this.telcoName, this.promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(this.telcoName, this.unliCallText);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}