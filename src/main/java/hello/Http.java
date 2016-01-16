package hello;

import objects.Quote;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hliu on 1/11/16.
 */
public class Http {

    public Quote getQuote(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    }
}
