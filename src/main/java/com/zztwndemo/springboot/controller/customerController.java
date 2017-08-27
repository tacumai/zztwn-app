package com.zztwndemo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class customerController {
    @RequestMapping("/")
	public String index() {
		return "customers/index";
	}
}
