package com.spinshot.spinshotai.model.response;

public class AudioToTextResponse extends BaseResponse {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
