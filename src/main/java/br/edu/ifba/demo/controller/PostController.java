package br.edu.ifba.demo.controller;

import br.edu.ifba.demo.model.Post;

@RestController
public class PostController {
    @RequestMapping("/posts")
    public Post listar(){
        Post post = new Post();
        post.setTitulo("Titulo de exemplo");
        return post;
    }
}
