package com.zl.service;

import com.baidubce.services.vod.model.GetMediaResourceResponse;

/**
 * Created by jacky on 2017/2/16.
 */
public interface VodService {

    /**
     *  通过媒体id，查询媒体信息
     *
     * @param mediaId
     */
    public GetMediaResourceResponse getMediaResource(String mediaId);


}
