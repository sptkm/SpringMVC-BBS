package org.bbspjt.domain;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession session;
	
	private static final String namespace = "org.bbspjt.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO board) throws Exception {
		session.insert(namespace+".create", board);
		
	}

	@Override
	public BoardVO read(Integer bdID) throws Exception {
		return session.selectOne(namespace+".read", bdID);
	}

	@Override
	public void update(BoardVO board) throws Exception {
		session.update(namespace+".update", board);
		
	}

	@Override
	public void delete(Integer bdID) throws Exception {
		session.delete(namespace+".delete", bdID);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace+ ".listAll");

	}

}
