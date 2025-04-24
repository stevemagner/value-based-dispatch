package value.dispatch;

import java.math.BigDecimal;

public class InterestRateRulesImpl implements InterestRateRules {
    @Override
    public BigDecimal getRate(String accountType, int balance) {
        if ("Platinum".equals(accountType)) {
            if (balance <= 10000) return new BigDecimal("0.05");
            if (balance <= 20000) return new BigDecimal("0.045");
        } else if ("Gold".equals(accountType)) {
            return new BigDecimal("0.04");
        }
        return new BigDecimal("0.03");
    }
}
