package com.uuh.springbootinstance.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cg
 * @description thymeleaf---@RestController无法返回页面
 * @date 2019/12/20 14:18
 * @since 1.0
 */
@Controller
public class thymeleafController {

    @RequestMapping("/thymeleaf")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("host","hello");
        return "thymeleaf";
    }



}