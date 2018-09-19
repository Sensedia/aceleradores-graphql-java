package br.com.sensedia.aceleradores.infraestructure.country.client;

import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

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
            HttpEntity<?> entity = new HttpEntity<>(createHeaders());
            ResponseEntity<List<CountryRest>> response = restClient.exchange(
                    url.toString(),
                    HttpMethod.GET,
                    entity,
                    new ParameterizedTypeReference<List<CountryRest>>(){},
                    name);
            List<CountryRest> list = response.getBody();

            if (list == null || list.isEmpty()) {
                return null;
            }

            result = list.get(0);

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
