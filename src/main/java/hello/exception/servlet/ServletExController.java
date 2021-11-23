package hello.exception.servlet;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpResponse;

@Slf4j
@Controller
public class ServletExController {

    /**
     * 이제 오류가 발생했을 때 오류 페이지로 /error 를 기본 요청한다. 스프링 부트가 자동 등록한
     * BasicErrorController 는 이 경로를 기본으로 받는다
     */

    @GetMapping("/error-ex")
    public void errorEx() {
        throw new RuntimeException("예외발생");
    }

    @GetMapping("/error-404")
    public void error404(HttpServletResponse response) throws IOException {
        response.sendError(404, "404 오류");
    }

    @GetMapping("/error-400")
    public void error400(HttpServletResponse response) throws IOException {
        response.sendError(400, "400 오류");
    }

    @GetMapping("/error-500")
    public void error500(HttpServletResponse response) throws IOException {
        response.sendError(500, "404 오류");
    }

}

