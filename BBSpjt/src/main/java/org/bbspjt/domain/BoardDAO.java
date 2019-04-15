package org.bbspjt.domain;

import org.bbspjt.domain.BoardVO;
import java.util.List;

public interface BoardDAO {
	public void create(BoardVO board) throws Exception;

	public BoardVO read(Integer bdID) throws Exception;

	public void update(BoardVO board) throws Exception;
	
	public void delete(Integer bdID) throws Exception;

	public List<BoardVO> listAll() throws Exception;
}