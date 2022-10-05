package com.example.demo_jpa.service;

import java.util.List;


public interface ChungNhanImpl {
//	List<Object[]> listChuyenBayDenVaDi();
	List<String> findByBoeing();

	List<String> findByNV747();

	List<String> listMaMBofHN();

	List<String> listMaNVLaiLoaiMB();

	List<String> listLoaiByMaCB();

	List<String> findChuyenBayByLoai();

	List<String> findTenNVByLoai();

	List<String> listfindMayBayAndCountNV();

	List<String> listfindNVHavingMaMB3();

	

}
