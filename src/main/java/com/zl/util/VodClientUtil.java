package com.zl.util;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.vod.VodClient;

/**
 * Created by jacky on 2017/2/16.
 */
public class VodClientUtil {

    private static VodClient vodClient;

    private static final String ACCESS_KEY_ID = "0c057618978a4a70b7a8819f0b478b48";
    private static final String SECRET_ACCESS_KEY = "c3358cfa9a3947cfbeac877f6cc1a37a";

    public static VodClient getClient() {
        if (vodClient == null) {
            // 初始化一个VodClient
            BceClientConfiguration config = new BceClientConfiguration();
            config.setCredentials(new DefaultBceCredentials(ACCESS_KEY_ID, SECRET_ACCESS_KEY));
            vodClient = new VodClient(config);
            return vodClient;
        } else {
            return vodClient;
        }
    }

}
