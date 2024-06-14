package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

import jdk.dynalink.Namespace;

@Repository // 스프링에서 하나의 빈으로 취급해줌
public class BoardDAOImpl implements BoardDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);
	
	// 디비 연결정보 -> 객체 주입을 통한 사용 (root-context의sqlSession이 다 해줌)
	@Inject
	private SqlSession sqlSession;
	
	// mapper의 NAMESPACE 정보 저장
	private static final String Namespace="com.itwillbs.mapper.BoardMapper.";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		logger.debug("연결된 mapper에 SQL 구문 실행");
		
		sqlSession.insert(Namespace +"create", vo);
		
	}

	@Override
	public List<BoardVO> listALL() throws Exception {
		logger.debug("listALL() 실행");
		// mapper 에 설정된 SQL구문을 실행
		
		return sqlSession.selectList(Namespace +"listALL");
	}
	
	
	

}
