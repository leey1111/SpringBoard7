package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.domain.Criteria;

public interface BoardService {
	
	// 글쓰기 동작
	public void regist(BoardVO vo) throws Exception;
	
	// 글 전체 목록 조회
	public List<BoardVO> listALL() throws Exception;

	// 글 조회수 1증가
	public void updateReadCnt(int bno) throws Exception;

	// 저장된 정보 (본문) 조회
	public BoardVO InfoALL(int bno) throws Exception;

	// 저장된 정보 수정
	public BoardVO updateBoard(BoardVO vo) throws Exception;

	// 저장된 정보 삭제
	public BoardVO deleteBoard(int bno) throws Exception; 
	
	// 글 목록 조회 (페이징 처리)
	public List<BoardVO> listPage(Criteria cri) throws Exception;

}
