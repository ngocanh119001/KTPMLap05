package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.entity.NhanVien;
import com.example.demo_jpa.service.NhanVienService;

@RestController
public class NhanVienController {
	
	@Autowired
	private NhanVienService nhanVienService;
	@RequestMapping("/")
	public List<NhanVien> getAllNhanVien(){
		return nhanVienService.getAllNhanVien();
	};
	@RequestMapping(value="/add-nv", method=RequestMethod.POST)    
	public void addNV(@RequestBody NhanVien nhanVien)  
	{    
	nhanVienService.addNV(nhanVien);    
	} 
	@RequestMapping("/nhanvien/luong1000")
	public List<NhanVien> listLuongNV() {
		return nhanVienService.lisLuongNV();
	}
	@RequestMapping("/nhanvien/sumluong")
	public int sumLuong() {
		return nhanVienService.sumLuong();
	}
	@RequestMapping("/nhanvien/luongMax")
	public List<String> luongMax() {
		return nhanVienService.listbyLuongMax();
	}
	@RequestMapping("/nhanvien/notphicong")
	public List<String> notPhiCong() {
		return nhanVienService.listbyNotPhiCong();
	}
	@RequestMapping("/nhanvien/sumluongnv")
	public int sumLuongNV() {
		return nhanVienService.sumLuong();
	}
}
