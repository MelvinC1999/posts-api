package com.miempresa.posts_api.controller;


import com.miempresa.posts_api.model.Post;
import com.miempresa.posts_api.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/posts")
@Tag(name = "Post Controller", description = "API para gestionar publicaciones")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @Operation(summary = "Obtener todas las publicaciones", description = "Devuelve una lista de todas las publicaciones disponibles")
    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.getAllPosts();
        return ResponseEntity.ok(posts);
    }

    @Operation(summary = "Obtener una publicación por ID", description = "Busca y devuelve una publicación según su ID")
    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Post post = postService.getPostById(id);
        return (post != null) ? ResponseEntity.ok(post) : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Crear una nueva publicación", description = "Crea y guarda una nueva publicación")
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postService.savePost(post);
        return ResponseEntity.ok(savedPost);
    }

    @Operation(summary = "Eliminar una publicación", description = "Elimina una publicación por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        Post existingPost = postService.getPostById(id);
        if (existingPost != null) {
            postService.deletePost(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
