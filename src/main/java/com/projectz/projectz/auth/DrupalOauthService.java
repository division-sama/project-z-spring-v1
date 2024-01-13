package com.projectz.projectz.auth;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.springframework.stereotype.Service;


@Service
public class DrupalOauthService {

    private final String drupalOauthUrl;
    private final String clientId;
    private final String clientSecret;

    public DrupalOauthService() {
        this.drupalOauthUrl = "http://localhost:8080/oauth/token";
        this.clientId = "client1";
        this.clientSecret = "root";
    }

    public OAuthJSONAccessTokenResponse getAccessToken(String username, String password) throws Exception {
       
    	// Create an OAuth client using a custom HTTP client (URLConnectionClient).
        OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
        
        OAuthClientRequest request = OAuthClientRequest.tokenLocation(drupalOauthUrl)
                .setGrantType(GrantType.PASSWORD)
                .setClientId(clientId)
                .setClientSecret(clientSecret)
                .setUsername(username)
                .setPassword(password)
                .buildBodyMessage();
    	
    	OAuthJSONAccessTokenResponse res = oAuthClient.accessToken(request,OAuth.HttpMethod.POST,OAuthJSONAccessTokenResponse.class);   
    	return res;
    }
    
}

