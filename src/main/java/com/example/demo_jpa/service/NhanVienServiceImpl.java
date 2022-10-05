package com.example.demo_jpa.service;

import java.util.List;

import com.example.demo_jpa.entity.NhanVien;

public interface NhanVienServiceImpl  {
	void addNV (NhanVien nhanVien);
	List<NhanVien> getAllNhanVien();
	List<NhanVien> lisLuongNV();
	int sumLuong();
	int sumLuongNV();
	List<String> listbyLuongMax();
	List<String> listbyNotPhiCong();
	
}
