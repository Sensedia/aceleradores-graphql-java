package br.com.sensedia.aceleradores.resolver;

import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import br.com.sensedia.aceleradores.inputs.ConvertInput;
import br.com.sensedia.aceleradores.inputs.CountryInput;
import br.com.sensedia.aceleradores.inputs.WheaterInput;
import br.com.sensedia.aceleradores.models.ConvertedCurrency;
import br.com.sensedia.aceleradores.models.Country;
import br.com.sensedia.aceleradores.models.Wheater;

@Component
public class QueryResolver implements GraphQLQueryResolver {

  public Wheater wheater(WheaterInput wheater) {
    return null;
  }

  public Country country(CountryInput country) {
    return null;
  }

  public ConvertedCurrency convertedCurrency(ConvertInput convert) {
    return null;
  }
}
