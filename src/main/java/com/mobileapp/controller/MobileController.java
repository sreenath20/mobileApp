package com.mobileapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileapp.entity.Mobile;
import com.mobileapp.entity.MobileDTO;
import com.mobileapp.service.MobileService;

@RestController
@RequestMapping("v2")
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@PostMapping("mobileOld/{cid}")
	public Mobile addMobile(@RequestBody Mobile mobile,@PathVariable("cid") Integer cid) {
		return this.mobileService.addMobileByCid(mobile,cid);
		
	}
	
	@PostMapping("mobile")
	public Mobile addMobile(@RequestBody MobileDTO mobileDto) {
		return this.mobileService.addMobile(mobileDto);
		
	}
	
	@GetMapping("mobiles")
	public List<Mobile> getAllMobiles(){
		return this.mobileService.getAllMobiles();
	}
}
