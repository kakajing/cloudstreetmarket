package edu.zipcloud.cloudstreetmarket.core.services;

import edu.zipcloud.cloudstreetmarket.core.dtos.DailyMartketActivityDTO;
import edu.zipcloud.cloudstreetmarket.core.dtos.MarketOverviewDTO;

import java.util.List;

/**
 * Author 卡卡
 * Created by jing on 2017/8/1.
 */
public interface IMarketService {
    DailyMartketActivityDTO getLastDayMarketActivity(String string);
    List<MarketOverviewDTO> getLastDayMarketsOverview();
}
