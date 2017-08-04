package edu.zipcloud.cloudstreetmarket.core.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * Author 卡卡
 * Created by jing on 2017/8/1.
 */
public class DailyMarketActivityDTO {

    String marketShortName;
    String marketId;
    Map<String, BigDecimal> values;
    Date dateSnapshot;

    public DailyMarketActivityDTO(String marketShortName, String marketId,
                                  Map<String, BigDecimal> values, Date dateSnapshot) {
        this.marketShortName = marketShortName;
        this.marketId = marketId;
        this.values = values;
        this.dateSnapshot = dateSnapshot;
    }
}
