package com.tueteam.apl.web.param;

import lombok.Data;

@Data
public class PageParams {
  Integer recordCountPerPage;
  Integer pageSize;
  Integer currentPageNo;
}
