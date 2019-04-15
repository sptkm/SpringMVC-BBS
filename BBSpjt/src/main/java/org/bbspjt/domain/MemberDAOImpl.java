package org.bbspjt.domain;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession session;
	
	private static final String namespace = "org.bbspjt.mapper.MemberMapper";
	
	@Override
	public void inserMember(MemberVO member) throws Exception {		
		session.insert(namespace+".insertMember",member);
	}

	@Override
	public boolean loginCheck(MemberVO member) throws Exception {
		String name = session.selectOne(namespace+".loginCheck", member);
		return (name == null) ? false : true;
	}
	
	@Override
	public void logout(HttpSession session) throws Exception {
		
	}

}
