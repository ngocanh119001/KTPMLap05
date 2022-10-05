package com.example.demo_jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.repository.ChungNhanDAOImpl;

@Service
public class ChungNhanService implements ChungNhanImpl {

	@Autowired
	private ChungNhanDAOImpl chungNhanDAOImpl;

	@Override
	public List<String> findByBoeing() {
		return chungNhanDAOImpl.findByBoeing();
	}

	@Override
	public List<String> findByNV747() {
		return chungNhanDAOImpl.listNVLai747();
	}

	@Override
	public List<String> listMaMBofHN() {

		return chungNhanDAOImpl.listMaMBOfHoNguyen("Nguyen");
	}

	@Override
	public List<String> listMaNVLaiLoaiMB() {
		// TODO Auto-generated method stub
		return chungNhanDAOImpl.listMaMVLaiLoaiMB("Boeing", "Airbus");
	}

	@Override
	public List<String> listLoaiByMaCB() {
		// TODO Auto-generated method stub
		return chungNhanDAOImpl.findbyLoaiByMaCB("VN280");
	}

	@Override
	public List<String> findChuyenBayByLoai() {
		// TODO Auto-generated method stub
		return chungNhanDAOImpl.findChuyenBayByLoai("Airbus A320");
	}

	@Override
	public List<String> findTenNVByLoai() {
		// TODO Auto-generated method stub
		return chungNhanDAOImpl.findTenNVByLoai("Boeing");
	}

	@Override
	public List<String> listfindMayBayAndCountNV() {
		// TODO Auto-generated method stub
		return chungNhanDAOImpl.listfindMayBayAndCountNV();
	}

	@Override
	public List<String> listfindNVHavingMaMB3() {
		// TODO Auto-generated method stub
		return chungNhanDAOImpl.listfindNVHavingMaMB3();
	}

	

}
