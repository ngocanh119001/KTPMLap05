package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.service.ChuyenBayService;

@RestController
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	@RequestMapping("/chuyenbay/DAD")
	public List<ChuyenBay> listChuyenBayDiDAD(){
	 return	chuyenBayService.listChuyenBayDAD();
	}
	@RequestMapping("/chuyenbay/10To8")
	public List<ChuyenBay> listChuyenBay10to8(){
	 return	chuyenBayService.lisChyenBaysnhohon1000();
	}
	@RequestMapping("/chuyenbay/baydenvadi")
	public List<ChuyenBay> listChuyenBayDenVaDi(){
	 return	chuyenBayService.listChuyenBayDenVaDi();
	}
	@RequestMapping("/chuyenbay/numSGN")
	public int numChuyenBaySGN() {
		return chuyenBayService.numChuyenBaySGN();
	}
	@RequestMapping("/chuyenbay/gaDen")
	public List<String> listfindGroupGaDi() {
		return chuyenBayService.listGroupGaDi();
	}
	@RequestMapping("/chuyenbay/listSumCP")
	public List<String> listfindsumCP() {
		return chuyenBayService.listfindSumChiPhi();
	}
	@RequestMapping("/chuyenbay/list1200")
	public List<ChuyenBay> list1200() {
		return chuyenBayService.list1200();
	}
	@RequestMapping("/chuyenbay/truoc12h")
	public List<String> list1200GaDi() {
		return chuyenBayService.list1200byGroupGaDi();
	}
	@RequestMapping("/chuyenbay/findMaxTam")
	public List<String> findMaxTamBoeing() {
		return chuyenBayService.findMaxTamBayOfBoeing();
	}
	
	

}
