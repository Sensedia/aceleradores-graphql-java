package br.com.sensedia.aceleradores.resolver;

import br.com.sensedia.aceleradores.inputs.WeatherInput;
import br.com.sensedia.aceleradores.interfaces.json.converter.WeatherConverter;
import br.com.sensedia.aceleradores.models.Country;
import br.com.sensedia.aceleradores.models.Weather;
import br.com.sensedia.aceleradores.service.WeatherService;
import br.com.sensedia.aceleradores.specification.filter.WeatherFilter;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class CountryResolver implements GraphQLResolver<Country> {

    @Autowired
    private WeatherService weatherService;

    public Weather getWeather(Country country, WeatherInput filter) {

        WeatherFilter weatherFilter = new WeatherFilter();

        if (ObjectUtils.isEmpty(filter) || ObjectUtils.isEmpty(filter.getCityName())) {
            weatherFilter.setCityName(country.getCapital());
        } else {
            weatherFilter.setCityName(filter.getCityName());
        }

        Weather weather = WeatherConverter.toWheater(weatherService.findByFilter(weatherFilter));

        return weather;
    }

}
