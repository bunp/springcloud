package ind.charlie.ribbon.service;


import ind.charlie.ribbon.hystrix.testFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/9/4
 **/
@FeignClient(name = "charlie-manage",fallback = testFallback.class)
public interface TestFeign {

    @RequestMapping(value = "/test/test",method = RequestMethod.GET)
    public String test();
}
