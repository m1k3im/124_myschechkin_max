import java.util.HashMap;
public final class SummCalculator {
    public static int calculateSumm(HashMap<String, Integer> prices, HashMap<String, Integer> amounts) {
        int Summ = 0;
        for (var entry : amounts.entrySet() )
            Summ += entry.getValue() * prices.get(entry.getKey() );
        return Summ;
    }
}