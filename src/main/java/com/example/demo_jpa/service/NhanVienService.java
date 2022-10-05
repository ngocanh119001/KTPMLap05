package com.example.demo_jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.NhanVien;
import com.example.demo_jpa.repository.NhanVienDAOImpl;

@Service
public class NhanVienService implements NhanVienServiceImpl{
	
	@Autowired
	private NhanVienDAOImpl nhanVienDAOImpl;
	@Override
	public List<NhanVien> getAllNhanVien() {
		List<NhanVien> nhanvien = new ArrayList<>();
		nhanVienDAOImpl.findAll().forEach(nhanvien::add);
		return nhanvien;
	}
	;
	@Override
	public void addNV(NhanVien nhanVien)  
	{    
	nhanVienDAOImpl.save(nhanVien);   
	}
	@Override
	public List<NhanVien> lisLuongNV() {
		List<NhanVien> nhanViens = new ArrayList<NhanVien>();
		nhanVienDAOImpl.listLuongNV(10000).forEach(nhanViens::add);
		return nhanViens;
	}
	@Override
	public int sumLuong() {
		int sum = nhanVienDAOImpl.sumLuongNV();
		return sum;
	}
	@Override
	public List<String> listbyLuongMax() {
		// TODO Auto-generated method stub
		return nhanVienDAOImpl.listbyLuongMax();
	}
	@Override
	public List<String> listbyNotPhiCong() {
		// TODO Auto-generated method stub
		return nhanVienDAOImpl.listbyNotPhiCong();
	}
	@Override
	public int sumLuongNV() {
		int sum = nhanVienDAOImpl.sumLuongNV();
		return sum;
	}    
	
	
	

}
