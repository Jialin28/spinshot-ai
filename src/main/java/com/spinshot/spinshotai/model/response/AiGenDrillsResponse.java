package com.spinshot.spinshotai.model.response;

public class AiGenDrillsResponse extends BaseResponse {
    private ConfigInfo configInfo;

    public ConfigInfo getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(ConfigInfo configInfo) {
        this.configInfo = configInfo;
    }
}
