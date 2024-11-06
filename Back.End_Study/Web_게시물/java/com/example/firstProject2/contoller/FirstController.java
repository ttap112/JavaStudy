package com.example.firstProject2.contoller;  // 컨트롤러 패키지 이름 확인 (대소문자 구분)

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String NiceToMeetYou(Model model) {
        model.addAttribute("username", "장발장");
        return "greetings";  // greetings.mustache 템플릿 반환
    }
    @GetMapping("/bye")
    public String SeeyouAgain(Model model) {
        model.addAttribute("nickname","장발장");
        return "goodbye";
    }
}
