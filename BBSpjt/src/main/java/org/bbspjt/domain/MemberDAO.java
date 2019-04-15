package org.bbspjt.domain;

import javax.servlet.http.HttpSession;

public interface MemberDAO {

	public void inserMember(MemberVO member) throws Exception ;
	
	public boolean loginCheck(MemberVO member) throws Exception ;
	
	public void logout(HttpSession session) throws Exception ;

}
