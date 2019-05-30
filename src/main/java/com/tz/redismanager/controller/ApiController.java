package com.tz.redismanager.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p></p>
 *
 * @author Administrator
 * @version 1.0
 * @time 2019-02-17 21:40
 **/
@RestController
@RequestMapping("/")
public class ApiController {

    @RequestMapping("/api/**")
    public Object api(HttpServletRequest request, HttpServletResponse response){
        return "";
    }

    @RequestMapping("/api/currentUser")
    public Object currentUser(HttpServletRequest request, HttpServletResponse response){
        return JSONArray.parseObject("{\"name\":\"admin\",\"avatar\":\"https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png\",\"userid\":\"00000001\",\"email\":\"antdesign@alipay.com\",\"signature\":\"海纳百川，有容乃大\",\"title\":\"交互专家\",\"group\":\"蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED\",\"tags\":[{\"key\":\"0\",\"label\":\"很有想法的\"},{\"key\":\"1\",\"label\":\"专注设计\"},{\"key\":\"2\",\"label\":\"辣~\"},{\"key\":\"3\",\"label\":\"大长腿\"},{\"key\":\"4\",\"label\":\"川妹子\"},{\"key\":\"5\",\"label\":\"海纳百川\"}],\"notifyCount\":12,\"unreadCount\":11,\"country\":\"China\",\"geographic\":{\"province\":{\"label\":\"四川省\",\"key\":\"330000\"},\"city\":{\"label\":\"成都市\",\"key\":\"330100\"}},\"address\":\"玉林路66号\",\"phone\":\"0752-268888888\"}");
    }

    @RequestMapping("/api/rule")
    public Object rule(HttpServletRequest request, HttpServletResponse response){
        return JSONArray.parseObject("{\"list\":[{\"key\":0,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 0\",\"title\":\"一个任务名称 0\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":254,\"status\":0,\"updatedAt\":\"2017-06-30T16:00:00.000Z\",\"createdAt\":\"2017-06-30T16:00:00.000Z\",\"progress\":17},{\"key\":1,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 1\",\"title\":\"一个任务名称 1\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":789,\"status\":3,\"updatedAt\":\"2017-06-30T16:00:00.000Z\",\"createdAt\":\"2017-06-30T16:00:00.000Z\",\"progress\":84},{\"key\":2,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 2\",\"title\":\"一个任务名称 2\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":727,\"status\":0,\"updatedAt\":\"2017-07-01T16:00:00.000Z\",\"createdAt\":\"2017-07-01T16:00:00.000Z\",\"progress\":33},{\"key\":3,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 3\",\"title\":\"一个任务名称 3\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":269,\"status\":1,\"updatedAt\":\"2017-07-01T16:00:00.000Z\",\"createdAt\":\"2017-07-01T16:00:00.000Z\",\"progress\":35},{\"key\":4,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 4\",\"title\":\"一个任务名称 4\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":73,\"status\":0,\"updatedAt\":\"2017-07-02T16:00:00.000Z\",\"createdAt\":\"2017-07-02T16:00:00.000Z\",\"progress\":47},{\"key\":5,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 5\",\"title\":\"一个任务名称 5\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":184,\"status\":2,\"updatedAt\":\"2017-07-02T16:00:00.000Z\",\"createdAt\":\"2017-07-02T16:00:00.000Z\",\"progress\":45},{\"key\":6,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 6\",\"title\":\"一个任务名称 6\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":729,\"status\":0,\"updatedAt\":\"2017-07-03T16:00:00.000Z\",\"createdAt\":\"2017-07-03T16:00:00.000Z\",\"progress\":47},{\"key\":7,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 7\",\"title\":\"一个任务名称 7\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":122,\"status\":2,\"updatedAt\":\"2017-07-03T16:00:00.000Z\",\"createdAt\":\"2017-07-03T16:00:00.000Z\",\"progress\":37},{\"key\":8,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 8\",\"title\":\"一个任务名称 8\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":649,\"status\":2,\"updatedAt\":\"2017-07-04T16:00:00.000Z\",\"createdAt\":\"2017-07-04T16:00:00.000Z\",\"progress\":71},{\"key\":9,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 9\",\"title\":\"一个任务名称 9\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":269,\"status\":1,\"updatedAt\":\"2017-07-04T16:00:00.000Z\",\"createdAt\":\"2017-07-04T16:00:00.000Z\",\"progress\":37},{\"key\":10,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 10\",\"title\":\"一个任务名称 10\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":526,\"status\":1,\"updatedAt\":\"2017-07-05T16:00:00.000Z\",\"createdAt\":\"2017-07-05T16:00:00.000Z\",\"progress\":31},{\"key\":11,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 11\",\"title\":\"一个任务名称 11\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":508,\"status\":1,\"updatedAt\":\"2017-07-05T16:00:00.000Z\",\"createdAt\":\"2017-07-05T16:00:00.000Z\",\"progress\":6},{\"key\":12,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 12\",\"title\":\"一个任务名称 12\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":305,\"status\":3,\"updatedAt\":\"2017-07-06T16:00:00.000Z\",\"createdAt\":\"2017-07-06T16:00:00.000Z\",\"progress\":31},{\"key\":13,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 13\",\"title\":\"一个任务名称 13\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":392,\"status\":2,\"updatedAt\":\"2017-07-06T16:00:00.000Z\",\"createdAt\":\"2017-07-06T16:00:00.000Z\",\"progress\":43},{\"key\":14,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 14\",\"title\":\"一个任务名称 14\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":963,\"status\":2,\"updatedAt\":\"2017-07-07T16:00:00.000Z\",\"createdAt\":\"2017-07-07T16:00:00.000Z\",\"progress\":89},{\"key\":15,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 15\",\"title\":\"一个任务名称 15\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":525,\"status\":0,\"updatedAt\":\"2017-07-07T16:00:00.000Z\",\"createdAt\":\"2017-07-07T16:00:00.000Z\",\"progress\":82},{\"key\":16,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 16\",\"title\":\"一个任务名称 16\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":188,\"status\":1,\"updatedAt\":\"2017-07-08T16:00:00.000Z\",\"createdAt\":\"2017-07-08T16:00:00.000Z\",\"progress\":37},{\"key\":17,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 17\",\"title\":\"一个任务名称 17\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":612,\"status\":1,\"updatedAt\":\"2017-07-08T16:00:00.000Z\",\"createdAt\":\"2017-07-08T16:00:00.000Z\",\"progress\":58},{\"key\":18,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 18\",\"title\":\"一个任务名称 18\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":809,\"status\":3,\"updatedAt\":\"2017-07-10T00:00:00.000Z\",\"createdAt\":\"2017-07-10T00:00:00.000Z\",\"progress\":32},{\"key\":19,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 19\",\"title\":\"一个任务名称 19\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":153,\"status\":0,\"updatedAt\":\"2017-07-10T00:00:00.000Z\",\"createdAt\":\"2017-07-10T00:00:00.000Z\",\"progress\":50},{\"key\":20,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 20\",\"title\":\"一个任务名称 20\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":75,\"status\":1,\"updatedAt\":\"2017-07-11T00:00:00.000Z\",\"createdAt\":\"2017-07-11T00:00:00.000Z\",\"progress\":63},{\"key\":21,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 21\",\"title\":\"一个任务名称 21\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":213,\"status\":1,\"updatedAt\":\"2017-07-11T00:00:00.000Z\",\"createdAt\":\"2017-07-11T00:00:00.000Z\",\"progress\":37},{\"key\":22,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 22\",\"title\":\"一个任务名称 22\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":876,\"status\":3,\"updatedAt\":\"2017-07-12T00:00:00.000Z\",\"createdAt\":\"2017-07-12T00:00:00.000Z\",\"progress\":1},{\"key\":23,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 23\",\"title\":\"一个任务名称 23\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":813,\"status\":0,\"updatedAt\":\"2017-07-12T00:00:00.000Z\",\"createdAt\":\"2017-07-12T00:00:00.000Z\",\"progress\":57},{\"key\":24,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 24\",\"title\":\"一个任务名称 24\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":747,\"status\":3,\"updatedAt\":\"2017-07-13T00:00:00.000Z\",\"createdAt\":\"2017-07-13T00:00:00.000Z\",\"progress\":95},{\"key\":25,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 25\",\"title\":\"一个任务名称 25\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":458,\"status\":0,\"updatedAt\":\"2017-07-13T00:00:00.000Z\",\"createdAt\":\"2017-07-13T00:00:00.000Z\",\"progress\":72},{\"key\":26,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 26\",\"title\":\"一个任务名称 26\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":827,\"status\":1,\"updatedAt\":\"2017-07-14T00:00:00.000Z\",\"createdAt\":\"2017-07-14T00:00:00.000Z\",\"progress\":33},{\"key\":27,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 27\",\"title\":\"一个任务名称 27\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":622,\"status\":3,\"updatedAt\":\"2017-07-14T00:00:00.000Z\",\"createdAt\":\"2017-07-14T00:00:00.000Z\",\"progress\":51},{\"key\":28,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 28\",\"title\":\"一个任务名称 28\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":529,\"status\":1,\"updatedAt\":\"2017-07-15T00:00:00.000Z\",\"createdAt\":\"2017-07-15T00:00:00.000Z\",\"progress\":98},{\"key\":29,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 29\",\"title\":\"一个任务名称 29\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":562,\"status\":2,\"updatedAt\":\"2017-07-15T00:00:00.000Z\",\"createdAt\":\"2017-07-15T00:00:00.000Z\",\"progress\":26},{\"key\":30,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 30\",\"title\":\"一个任务名称 30\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":854,\"status\":0,\"updatedAt\":\"2017-07-16T00:00:00.000Z\",\"createdAt\":\"2017-07-16T00:00:00.000Z\",\"progress\":51},{\"key\":31,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 31\",\"title\":\"一个任务名称 31\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":60,\"status\":2,\"updatedAt\":\"2017-07-16T00:00:00.000Z\",\"createdAt\":\"2017-07-16T00:00:00.000Z\",\"progress\":81},{\"key\":32,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 32\",\"title\":\"一个任务名称 32\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":961,\"status\":2,\"updatedAt\":\"2017-07-17T00:00:00.000Z\",\"createdAt\":\"2017-07-17T00:00:00.000Z\",\"progress\":15},{\"key\":33,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 33\",\"title\":\"一个任务名称 33\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":816,\"status\":1,\"updatedAt\":\"2017-07-17T00:00:00.000Z\",\"createdAt\":\"2017-07-17T00:00:00.000Z\",\"progress\":49},{\"key\":34,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 34\",\"title\":\"一个任务名称 34\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":243,\"status\":3,\"updatedAt\":\"2017-07-18T00:00:00.000Z\",\"createdAt\":\"2017-07-18T00:00:00.000Z\",\"progress\":84},{\"key\":35,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 35\",\"title\":\"一个任务名称 35\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":89,\"status\":1,\"updatedAt\":\"2017-07-18T00:00:00.000Z\",\"createdAt\":\"2017-07-18T00:00:00.000Z\",\"progress\":82},{\"key\":36,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 36\",\"title\":\"一个任务名称 36\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":320,\"status\":2,\"updatedAt\":\"2017-07-19T00:00:00.000Z\",\"createdAt\":\"2017-07-19T00:00:00.000Z\",\"progress\":37},{\"key\":37,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 37\",\"title\":\"一个任务名称 37\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":563,\"status\":3,\"updatedAt\":\"2017-07-19T00:00:00.000Z\",\"createdAt\":\"2017-07-19T00:00:00.000Z\",\"progress\":78},{\"key\":38,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 38\",\"title\":\"一个任务名称 38\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":593,\"status\":0,\"updatedAt\":\"2017-07-20T00:00:00.000Z\",\"createdAt\":\"2017-07-20T00:00:00.000Z\",\"progress\":48},{\"key\":39,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 39\",\"title\":\"一个任务名称 39\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":596,\"status\":1,\"updatedAt\":\"2017-07-20T00:00:00.000Z\",\"createdAt\":\"2017-07-20T00:00:00.000Z\",\"progress\":41},{\"key\":40,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 40\",\"title\":\"一个任务名称 40\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":477,\"status\":1,\"updatedAt\":\"2017-07-21T00:00:00.000Z\",\"createdAt\":\"2017-07-21T00:00:00.000Z\",\"progress\":11},{\"key\":41,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 41\",\"title\":\"一个任务名称 41\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":888,\"status\":2,\"updatedAt\":\"2017-07-21T00:00:00.000Z\",\"createdAt\":\"2017-07-21T00:00:00.000Z\",\"progress\":87},{\"key\":42,\"disabled\":true,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 42\",\"title\":\"一个任务名称 42\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":240,\"status\":3,\"updatedAt\":\"2017-07-22T00:00:00.000Z\",\"createdAt\":\"2017-07-22T00:00:00.000Z\",\"progress\":65},{\"key\":43,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 43\",\"title\":\"一个任务名称 43\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":261,\"status\":2,\"updatedAt\":\"2017-07-22T00:00:00.000Z\",\"createdAt\":\"2017-07-22T00:00:00.000Z\",\"progress\":63},{\"key\":44,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png\",\"name\":\"TradeCode 44\",\"title\":\"一个任务名称 44\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":471,\"status\":1,\"updatedAt\":\"2017-07-23T00:00:00.000Z\",\"createdAt\":\"2017-07-23T00:00:00.000Z\",\"progress\":51},{\"key\":45,\"disabled\":false,\"href\":\"https://ant.design\",\"avatar\":\"https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png\",\"name\":\"TradeCode 45\",\"title\":\"一个任务名称 45\",\"owner\":\"曲丽丽\",\"desc\":\"这是一段描述-tuanzuo\",\"callNo\":510,\"status\":3,\"updatedAt\":\"2017-07-23T00:00:00.000Z\",\"createdAt\":\"2017-07-23T00:00:00.000Z\",\"progress\":39}],\"pagination\":{\"total\":46,\"pageSize\":10,\"current\":1}}");
    }

}
