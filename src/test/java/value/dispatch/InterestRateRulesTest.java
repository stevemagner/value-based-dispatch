package value.dispatch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class InterestRateRulesTest {

    InterestRateRules rules = new InterestRateRulesImpl();

    @Test
    void platinumLowBalance() {
        assertEquals(new BigDecimal("0.05"), rules.getRate("Platinum", 5000));
    }

    @Test
    void platinumHighBalance() {
        assertEquals(new BigDecimal("0.045"), rules.getRate("Platinum", 15000));
    }

    @Test
    void goldAnyBalance() {
        assertEquals(new BigDecimal("0.04"), rules.getRate("Gold", 8000));
    }

    @Test
    void defaultCase() {
        assertEquals(new BigDecimal("0.03"), rules.getRate("Bronze", 3000));
    }
}
