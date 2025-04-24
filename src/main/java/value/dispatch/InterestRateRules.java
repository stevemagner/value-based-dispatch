package value.dispatch;

import java.math.BigDecimal;

public interface InterestRateRules {
    BigDecimal getRate(String accountType, int balance);
}
