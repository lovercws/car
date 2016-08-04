package com.lovecws.car.mer.web.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovecws.car.user.i.AppUserService;

@RequestMapping("/appUser")
@Controller
public class AppUserController {

	@Resource
	private AppUserService appUserService;

	@RequestMapping("/index")
	@ResponseBody
	public void index(HttpServletResponse response) throws IOException {

		appUserService.get(1);

		appUserService.getAll("sslslsl");

		response.getWriter().write("{'code':1,'msg':'hello world'}");
	}
}
