package org.bbspjt.service;

import javax.servlet.http.HttpSession;

import org.bbspjt.domain.MemberVO;

public interface MemberService {
	
	public void insertMember(MemberVO member) throws Exception;
	
	public boolean loginCheck(MemberVO member, HttpSession session) throws Exception;
	
	public void logout(HttpSession session) throws Exception;

}
