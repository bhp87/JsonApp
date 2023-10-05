package org.bhp.first_extreceice.controller;

import jdk.jshell.spi.ExecutionControl;
import org.bhp.first_extreceice.dto.DummyPostsJsonDto;
import org.bhp.first_extreceice.service.IJsonAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class JsonAppController {

    IJsonAppService iJsonAppService;

    @Autowired
    public JsonAppController(IJsonAppService iJsonAppService) {
        this.iJsonAppService = iJsonAppService;
    }

    @GetMapping("posts/{postSource}")
    public  List<?> getPosts(@PathVariable String postSource) throws ExecutionControl.NotImplementedException {
        return iJsonAppService.<DummyPostsJsonDto>getPosts(postSource);
    }

    @GetMapping("comments/{commentSource}")
    public String getComments(@PathVariable String commentSource) {
        return iJsonAppService.getComments(commentSource);
    }
}