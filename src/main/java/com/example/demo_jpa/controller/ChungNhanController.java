package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.service.ChungNhanService;
@RestController
public class ChungNhanController {
	@Autowired
	private ChungNhanService chungNhanService;
	
	@GetMapping("/chungnhan")
	public List<String> findByBoeing() {
		return chungNhanService.findByBoeing();
	}
	@GetMapping("/chungnhan/nv747")
	public List<String> findByNV747() {
		return chungNhanService.findByNV747();
	}
	@GetMapping("/chungnhan/hoNguyen")
	public List<String> findbyNVofHN() {
		return chungNhanService.listMaMBofHN();
	}
	@GetMapping("/chungnhan/listNVlaiMB")
	public List<String> listNVlaiMB() {
		return chungNhanService.listMaNVLaiLoaiMB();
	}
	@GetMapping("/chungnhan/loai")
	public List<String> listLoaiByMaCB() {
		return chungNhanService.listLoaiByMaCB();
	}
	
	@RequestMapping("/chungnhan/chuyenbaybyloai")
	public List<String> listChuyenBayByLoai() {
		return chungNhanService.findChuyenBayByLoai();
	}
	@RequestMapping("/chungnhan/nhanvienbyloai")
	public List<String> listNVByLoai() {
		return chungNhanService.findTenNVByLoai();
	}
	@RequestMapping("/chungnhan/MBcountNV")
	public List<String> listMBcountNV() {
		return chungNhanService.listfindMayBayAndCountNV();
	}
	@RequestMapping("/chungnhan/NVhasMaMB3")
	public List<String> listNVhasMB3() {
		return chungNhanService.listfindNVHavingMaMB3();
	}



}
