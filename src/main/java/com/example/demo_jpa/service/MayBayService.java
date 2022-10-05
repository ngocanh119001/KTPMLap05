package com.example.demo_jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jpa.entity.MayBay;
import com.example.demo_jpa.repository.MayBayDAOImpl;

@Service
public class MayBayService implements MayBayServiceImpl {
	
	@Autowired
	private MayBayDAOImpl mayBayDAOImpl;
	

	@Override
	public List<MayBay> listTamBay10000() {
		List<MayBay> mayBays = new ArrayList<MayBay>();
		mayBayDAOImpl.listTamBay10000(1000).forEach(mayBays::add);
		return mayBays;
	}


	@Override
	public int numMayBayBoeing() {
		int count = mayBayDAOImpl.numMayBayBeoing();
		return count;
	}


	@Override
	public List<String> listMaMBMAX3AndTamBay1() {
		// TODO Auto-generated method stub
		return mayBayDAOImpl.listMaMBMAX3AndTamBay1();
	}


	@Override
	public List<String> listNVOfMayBay1() {
		// TODO Auto-generated method stub
		return mayBayDAOImpl.listNVOfMayBay1();
	}




}
