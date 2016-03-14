package com.lsz.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoxAnalyseEntity {

    /**
     * 查询总票房日期
     */
    @JsonProperty("queryDate")
    private String queryDate;
    /**
     * 总票房
     */
    @JsonProperty("totalBox")
    private String totalBox;
    /**
     * 每30分钟更新时间
     */
    @JsonProperty("updateTime")
    private String updateTime;

    /**
     * 票房明细
     */
    @JsonProperty("data")
    private List<DataEntity> data;

    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public void setTotalBox(String totalBox) {
        this.totalBox = totalBox;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getQueryDate() {
        return queryDate;
    }

    public String getTotalBox() {
        return totalBox;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public List<DataEntity> getData() {
        return data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DataEntity {
        /**
         * 上座率
         */
        @JsonProperty("attendRate")
        private String attendRate;
        /**
         * 场均人次
         */
        @JsonProperty("avgPeople")
        private int avgPeople;
        /**
         * 平均票价
         */
        @JsonProperty("avgPrice")
        private String avgPrice;
        /**
         * 票房占比
         */
        @JsonProperty("boxRate")
        private String boxRate;
        /**
         * 实时票房
         */
        @JsonProperty("dailyBoxOffice")
        private String dailyBoxOffice;
        /**
         * 电影id
         */
        @JsonProperty("movieId")
        private int movieId;
        /**
         * 电影名称
         */
        @JsonProperty("movieName")
        private String movieName;
        /**
         * 排座占比
         */
        @JsonProperty("seatRate")
        private String seatRate;
        /**
         * 上映xx天
         */
        @JsonProperty("showInfo")
        private String showInfo;
        /**
         * 拍片占比
         */
        @JsonProperty("showRate")
        private String showRate;
        /**
         * 总票房
         */
        @JsonProperty("sumBoxOffice")
        private String sumBoxOffice;
        /**
         * 总票房（亿）
         */
        @JsonProperty("sumBoxShowInfo")
        private String sumBoxShowInfo;
        /**
         * 场次
         */
        @JsonProperty("totalShow")
        private int totalShow;
        /**
         * 观影人次（万）
         */
        @JsonProperty("totalViewer")
        private String totalViewer;

        public void setAttendRate(String attendRate) {
            this.attendRate = attendRate;
        }

        public void setAvgPeople(int avgPeople) {
            this.avgPeople = avgPeople;
        }

        public void setAvgPrice(String avgPrice) {
            this.avgPrice = avgPrice;
        }

        public void setBoxRate(String boxRate) {
            this.boxRate = boxRate;
        }

        public void setDailyBoxOffice(String dailyBoxOffice) {
            this.dailyBoxOffice = dailyBoxOffice;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public void setSeatRate(String seatRate) {
            this.seatRate = seatRate;
        }

        public void setShowInfo(String showInfo) {
            this.showInfo = showInfo;
        }

        public void setShowRate(String showRate) {
            this.showRate = showRate;
        }

        public void setSumBoxOffice(String sumBoxOffice) {
            this.sumBoxOffice = sumBoxOffice;
        }

        public void setSumBoxShowInfo(String sumBoxShowInfo) {
            this.sumBoxShowInfo = sumBoxShowInfo;
        }

        public void setTotalShow(int totalShow) {
            this.totalShow = totalShow;
        }

        public void setTotalViewer(String totalViewer) {
            this.totalViewer = totalViewer;
        }

        public String getAttendRate() {
            return attendRate;
        }

        public int getAvgPeople() {
            return avgPeople;
        }

        public String getAvgPrice() {
            return avgPrice;
        }

        public String getBoxRate() {
            return boxRate;
        }

        public String getDailyBoxOffice() {
            return dailyBoxOffice;
        }

        public int getMovieId() {
            return movieId;
        }

        public String getMovieName() {
            return movieName;
        }

        public String getSeatRate() {
            return seatRate;
        }

        public String getShowInfo() {
            return showInfo;
        }

        public String getShowRate() {
            return showRate;
        }

        public String getSumBoxOffice() {
            return sumBoxOffice;
        }

        public String getSumBoxShowInfo() {
            return sumBoxShowInfo;
        }

        public int getTotalShow() {
            return totalShow;
        }

        public String getTotalViewer() {
            return totalViewer;
        }
    }
}
