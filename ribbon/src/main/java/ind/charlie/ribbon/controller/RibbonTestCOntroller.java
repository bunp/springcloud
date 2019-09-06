package ind.charlie.ribbon.controller;

import ind.charlie.ribbon.service.HystricService;
import ind.charlie.ribbon.service.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/8/28
 **/
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("ribbon")
public class RibbonTestCOntroller {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    TestFeign testFeign;
    @Autowired
    HystricService hystricService;
//    @RequestMapping("test")
//    public String test(){
//        return restTemplate.getForObject("http://charlie-manage/test/test3333",String.class);
//    }

    @RequestMapping(value = "testFeign",method = RequestMethod.GET)
    public String test2(){
       return testFeign.test();
    }

    @RequestMapping(value = "testHystrix",method = RequestMethod.GET)
    public String testHystrix(){
        return hystricService.test();
    }
}
