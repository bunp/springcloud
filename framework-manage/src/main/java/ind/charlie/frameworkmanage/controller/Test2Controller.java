package ind.charlie.frameworkmanage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/8/26
 **/
@RestController
@RequestMapping("test")
@Slf4j
public class Test2Controller {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "test3333",method = RequestMethod.GET)
    public String test()throws Exception{
        int random =new Random().nextInt(4000);
        Thread.sleep(random);
        log.info(port);
        return port;
    }
}
