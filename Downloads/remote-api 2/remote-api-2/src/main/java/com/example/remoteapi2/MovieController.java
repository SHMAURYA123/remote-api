package com.example.remoteapi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/get-info")
    public Object getMovieInfo(){
        String url="https://api.themoviedb.org/3/movie/157336?api_key=5d0f81d1e2430814744d84fadbba7fa8";
        Object response=restTemplate.getForObject(url, Object.class);
        return response;
    }
}

