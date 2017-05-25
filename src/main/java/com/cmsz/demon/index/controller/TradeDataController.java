package com.cmsz.demon.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

/*import com.cmsz.demon.index.dao.QueryLagouUser;
*//*import com.cmsz.demon.index.service.LagouUserService;*/

import javax.annotation.Resource;

@Controller

public class TradeDataController {
	
/*	@Resource
	private LagouUserService service;*/
	
/*	@Resource
	private QueryLagouUser queryLagouuser;
*/
	@RequestMapping(value="/index")
	public String index(Model model) throws Exception{
		String message="world";
		model.addAttribute("output",message);
		return "index";
	}
	
/*	@RequestMapping(value="/getname",method=RequestMethod.GET)
	public String getName(@RequestParam("input") String input,Model model) throws Exception{
		String name="";
		String name=service.query().get(0).getName();
		String name=queryLagouuser.queryLagouUser().get(1).getName();
		if(input==null){
			model.addAttribute("output",name);
		}else{
			model.addAttribute("output",name);
		}
		return "getname";
	}*/
}
