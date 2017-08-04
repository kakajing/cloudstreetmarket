package edu.zipcloud.cloudstreetmarket.core.services;

import edu.zipcloud.cloudstreetmarket.core.dtos.UserActivityDTO;

import java.util.List;

/**
 * Author 卡卡
 * Created by jing on 2017/8/1.
 */
public interface ICommunityService {

    List<UserActivityDTO> getLastUserPublicActivity(int number);
}
