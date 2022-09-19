package mygroup.boardservice.common;

import lombok.Getter;

@Getter
public class Pagination {

    private int pageListSize;  // 페이지 리스트에 표시할 범위 (초기값 10 : 1~10)
    private int rowSize;       //하나의 페이지에서 보여줄 데이터 행(레코드) 갯수 (초기값 10)

    public Pagination(int currentPageNum, int totalRowCnt) {
        this.pageListSize = 5;
        this.rowSize = 20;
        pageInfo(currentPageNum, totalRowCnt);
    }

    public Pagination(int rowSize, int currentPageNum, int totalRowCnt) {
        this.pageListSize = 5;
        this.rowSize = rowSize;
        pageInfo(currentPageNum, totalRowCnt);
    }

    public Pagination(int pageListSize, int rowSize, int currentPageNum, int totalRowCnt) {
        this.pageListSize = pageListSize;
        this.rowSize = rowSize;
        pageInfo(currentPageNum, totalRowCnt);
    }

    private int currentPageNum;     //현재 보고 있는 페이지의 번호
    private int pageListNum;        //현재 페이지 리스트가 몇 번째 인지
    private int totalRowCnt;        //DB 테이블의 전체 데이터 행(레코드) 갯수

    private int startRow;           //현재 페이지에서 첫 데이터(행)가 테이블 상 몇 번째인지. (쿼리문 LIMIT 문법에 사용할 것)
    private int totalPageCnt;       //전체 페이지 수

    private int startPageNum;       //현재 페이지 리스트에서 시작 페이지 번호
    private int endPageNum;         //현재 페이지 리스트에서 끝 페이지 번호
    
    private boolean prev;           //'이전' 페이지 리스트 여부
    private boolean next;           //'다음' 페이지 리스트 여부

    public void pageInfo(int currentPageNum, int totalRowCnt) {
        this.currentPageNum = currentPageNum;
        this.pageListNum = (currentPageNum % pageListSize !=0) ? currentPageNum/pageListSize + 1 : currentPageNum/pageListSize;
        this.totalRowCnt = totalRowCnt;
        this.startRow = (currentPageNum - 1) * rowSize;
        this.totalPageCnt = (int) Math.ceil(totalRowCnt/ (float)rowSize);	        //전체 페이지수
        this.startPageNum = (pageListNum - 1) * pageListSize + 1 ;		//시작 페이지
        this.endPageNum = pageListNum * pageListSize;					//끝 페이지
        this.prev = pageListNum != 1;		             //이전 버튼 상태
        this.next = endPageNum < totalPageCnt;           //다음 버튼 상태
        
        if (this.endPageNum > this.totalPageCnt) {
            this.endPageNum = this.totalPageCnt;
        }
    }

}

