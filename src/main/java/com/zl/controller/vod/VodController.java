package com.zl.controller.vod;

import com.baidubce.services.vod.model.GetMediaResourceResponse;
import com.zl.service.VodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacky on 2017/2/16.
 */
@RestController
@RequestMapping("/vod")
public class VodController {

    @Autowired
    private VodService vodService;

    /**
     * 通过媒体id，查询媒体详细信息  mda-hbrswjs5qd1mgw5d
     */
    @RequestMapping(value = "/{message_id}/mv", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GetMediaResourceResponse getMsg4App(@PathVariable String message_id) {
        GetMediaResourceResponse mediaResource = vodService.getMediaResource(message_id);
        return mediaResource;
    }
}
