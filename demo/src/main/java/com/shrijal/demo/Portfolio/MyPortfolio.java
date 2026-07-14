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
    @GetMapping("/Education")
    public String MyEducation(){
        return """
                <h1>My Education</h1>
                <ul>
                <li>10th - 90.2%</li>
                <li>12th - 92%</li>
                <li>B.Tech - 8.57 CGPA</li>
                </ul>
                """;
    }
    @GetMapping("/Projects")
    public String MyProjects(){
        return """
                <h1>My Projects</h1>
                <ul>
                <li>https://assignment-inside-iim-15x2.vercel.app/</li>
                <li>https://mood-sync-navy.vercel.app</li>
                <li>https://bucket-beryl.vercel.app</li>
                <li>https://suduko-solver-iota.vercel.app</li>
                <li>https://student-management-system-main-two.vercel.app/admin-dashboard</li>
                <ul>
                """;
    }
}
