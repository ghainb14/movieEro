package com.army.movieEro.tkTheaterRental.service;

import java.util.ArrayList;

import com.army.movieEro.tkTheaterRental.vo.theaterImageVo;
import com.army.movieEro.tkTheaterRental.vo.theaterVO;


public interface theaterRentalService {


		public ArrayList<theaterVO> selectList();
		
		public ArrayList<theaterImageVo> selectImage();
		
		public theaterVO selectBoard(int boardNum);
		
		public int insertBoard(theaterVO b);
		
		public int insertImage(theaterImageVo b);
		
		public int updateBoard(theaterVO b);
		
		public int deleteBoard(int boardNum);
		
		public int getListCount();
}