package com.shrijal.demo.Portfolio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/myself")
    public String Myself(){
        return """
                <h1>Myself</h1>
                <p>My name is Shrijal Singh</p>
                <ul>
                <li><a>Leetcode - https://leetcode.com/u/buBiRnfIw0/</a></li>
                <li><a>Github - https://github.com/Shrijalsingh6393</a></li>
                </ul>""";
    }

    @GetMapping("/skills")
    public String Skills(){
        return """
                <h1>My skills</h1>
                <p>C++</p>
                <p>Java</p>
                <p>HTML</p>
                <p>CSS</p>
                <p>JavaScript</p>
                <p>React Js</p>
                <p>Node Js</p>
                """;
    }
}
