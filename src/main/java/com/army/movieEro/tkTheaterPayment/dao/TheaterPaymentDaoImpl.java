package com.army.movieEro.tkTheaterPayment.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.army.movieEro.tkTheaterPayment.vo.TheaterPayment;

@Repository("theaterPaymentDaoImpl")

public class TheaterPaymentDaoImpl implements TheaterPaymentDao {

@Autowired
	SqlSession sqlsession;
	@Override
	public ArrayList<TheaterPayment> selectPayList(HashMap<String, String> visualMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertPayment() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePayment() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<TheaterPayment> selectPayList(String MB_ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
