package edu.zipcloud.cloudstreetmarket.core.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * Author 卡卡
 * Created by jing on 2017/7/31.
 */
public class DailyMartketActivityDTO {

    String marketShortName;
    String marketId;
    Map<String, BigDecimal> values;
    Date dateSnapshot;

    public DailyMartketActivityDTO(String marketShortName, String marketId, Map<String, BigDecimal> values, Date dateSnapshot) {
        this.marketShortName = marketShortName;
        this.marketId = marketId;
        this.values = values;
        this.dateSnapshot = dateSnapshot;
    }

    public String getMarketShortName() {
        return marketShortName;
    }

    public void setMarketShortName(String marketShortName) {
        this.marketShortName = marketShortName;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public Map<String, BigDecimal> getValues() {
        return values;
    }

    public void setValues(Map<String, BigDecimal> values) {
        this.values = values;
    }

    public Date getDateSnapshot() {
        return dateSnapshot;
    }

    public void setDateSnapshot(Date dateSnapshot) {
        this.dateSnapshot = dateSnapshot;
    }
}
