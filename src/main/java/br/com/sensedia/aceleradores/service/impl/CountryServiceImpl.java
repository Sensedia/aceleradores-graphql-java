package br.com.sensedia.aceleradores.service.impl;

import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import br.com.sensedia.aceleradores.repository.CountryRepository;
import br.com.sensedia.aceleradores.service.CountryService;
import br.com.sensedia.aceleradores.specification.filter.CountryFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public CountryRest getCountry(CountryFilter countryFilter) {
        return countryRepository.findCountryByName(countryFilter.getCountryName());
    }
}
