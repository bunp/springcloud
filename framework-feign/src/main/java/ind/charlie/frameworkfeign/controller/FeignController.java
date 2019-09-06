package ind.charlie.frameworkfeign.controller;

import ind.charlie.frameworkfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/9/6
 **/
@RequestMapping("feign")
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;
    @RequestMapping(value = "testFeign",method = RequestMethod.GET)
    public String hello(){
        return feignService.hello();
    }
}
