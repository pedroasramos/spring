package br.edu.ifba.demo.controller;

@Controller
public class HelloController {

    @RequestMapping("/helloworld")
    @ResponseBody
    public String hello(){
        return "Hello INF012!";
    }
}
