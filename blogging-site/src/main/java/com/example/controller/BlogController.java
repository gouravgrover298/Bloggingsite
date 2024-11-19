package com.example.controller;

import com.example.model.Blog;
import com.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // Get all blogs
    @GetMapping
    public List<Blog> getAllPosts() {
        return blogService.getAllBlogs();
    }

    // Get blog by id
    @GetMapping("/{id}")
    public ResponseEntity<Blog> getPostById(@PathVariable Long id) {
        Blog post = blogService.getBlogById(id).orElseThrow(() -> new RuntimeException("Blog not found"));
        return ResponseEntity.ok(post);
    }

    // Create a new blog
    @PostMapping
    public ResponseEntity<Blog> createPost(@RequestBody Blog post) {
        Blog createdPost = blogService.createBlog(post);
        return ResponseEntity.ok(createdPost);
    }

    // Update an existing blog
    @PutMapping("/{id}")
    public ResponseEntity<Blog> updatePost(@PathVariable Long id, @RequestBody Blog post) {
        Blog updatedPost = blogService.updateBlog(id, post);
        return ResponseEntity.ok(updatedPost);
    }

    // Delete blog by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id) {
        blogService.deleteBlog(id);
        return ResponseEntity.ok("Blog deleted successfully");
    }
}
