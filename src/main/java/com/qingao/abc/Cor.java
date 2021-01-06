package com.qingao.abc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cor {
	
	@RequestMapping("aa")
	public String aa(){
		return "aa";
	}
}
