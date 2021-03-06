package br.com.sensedia.aceleradores.repository;

import br.com.sensedia.aceleradores.infraestructure.country.client.CountryRestClient;
import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryRepository {

    @Autowired
    CountryRestClient countryRestClient;

    public CountryRest findCountryByName(String countryName) {
        CountryRest countryRest = countryRestClient.getCountryByName(countryName);
        return countryRest;
    }

    public CountryRest findCountryByFullName(String fullName) {
        CountryRest countryRest = countryRestClient.getCountryByFullName(fullName);
        return countryRest;
    }

    public CountryRest findCountryByAlphaCode(String alphaCode) {
        CountryRest countryRest = countryRestClient.getCountryByAlphaCode(alphaCode);
        return countryRest;
    }

}
