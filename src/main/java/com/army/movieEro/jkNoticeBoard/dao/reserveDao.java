package com.army.movieEro.jkNoticeBoard.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.army.movieEro.jkNoticeBoard.vo.paymentVO;

public interface reserveDao {

	public int reserveInsert(HashMap<String, String> map);

	public ArrayList<String> seatList(HashMap<String, String> map);

}
