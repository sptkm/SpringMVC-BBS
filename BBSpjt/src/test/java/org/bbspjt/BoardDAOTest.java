package org.bbspjt;

import java.util.List;

import javax.inject.Inject;

import org.bbspjt.domain.BoardDAO;
import org.bbspjt.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {

	@Inject
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	

	@Test
	public void testCreate()throws Exception{
		
		
		BoardVO board = new BoardVO();
		board.setBdTitle("テスト2タイトルです");
		board.setBdContent("テスト2内容です");
		board.setBdWriter("tanaka");
		dao.create(board);
	}	
	
	@Test
	public void testRead()throws Exception{		
		
		logger.info(dao.read(2).toString());
	}
	
	@Test
	public void testUpdate()throws Exception{		
		
		BoardVO board = new BoardVO();
		board.setBdID(1);
		board.setBdTitle("修正テストタイトルです");
		board.setBdContent("修正テスト内容です");
		dao.create(board);
	}
	
	@Test
	public void testDelete()throws Exception{		
		
		dao.delete(4);
	}
	
}
