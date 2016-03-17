package org.matlab.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.matlab.domain.BoardVO;
import org.matlab.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class BoardServiceTest {

  @Inject
  private BoardService service;

  private static Logger logger = LoggerFactory.getLogger(BoardServiceTest.class);

  @Test
  public void testCreate() throws Exception {

    BoardVO board = new BoardVO();
    board.setTitle("우히히히히히");
    board.setContent("우하하하하하하하하하하하");
    board.setWriter("형우");
    service.regist(board);
  }

  @Test
  public void testRead() throws Exception {

    logger.info(service.read(1).toString());
  }

  @Test
  public void testUpdate() throws Exception {

    BoardVO board = new BoardVO();
    board.setBno(1);
    board.setTitle("수정된 글입니다.");
    board.setContent("수정 테스트 ");
    service.modify(board);
  }

  @Test
  public void testDelete() throws Exception {

    service.remove(1);
  }

  @Test
  public void testListAll() throws Exception {

    logger.info(service.listAll().toString());

  }

/*  @Test
  public void testListPage() throws Exception {

    int page = 3;

    List<BoardVO> list = dao.listPage(page);

    for (BoardVO boardVO : list) {
      logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
    }
  }

  @Test
  public void testListCriteria() throws Exception {

    Criteria cri = new Criteria();
    cri.setPage(2);
    cri.setPerPageNum(20);

    List<BoardVO> list = dao.listCriteria(cri);

    for (BoardVO boardVO : list) {
      logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
    }
  }

  @Test
  public void testURI() throws Exception {

    UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/board/read").queryParam("bno", 12)
        .queryParam("perPageNum", 20).build();

    logger.info("/board/read?bno=12&perPageNum=20");
    logger.info(uriComponents.toString());

  }

  @Test
  public void testURI2() throws Exception {

    UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/{module}/{page}").queryParam("bno", 12)
        .queryParam("perPageNum", 20).build().expand("board", "read").encode();

    logger.info("/board/read?bno=12&perPageNum=20");
    logger.info(uriComponents.toString());
  }

  @Test
  public void testDynamic1() throws Exception {

    SearchCriteria cri = new SearchCriteria();
    cri.setPage(1);
    cri.setKeyword("글");
    cri.setSearchType("t");

    logger.info("=====================================");

    List<BoardVO> list = dao.listSearch(cri);

    for (BoardVO boardVO : list) {
      logger.info(boardVO.getBno() + ": " + boardVO.getTitle());
    }

    logger.info("=====================================");

    logger.info("COUNT: " + dao.listSearchCount(cri));
  }*/

}
