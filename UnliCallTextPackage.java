import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("Smart", "They do not offer any free calls or texts, and you will be charged per use.");
        unliMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        unliMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMap.getOrDefault(telcoName, "No promo information available.");
    }
}