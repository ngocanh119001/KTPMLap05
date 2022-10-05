package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.entity.MayBay;
import com.example.demo_jpa.service.MayBayService;

@RestController
public class MayBayController {
	@Autowired
	private MayBayService mayBayService;
	
	@RequestMapping("/maybay/tambay100")
	public List<MayBay> listTamBay1000(){
		return mayBayService.listTamBay10000();
	};
	@RequestMapping("/maybay/numBoeing")
	public int numBoeing(){
		return mayBayService.numMayBayBoeing();
	};
	@RequestMapping("/maybay/numMaMBMax")
	public List<String> listMaMBMAX3AndTamBay(){
		return mayBayService.listMaMBMAX3AndTamBay1();
	};
	@RequestMapping("/maybay/listOfMb")
	public List<String> listOfMayBay(){
		return mayBayService.listNVOfMayBay1();
	};
}
