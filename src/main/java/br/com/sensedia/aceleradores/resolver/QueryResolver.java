package br.com.sensedia.aceleradores.resolver;

import br.com.sensedia.aceleradores.interfaces.json.converter.CountryConverter;
import br.com.sensedia.aceleradores.models.Country;
import br.com.sensedia.aceleradores.service.CountryService;
import br.com.sensedia.aceleradores.specification.filter.CountryFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import br.com.sensedia.aceleradores.inputs.ConvertInput;
import br.com.sensedia.aceleradores.inputs.CountryInput;
import br.com.sensedia.aceleradores.inputs.WheaterInput;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

  @Autowired
  private CountryService countryService;

//  public WheaterGraphQLType wheater(WheaterInput wheater) {
//    return null;
//  }

  public Country country(CountryInput countryInput) {
    CountryFilter countryFilter = CountryConverter.toCountryFilter(countryInput);
    Country country = CountryConverter.toCountry(countryService.getCountry(countryFilter)) ;

    return country;
  }

//  public ConvertedCurrency convertedCurrency(ConvertInput convert) {
//    return null;
//  }
}
