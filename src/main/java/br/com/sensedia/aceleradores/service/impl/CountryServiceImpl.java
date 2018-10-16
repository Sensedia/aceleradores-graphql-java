package br.com.sensedia.aceleradores.service.impl;

import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import br.com.sensedia.aceleradores.repository.CountryRepository;
import br.com.sensedia.aceleradores.service.CountryService;
import br.com.sensedia.aceleradores.specification.filter.CountryFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public CountryRest findByFilter(CountryFilter countryFilter) {
        CountryRest countryRest = new CountryRest();

        if (countryFilter.getCountryName() != null && !countryFilter.getCountryName().equals("")) {
            countryRest = countryRepository.findCountryByName(countryFilter.getCountryName());
        } else if (countryFilter.getCountryFullName() !=  null && !countryFilter.getCountryFullName().equals("")) {
            countryRest = countryRepository.findCountryByFullName(countryFilter.getCountryFullName());
        } else if (countryFilter.getCountryAlphaCode() != null && !countryFilter.getCountryAlphaCode().equals("")) {
            countryRest = countryRepository.findCountryByAlphaCode(countryFilter.getCountryAlphaCode());
        }

        return countryRest;
    }
}
