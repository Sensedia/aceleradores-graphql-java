package br.com.sensedia.aceleradores.service.impl;

import br.com.sensedia.aceleradores.infraestructure.weather.model.WeatherRest;
import br.com.sensedia.aceleradores.repository.WeatherRepository;
import br.com.sensedia.aceleradores.service.WeatherService;
import br.com.sensedia.aceleradores.specification.filter.WeatherFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    WeatherRepository weatherRepository;

    @Override
    public WeatherRest findByFilter(WeatherFilter filter) {

        WeatherRest weatherRest = new WeatherRest();

        if (filter.getCityName() != null && !filter.getCityName().equals("")) {
            weatherRest = weatherRepository.findByCityName(filter.getCityName());
        }

        return weatherRest;
    }
}
