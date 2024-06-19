package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.domain.Criteria;

public interface BoardDAO {
	
	// 게시판 글 작성
	public void create(BoardVO vo) throws Exception;
	
	// 게시판 리스트(All)
	public List<BoardVO> listALL() throws Exception;

	// 글 조회수 1증가
	public void updateReadCnt(int bno) throws Exception;

	// 글 본문 조회
	public BoardVO InfoALL(int bno) throws Exception;

	// 글 본문 수정
	public BoardVO updateBoard(BoardVO vo) throws Exception;

	// 글 본문 삭제
	public BoardVO deleteBoard(int bno);

	// 게시판 페이징 처리
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listPage(Criteria cri) throws Exception;

}
