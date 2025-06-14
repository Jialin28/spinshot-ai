package com.spinshot.spinshotai.controller;

import com.spinshot.spinshotai.model.request.AiGenDrillsRequest;
import com.spinshot.spinshotai.model.request.AudioToTextRequest;
import com.spinshot.spinshotai.model.response.AiGenDrillsResponse;
import com.spinshot.spinshotai.model.response.AudioToTextResponse;
import com.spinshot.spinshotai.model.response.ConfigInfo;
import com.spinshot.spinshotai.model.response.LoginResponse;
import com.spinshot.spinshotai.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AiController {

    @Autowired
    private MockService mockService;

    @GetMapping("/ping")
    public String hello() {
        return "Hello Spinshot AI！";
    }

    @GetMapping("/login")
    public LoginResponse login() {
        LoginResponse response = new LoginResponse();
        response.setCode(0);
        response.setShowAi(true);
        return response;
    }


    @PostMapping("/audio_to_text")
    public AudioToTextResponse audioToText(@RequestHeader("signature") String signature, @RequestBody AudioToTextRequest request) {

        AudioToTextResponse response = new AudioToTextResponse();
        String result = mockService.audioToText();
        if (result == null || result.isEmpty()) {
            response.setCode(-1);
            response.setMsg("语音转文本失败");
        }
        response.setCode(0);
        response.setText(result);
        return response;
    }

    @PostMapping("/gen_drills")
    public AiGenDrillsResponse genShotConfig(@RequestHeader("signature") String signature, @RequestBody AiGenDrillsRequest request) {

        AiGenDrillsResponse response = new AiGenDrillsResponse();
        ConfigInfo configInfo = mockService.getConfigInfo();
        if (configInfo == null) {
            response.setCode(-1);
            response.setMsg("AI服务繁忙中，请稍后重试");
            return response;
        }
        response.setConfigInfo(configInfo);
        response.setCode(0);
        return response;
    }

}
