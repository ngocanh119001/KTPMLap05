package com.example.demo_jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.demo_jpa.entity.ChuyenBay;

public interface ChuyenBayImpl {
	
	
	void addChuyenBay (ChuyenBay chuyenBay);
	List<ChuyenBay> listChuyenBayDAD();
	List<ChuyenBay> lisChyenBaysnhohon1000();
	List<ChuyenBay>  listChuyenBayDenVaDi();
	int numChuyenBaySGN();@Query(value = "select GaDi,count(GaDi )from chuyenbay group by GaDi",nativeQuery = true)
	List<String> listGroupGaDi();
	List<String> listfindSumChiPhi();
	List<ChuyenBay> list1200();
	List<String> list1200byGroupGaDi();
	List<String> findMaxTamBayOfBoeing();
}
