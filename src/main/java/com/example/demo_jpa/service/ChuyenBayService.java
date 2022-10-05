package com.example.demo_jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.ChuyenBay;
import com.example.demo_jpa.repository.ChuyenBayDAOImpl;

@Service
public class ChuyenBayService implements ChuyenBayImpl{
	@Autowired
	private ChuyenBayDAOImpl chuyenBayDAOImpl;

	@Override
	public void addChuyenBay(ChuyenBay chuyenBay) {
		
		
		
	}

	@Override
	public List<ChuyenBay> listChuyenBayDAD() {
		List<ChuyenBay> chuyenBays= new ArrayList<ChuyenBay>();
		chuyenBayDAOImpl.listChuyenBayDAD("DAD").forEach(chuyenBays::add);;
		
		return chuyenBays;
	}

	@Override
	public List<ChuyenBay> lisChyenBaysnhohon1000() {
		List<ChuyenBay> chuyenBays = new ArrayList<ChuyenBay>();
		chuyenBayDAOImpl.listChuyenBay10To8().forEach(chuyenBays::add);
		return chuyenBays;
	}

	@Override
	public List<ChuyenBay> listChuyenBayDenVaDi() {
		List<ChuyenBay> chuyenBays = new ArrayList<ChuyenBay>();
		chuyenBayDAOImpl.listChuyenBayDenVaDi("SGN", "BMV").forEach(chuyenBays::add);
		return chuyenBays;
	}

	@Override
	public int numChuyenBaySGN() {
		int chuyenbay = chuyenBayDAOImpl.numChuyenBaySGN();
		return chuyenbay;
	}

	@Override
	public List<String> listGroupGaDi() {
		return chuyenBayDAOImpl.listfindGroupGaDi();
	}

	@Override
	public List<String> listfindSumChiPhi() {
		// TODO Auto-generated method stub
		return chuyenBayDAOImpl.listfindSumChiPhi();
	}

	@Override
	public List<ChuyenBay> list1200() {
		List<ChuyenBay> chuyenBays = new ArrayList<ChuyenBay>();
		chuyenBayDAOImpl.list1200().forEach(chuyenBays::add);
		return chuyenBays;
	}

	@Override
	public List<String> list1200byGroupGaDi() {
		// TODO Auto-generated method stub
		return chuyenBayDAOImpl.list1200byGroupGaDi();
	}

	@Override
	public List<String> findMaxTamBayOfBoeing() {
		// TODO Auto-generated method stub
		return chuyenBayDAOImpl.findMaxTamBayOfBoeing("");
	}


	

}
