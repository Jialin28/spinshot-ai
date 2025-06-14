package com.spinshot.spinshotai.model.response;

import java.util.List;

public class ConfigInfo {
    /**
     * 配置生成标题
     */
    private String name;
    /**
     * shot 配置列表
     */
    private List<Shot> shotList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Shot> getShotList() {
        return shotList;
    }

    public void setShotList(List<Shot> shotList) {
        this.shotList = shotList;
    }

    public static class Shot {
        /**
         * 循环次数
         */
        private int loop;
        /**
         * 是否随机
         */
        private int isRandom;
        /**
         * 落球点位置列表
         */
        private List<Ball> ballList;

        public int getLoop() {
            return loop;
        }

        public void setLoop(int loop) {
            this.loop = loop;
        }

        public int getIsRandom() {
            return isRandom;
        }

        public void setIsRandom(int isRandom) {
            this.isRandom = isRandom;
        }

        public List<Ball> getBallList() {
            return ballList;
        }

        public void setBallList(List<Ball> ballList) {
            this.ballList = ballList;
        }
    }

    public static class Ball {
        /**
         * 速度：取值 1 ~ 20
         */
        private int speed;
        /**
         * 高度：取值 1 ~ 50
         */
        private int height;
        /**
         * 方向：取值 1 ~ 19
         */
        private int horz;
        /**
         * 旋转：取值 1 ~ 20
         */
        private int spin;
        /**
         * 等待时间s：取值 1 ~ 20
         */
        private int feed;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHorz() {
            return horz;
        }

        public void setHorz(int horz) {
            this.horz = horz;
        }

        public int getSpin() {
            return spin;
        }

        public void setSpin(int spin) {
            this.spin = spin;
        }

        public int getFeed() {
            return feed;
        }

        public void setFeed(int feed) {
            this.feed = feed;
        }
    }
}
