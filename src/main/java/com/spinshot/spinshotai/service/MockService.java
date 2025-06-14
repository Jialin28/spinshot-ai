package com.spinshot.spinshotai.service;

import com.spinshot.spinshotai.model.response.ConfigInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MockService {

    public String audioToText() {
        Random random = new Random();
        if (!random.nextBoolean()) {
            return null;
        }
        return "你说啥！！！";
    }

    public ConfigInfo getConfigInfo() {
        Random random = new Random();
        if (!random.nextBoolean()) {
            return null;
        }
        // 创建配置信息
        ConfigInfo configInfo = new ConfigInfo();
        configInfo.setName("智能生成训练配置");

        // 创建击球序列列表
        List<ConfigInfo.Shot> shotList = new ArrayList<>();

        // 第一个击球序列 - 基础训练
        ConfigInfo.Shot shot1 = new ConfigInfo.Shot();
        shot1.setLoop(3); // 循环3次
        shot1.setIsRandom(0); // 不随机

        // 第一个击球序列的球参数列表
        List<ConfigInfo.Ball> ballList1 = new ArrayList<>();
        ballList1.add(createBall(12, 8, 3, 7, 3)); // 左路，较慢速度
        ballList1.add(createBall(12, 8, 5, 7, 3));  // 右路，较慢速度
        shot1.setBallList(ballList1);

        // 第二个击球序列 - 进阶训练
        ConfigInfo.Shot shot2 = new ConfigInfo.Shot();
        shot2.setLoop(2); // 循环2次
        shot2.setIsRandom(1); // 随机

        // 第二个击球序列的球参数列表
        List<ConfigInfo.Ball> ballList2 = new ArrayList<>();
        ballList2.add(createBall(18, 12, 8, 10, 1)); // 左路底线，高速
        ballList2.add(createBall(18, 12, 8, 10, 1));  // 右路底线，高速
        ballList2.add(createBall(20, 5, 0, 12, 4));  // 中路近网，高速上旋
        shot2.setBallList(ballList2);

        // 添加所有击球序列到列表
        shotList.add(shot1);
        shotList.add(shot2);
        configInfo.setShotList(shotList);

        return configInfo;
    }

    private ConfigInfo.Ball createBall(int speed, int height, int horz, int spin, int feed) {
        ConfigInfo.Ball ball = new ConfigInfo.Ball();
        ball.setSpeed(speed);
        ball.setHeight(height);
        ball.setHorz(horz); // 负数表示左路，正数表示右路
        ball.setSpin(spin);
        ball.setFeed(feed);
        return ball;
    }
}
