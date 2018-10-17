package br.com.sensedia.aceleradores.infraestructure.weather.client;

import br.com.sensedia.aceleradores.infraestructure.weather.model.WeatherRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherRestClient {

    @Value("${weather.api.endpoint}")
    private String weatherEndpoint;

    @Autowired
    private RestTemplate restClient;

    private static final String BASEPATH = "/data/2.5/weather";

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }


    public WeatherRest getWeatherByCityName(String cityName) {

        WeatherRest result = null;
        StringBuilder url =  new StringBuilder().
                append(weatherEndpoint).append(BASEPATH ).
                append("?q=").
                append("{cityName}").
                append(",br").
                append("&APPID=d23286b45c3311c864c15141e1694d16");

        try {
            HttpEntity<?> entity = new HttpEntity<>(createHeaders());
            ResponseEntity<WeatherRest> response = restClient.exchange(
                    url.toString(),
                    HttpMethod.GET,
                    entity,
                    WeatherRest.class,
                    cityName);
            WeatherRest weatherRest = response.getBody();

            if (weatherRest == null) {
                return null;
            }

            result = weatherRest;

        } catch (HttpClientErrorException e) {
            throw e;
        }

        return result;
    }


}
