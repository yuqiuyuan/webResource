package com.drebander.webResource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("debugTask")
public class TaskController {

    private static String viewPrefix = "debugTask";

    /**
     * 数据加密首页展示
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView(String.format("%s/index", viewPrefix));
        return modelAndView;
    }

}
