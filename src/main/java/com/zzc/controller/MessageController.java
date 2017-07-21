package com.zzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*@author zzc
*@date 2017年7月21日--上午8:53:12
*/
@Controller
@RequestMapping("/message")
public class MessageController {
	@RequestMapping("/weixin")
	@ResponseBody
	public String message(
			@RequestParam String signature,
			@RequestParam String timestamp,
			@RequestParam String nonce,
			@RequestParam String echostr
			){
		System.out.println("come hrere");
		return echostr;
	}
}

