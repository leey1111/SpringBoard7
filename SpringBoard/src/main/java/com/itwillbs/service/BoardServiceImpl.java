package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.domain.Criteria;
import com.itwillbs.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	// DAO 객체를 주입
	@Inject
	private BoardDAO bdao;
	
	@Override
	public void regist(BoardVO vo) throws Exception {

		logger.debug("연결된 DAO 메서드를 호출");
		
		bdao.create(vo);
		
		logger.debug("글쓰기 완료!");
	}

	@Override
	public List<BoardVO> listALL() throws Exception {
		logger.debug("게시판 글목록 조회");
		
		return bdao.listALL();
	}

	@Override
	public void updateReadCnt(int bno) throws Exception {
		
		logger.debug("updateReadCnt(int bno) 실행");
		logger.debug("bno ; "+ bno);
		
		bdao.updateReadCnt(bno);
		
	}

	@Override
	public BoardVO InfoALL(int bno) throws Exception {
		logger.debug("게시판 글본문 정보 조회");
		
		return bdao.InfoALL(bno);
	}

	@Override
	public BoardVO updateBoard(BoardVO vo) throws Exception{
		logger.debug("게시판 글 정보 수정");
		
		return bdao.updateBoard(vo);
	}

	@Override
	public BoardVO deleteBoard(int bno) throws Exception {
		logger.debug("게시판 글 정보 수정");
		
		return bdao.deleteBoard(bno);
		
	}

	@Override
	public List<BoardVO> listPage(Criteria cri) throws Exception {
		logger.debug("게시판 글목록 (페이징 처리) 조회");
		
		return bdao.listPage(cri);
	}

	@Override
	public int getTotalCount() throws Exception {
		logger.debug("게시판 글목록 개수 (페이징 처리) 조회");
		
		return bdao.getTotalCount();
	}
	
	
	
}
