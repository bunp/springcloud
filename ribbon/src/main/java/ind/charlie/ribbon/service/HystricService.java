package ind.charlie.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/9/4
 **/
@Service
public class HystricService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "testFallback")
    public String test(){
        return restTemplate.getForObject("http://charlie-manage/test/test3333",String.class);
    }

    public String testFallback(){
        return "fail";
    }
}
