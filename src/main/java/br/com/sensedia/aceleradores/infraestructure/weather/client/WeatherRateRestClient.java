package br.com.sensedia.aceleradores.infraestructure.weather.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherRateRestClient {

    @Value("${weather.api.endpoint}")
    private String weatherEndpoint;

    @Autowired
    private RestTemplate restClient;



}
