package com.spinshot.spinshotai.model.request;

import com.spinshot.spinshotai.model.response.ConfigInfo;

public class AiGenDrillsRequest {
    /**
     * 用户输入文本
     */
    private String text;
    /**
     * 机器类型：0 网球 1 匹克球
     */
    private Integer machineType;
    /**
     * 机器摆放位置
     */
    private Integer machinePosition;
    /**
     * AI生成参数列表
     */
    private ConfigInfo configInfo;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getMachineType() {
        return machineType;
    }

    public void setMachineType(Integer machineType) {
        this.machineType = machineType;
    }

    public ConfigInfo getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(ConfigInfo configInfo) {
        this.configInfo = configInfo;
    }

    public Integer getMachinePosition() {
        return machinePosition;
    }

    public void setMachinePosition(Integer machinePosition) {
        this.machinePosition = machinePosition;
    }
}
