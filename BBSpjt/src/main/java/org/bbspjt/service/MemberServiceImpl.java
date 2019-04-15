package org.bbspjt.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.bbspjt.domain.MemberDAO;
import org.bbspjt.domain.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;

	@Override
	public void insertMember(MemberVO member) throws Exception{
		
		dao.inserMember(member);		
	}

	@Override
	public boolean loginCheck(MemberVO member, HttpSession session) throws Exception{
		boolean result = dao.loginCheck(member);
		
		if (result) {			
			session.setAttribute("memID", member.getMemID());
			session.setAttribute("memPW", member.getMemPW());
		}	
		return result;		
	}

	@Override
	public void logout(HttpSession session) throws Exception{
		
		session.invalidate();		
	}
	

}
