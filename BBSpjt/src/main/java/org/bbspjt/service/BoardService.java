package org.bbspjt.service;

import java.util.List;

import org.bbspjt.domain.BoardVO;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(Integer bdID) throws Exception;

	public void modify(BoardVO board) throws Exception;

	public void remove(Integer bdID) throws Exception;

	public List<BoardVO> listAll() throws Exception;
}
