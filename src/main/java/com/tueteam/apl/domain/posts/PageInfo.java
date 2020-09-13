package com.tueteam.apl.domain.posts;

import lombok.Data;
import org.springframework.data.domain.PageRequest;

@Data
public class PageInfo {

  public final static int DEFAULT_RECORD_COUNT = 10;
  public final static int DEFAULT_PAGE_SIZE = 10;
  public final static int DEFAULT_PAGE_NO = 0;

  private Integer recordCountPerPage;
  private Integer pageSize;
  private Integer currentPageNo;

  private long totalCount;
  private long totalPageCount;

  private long firstPageNo;
  private long lastPageNo;

  private long prevPageNo;
  private long nextPageNo;

  private long firstRecordIndex;
  private long lastRecordIndex;

  private PageRequest pageRequest;

  public PageInfo(Integer recordCountPerPage, Integer pageSize, Integer currentPageNo) {
    this.recordCountPerPage = recordCountPerPage == null ? DEFAULT_RECORD_COUNT : recordCountPerPage;
    this.pageSize = pageSize == null ? DEFAULT_PAGE_SIZE : pageSize;
    this.currentPageNo = currentPageNo == null ? DEFAULT_PAGE_NO : currentPageNo;

    this.pageRequest = PageRequest.of(this.currentPageNo, this.recordCountPerPage);
  }

  public PageInfo init(long totalCount){
    this.totalCount = totalCount;
    this.totalPageCount = ((totalCount - 1) / recordCountPerPage) + 1;

    this.firstPageNo = (currentPageNo / pageSize) * pageSize + 1;
    this.lastPageNo = firstPageNo + pageSize - 1 > totalPageCount ? totalPageCount :
        firstPageNo + pageSize - 1;

    this.prevPageNo = currentPageNo == 0 ? 0 : currentPageNo - 1;
    this.nextPageNo = currentPageNo == totalPageCount - 1 ? totalPageCount - 1 : currentPageNo + 1;

    this.firstRecordIndex = currentPageNo * recordCountPerPage + 1;
    this.lastRecordIndex = (currentPageNo + 1) * recordCountPerPage > totalCount ? totalCount :
        (currentPageNo + 1) * recordCountPerPage;

    return this;
  }

}
