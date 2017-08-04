package edu.zipcloud.cloudstreetmarket.core.enums;

/**
 * Author 卡卡
 * Created by jing on 2017/7/31.
 */
public enum Action {

    BUY("buys"), SELL("sells");

    private String presentTense;

    Action(String presentTense) {
        this.presentTense = presentTense;
    }

    public String getPresentTense() {
        return presentTense;
    }
}
