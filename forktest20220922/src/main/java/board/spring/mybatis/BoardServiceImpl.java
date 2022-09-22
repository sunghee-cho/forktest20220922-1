package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardservice")
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO boarddao;
	
	@Override
	public int registerBoard(BoardDTO dto) {
		return boarddao.insertBoard(dto);
	}

	@Override
	public int getTotalBoard() {
		return boarddao.getTotalBoard();
	}

	@Override
	public List<BoardDTO> getBoardList(int limit) {
		return boarddao.getBoardList(limit);
	}

	@Override
	public BoardDTO updateAndGetDetail(int seq) {
		boarddao.updateViewcount(seq);
		return boarddao.getDetail(seq);
	}

	@Override
	public void deleteBoard(int seq) {
		boarddao.deleteBoard(seq);
		
	}

	@Override
	public BoardDTO getDetail(int seq) {
		return boarddao.getDetail(seq);
	}

	@Override
	public void updateBoard(BoardDTO dto) {
		boarddao.updateBoard(dto);
		
	}
	
	
	

}
