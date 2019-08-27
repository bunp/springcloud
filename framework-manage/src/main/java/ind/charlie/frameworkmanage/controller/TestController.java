package ind.charlie.frameworkmanage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/8/26
 **/
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String test(){
        return "hello,everyBody and dabao";
    }
}
