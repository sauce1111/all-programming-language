package com.tueteam.apl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * tailwind - windmill 템플릿의 원본 디자인과 컴포넌트에 대한
 *            소스를 확인하기 위한 매핑
 *
 *  참고 : https://windmill-dashboard.vercel.app/
 *
 *  - http://localhost:8080/windmill/index.html
 *  - http://localhost:8080/windmill/forms.html
 *  - http://localhost:8080/windmill/cards.html
 *  - http://localhost:8080/windmill/charts.html
 *  - http://localhost:8080/windmill/buttons.html
 *  - http://localhost:8080/windmill/modals.html
 *  - http://localhost:8080/windmill/tables.html
 *  - http://localhost:8080/windmill/pages/404.html
 *  - http://localhost:8080/windmill/pages/blank.html
 *  - http://localhost:8080/windmill/pages/create-account.html
 *  - http://localhost:8080/windmill/pages/forgot-password.html
 *  - http://localhost:8080/windmill/pages/login.html
 */
@Controller
public class WindmillController {

  @RequestMapping("/windmill/{url}")
  public String windmill(@PathVariable("url") String url) {
    return "windmill/" + url;
  }

  @RequestMapping("/windmill/pages/{url}")
  public String windmillPages(@PathVariable("url") String url) {
    return "windmill/pages/" + url;
  }

}
