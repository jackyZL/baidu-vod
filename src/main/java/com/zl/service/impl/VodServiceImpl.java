package com.zl.service.impl;

import com.baidubce.services.vod.VodClient;
import com.baidubce.services.vod.model.GetMediaResourceResponse;
import com.zl.service.VodService;
import com.zl.util.VodClientUtil;
import org.springframework.stereotype.Service;

/**
 * Created by jacky on 2017/2/16.
 */

@Service
public class VodServiceImpl implements VodService{

    @Override
    public GetMediaResourceResponse getMediaResource(String mediaId) {

        VodClient  vodClient = VodClientUtil.getClient();
        GetMediaResourceResponse response = vodClient.getMediaResource(mediaId);
        /*String status = response.getStatus();
        String createTime = response.getCreateTime();
        String publishTime = response.getPublishTime();
        String title = response.getAttributes().getTitle();
        String description = response. getAttributes().getDescription();
        long duration = response.getMeta().getDurationInSeconds();
        long size = response.getMeta().getSizeInBytes();
        String transcodingPresetGroupName = response.getTranscodingPresetGroupName();
        List<PlayableUrl> playableUrlList = response.getPlayableUrlList();
        List<String> thumbnailList = response.getThumbnailList();*/

        return response;
    }
}
