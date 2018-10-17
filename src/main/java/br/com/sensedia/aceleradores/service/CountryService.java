package br.com.sensedia.aceleradores.service;

import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import br.com.sensedia.aceleradores.specification.filter.CountryFilter;

public interface CountryService {

    CountryRest findByFilter(CountryFilter countryFilter);

}
