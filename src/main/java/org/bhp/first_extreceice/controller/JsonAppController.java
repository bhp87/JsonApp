package org.bhp.first_extreceice.controller;

import org.bhp.first_extreceice.service.IJsonAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/get_posts/")
public class JsonAppController {

    IJsonAppService iJsonAppService;

    @Autowired
    public JsonAppController(IJsonAppService iJsonAppService) {
        this.iJsonAppService = iJsonAppService;
    }

    @GetMapping("{postSource}")
    public String getPosts(@PathVariable String postSource) {
        return iJsonAppService.getPosts(postSource);
    }

}