package com.lsz.movie.api;

public class AppConstants {
    public interface RequestPath {
        String BASE_URL = "http://api.meituan.com";

        // 票房
        // 票房分析
        // 日票房
        // http://api.meituan.com/history/date/box.json?date=2016-03-14&__vhost=piaofang.maoyan.com
        String BOX_ANALYSE = "/history/date/box.json";
        // 周票房 typeId=1
        // http://api.meituan.com/box/statistic/movie/list
        // .json?typeId=1&date=20160201-20160207&__vhost=piaofang.maoyan.com
        // 月票房 typeId=2
        // http://api.meituan.com/box/statistic/movie/list
        // .json?typeId=2&date=201602&__vhost=piaofang.maoyan.com
        // 年票房 typeId=3
        // http://api.meituan.com/box/statistic/movie/list
        // .json?typeId=3&date=2016&__vhost=piaofang.maoyan.com
        // 自定义 typeId=4
        // http://api.meituan.com/box/statistic/movie/list
        // .json?typeId=4&date=20160308-20160314&__vhost=piaofang.maoyan.com
        String BOX_STATISTIC = "/box/statistic/movie/list.json";
        // 票房趋势
        // 日趋势 typeId=0
        // http://api.meituan.com/market/statistic/list
        // .json?typeId=0&date=20160314&cnt=50&__vhost=piaofang.maoyan.com
        // 周趋势 typeId=1 date:当前周-当前第几周
        // http://api.meituan.com/market/statistic/list
        // .json?typeId=1&date=20160307-20160313-201611&cnt=50&__vhost=piaofang.maoyan.com
        // 月趋势 typeId=2
        // http://api.meituan.com/market/statistic/list
        // .json?typeId=2&date=201602&cnt=50&__vhost=piaofang.maoyan.com
        // 年趋势 typeId=3
        // http://api.meituan.com/market/statistic/list
        // .json?typeId=3&date=2016&cnt=50&__vhost=piaofang.maoyan.com
        String MARKET_STATISTIC = "/market/statistic/list.json";

        // 预售票房
        // http://api.meituan.com/future/date/box.json?date=2016-03-15&cnt=10&__vhost=piaofang
        // .maoyan.com
        String FUTURE_BOX = "/future/date/box.json";

        // 北美票房
        // http://api.meituan.com/mojo/box/getMojoWeekbox.json?year=2016&week=10&__vhost=piaofang
        // .maoyan.com
        String MOJO_WEEK_BOX = "/mojo/box/getMojoWeekbox.json";

        // 票房详情 html网页
        // http://piaofang.maoyan.com/movie/338412
        String DETAIL_BOX_BASE_URL = "http://piaofang.maoyan.com";
        String DETAIL_BOX = "/movie/{movieId}";

        // 影院
        // 全国影院总数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&isSum=1&__vhost=piaofang.maoyan.com
        // 分数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&isSum=0&__vhost=piaofang.maoyan.com
        String CINEMA_BOX = "/getCinemaBox/list.json";

        // 全国影投总数据
        // http://api.meituan.com/getShadowBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&isSum=1&__vhost=piaofang.maoyan.com
        // 分数据
        // http://api.meituan.com/getShadowBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&isSum=0&__vhost=piaofang.maoyan.com
        // 几线城市总数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&cityTier=1&isSum=1&__vhost=piaofang.maoyan
        // .com
        // 几线城市分数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&cityTier=1&isSum=0&__vhost=piaofang.maoyan
        // .com
        // 热门城市总数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&cityId=1&cityTier=0&isSum=0&__vhost
        // =piaofang.maoyan.com
        // 热门城市分数据
        //

        String SHADOW_BOX = "/getShadowBox/list.json";

        // 城市列表
        // http://api.meituan.com/getAllCity.json?__vhost=piaofang.maoyan.com
        String ALL_CITY = "/getAllCity.json";

        // 几线城市总数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&cityTier=1&isSum=1&__vhost=piaofang.maoyan
        // .com
        // 几线城市分数据
        // http://api.meituan.com/getCinemaBox/list
        // .json?typeId=0&date=20160313&page=1&size=50&cityTier=1&isSum=0&__vhost=piaofang.maoyan
        // .com

    }

    public interface ParamKey {
        String YEAR = "year";
        String WEEK = "week";
        String DATE = "date";
        String VHOST = "__vhost";
        String CNT = "cnt";
        String TYPE_ID = "typeId";
        String MOVIE_ID = "movieId";
        String PAGE = "page";
        String SIZE = "size";
        String IS_SUM = "isSum";
        String CITY_TIER = "cityTier";
    }

    public interface ParamDefaultValue {
        String VHOST = "piaofang.maoyan.com";
    }

}
