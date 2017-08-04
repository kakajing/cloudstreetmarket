package edu.zipcloud.cloudstreetmarket.portal.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import edu.zipcloud.cloudstreetmarket.core.services.ICommunityService;
import edu.zipcloud.cloudstreetmarket.core.services.IMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author 卡卡
 * Created by jing on 2017/7/30.
 */
@Controller
public class DefaultController extends CloudstreetWebAppWCI {

    @Autowired
    private IMarketService marketService;

    @Autowired
    private ICommunityService communityService;

    @RequestMapping(value = "/*", method = {RequestMethod.GET,RequestMethod.HEAD})
    public String fallback(Model model) {

        model.addAttribute("dailyMarketActivity", marketService.getLastDayMarketActivity("GDAXI"));
        model.addAttribute("dailyMarketsActivity", marketService.getLastDayMarketsOverview());
        model.addAttribute("recentUserActivity", communityService.getLastUserPublicActivity(10));

        return "index";
    }
}
