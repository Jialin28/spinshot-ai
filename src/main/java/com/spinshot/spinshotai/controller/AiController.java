package com.spinshot.spinshotai.controller;

import com.spinshot.spinshotai.model.request.AiGenDrillsRequest;
import com.spinshot.spinshotai.model.request.AudioToTextRequest;
import com.spinshot.spinshotai.model.response.AiGenDrillsResponse;
import com.spinshot.spinshotai.model.response.AudioToTextResponse;
import com.spinshot.spinshotai.model.response.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AiController {

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
        response.setCode(-1);
        response.setMsg("语音转文本失败");

        return response;
    }

    @PostMapping("/gen_drills")
    public AiGenDrillsResponse genShotConfig(@RequestHeader("signature") String signature, @RequestBody AiGenDrillsRequest request) {

        AiGenDrillsResponse response = new AiGenDrillsResponse();
        response.setCode(-1);
        response.setMsg("AI生成Drill配置失败");

        return response;
    }

}
