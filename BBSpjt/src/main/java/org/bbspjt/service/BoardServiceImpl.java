package org.bbspjt.service;

import java.util.List;

import javax.inject.Inject;

import org.bbspjt.domain.BoardDAO;
import org.bbspjt.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
		
	}

	@Override
	public BoardVO read(Integer bdID) throws Exception {

		return dao.read(bdID);
		
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		
		dao.update(board);
		
	}

	@Override
	public void remove(Integer bdID) throws Exception {
		
		dao.delete(bdID);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {

		return dao.listAll();

	}



}
