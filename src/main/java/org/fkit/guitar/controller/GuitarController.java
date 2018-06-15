package org.fkit.guitar.controller;

import java.util.List;
import java.util.Map;

import org.fkit.guitar.pojo.Guitar;
import org.fkit.guitar.pojo.spec.GuitarSpec;
import org.fkit.guitar.service.GuitarService;
import org.fkit.guitar.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class GuitarController extends BaseController{
	@Autowired
	private GuitarService guitarService;
	
	

	//查询
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<Guitar> search(GuitarSpec guitarSpec) throws Exception{
		return guitarService.search(guitarSpec);
    }
	
	//添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> add(Guitar guitar) throws Exception{
		try{
			guitar.setId(UUIDUtil.generate());
			guitarService.add(guitar);
			return this.ajaxSuccessResponse();
		}catch(Exception e){
			return this.ajaxFailureResponse(); 
		}
		
    }
	
	//删除
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> delete(String id) throws Exception{
		try{
			guitarService.delete(id);
			return this.ajaxSuccessResponse();
		}catch(Exception e){
			return this.ajaxFailureResponse();
		}
		
    }
	
	//修改
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> update(Guitar guitar) throws Exception{
		try{
			guitarService.update(guitar);
			return this.ajaxSuccessResponse();
		}catch(Exception e){
			return this.ajaxFailureResponse();
		}
    }
	
}
