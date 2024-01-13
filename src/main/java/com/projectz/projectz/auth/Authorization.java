package com.projectz.projectz.auth;


import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Authorization {
	
	private final DrupalOauthService drupalOauthService;

    public Authorization(DrupalOauthService drupalOauthService) {
        this.drupalOauthService = drupalOauthService;
    }

    @PostMapping("/oauth/token")
    public ResponseEntity<String> getAccessToken(@RequestParam String Username, @RequestParam String Password) throws Exception {
    	OAuthJSONAccessTokenResponse token =  drupalOauthService.getAccessToken(Username, Password);
    	System.out.println(token);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
        String jsonTokenResponse = objectMapper.writeValueAsString(token);
    	System.out.println(jsonTokenResponse);
        return ResponseEntity.status(HttpStatus.OK).body(jsonTokenResponse);
    }
}
