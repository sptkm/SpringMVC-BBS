package org.bbspjt;

import java.util.List;

import javax.inject.Inject;

import org.bbspjt.domain.BoardVO;
import org.bbspjt.domain.MemberDAO;
import org.bbspjt.domain.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(MemberDAOTest.class);
	
	@Test
	public void testInsertMember()throws Exception{
		
		MemberVO member = new MemberVO();
		member.setMemID("matsumoto");
		member.setMemPW("3333");
		member.setMemName("松本");
		member.setMemGender("女");
		member.setMemMail("matsumoto@aaa.com");
		
		dao.inserMember(member);

	}

		

}
