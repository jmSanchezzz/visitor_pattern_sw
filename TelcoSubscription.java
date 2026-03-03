public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
}

public interface UsagePromo {
    String showAllowance(String telcoName, double money);
}

public interface UnliCallsTextOffer {
    String showUnliCallsTextOffer(String telcoName, boolean unliCallText);
}