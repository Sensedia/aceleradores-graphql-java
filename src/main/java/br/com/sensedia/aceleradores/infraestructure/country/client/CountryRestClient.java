package br.com.sensedia.aceleradores.infraestructure.country.client;

import br.com.sensedia.aceleradores.infraestructure.country.model.CountryResp;
import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
public class CountryRestClient {

    @Value("${country.api.endpoint}")
    private String countryEndpoint;

    @Autowired
    private RestTemplate restClient;

    private static final String BASEPATH = "/name";

    public CountryRest getCountryByName(String name) {

        CountryRest result = null;
        StringBuilder url =  new StringBuilder().append(countryEndpoint).append(BASEPATH ).append("/{name}");

        try {
            HttpEntity<CountryResp> entity = new HttpEntity<>(createHeaders());
            ResponseEntity<?> response = restClient.exchange(url.toString(), HttpMethod.GET, entity, CountryRest[].class, name);

            if (response == null || !response.getStatusCode().equals(HttpStatus.OK) || response.getBody() == null) {
                return null;
            }

            Gson gson = new Gson();
            Type collectionType = new TypeToken<ArrayList<CountryRest>>(){}.getType();
            List<CountryRest> arrayList = gson.fromJson(response.getBody().toString(), collectionType);

            result = arrayList.get(0);

        } catch (HttpClientErrorException e) {
            throw e;
        }

        return result;
    }

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }


}
