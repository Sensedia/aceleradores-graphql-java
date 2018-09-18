package br.com.sensedia.aceleradores.interfaces.json.converter;

import br.com.sensedia.aceleradores.infraestructure.country.model.CountryRest;
import br.com.sensedia.aceleradores.inputs.CountryInput;
import br.com.sensedia.aceleradores.models.Country;
import br.com.sensedia.aceleradores.specification.filter.CountryFilter;

public class CountryConverter {

    public static CountryFilter toCountryFilter(CountryInput countryInput) {
        CountryFilter countryFilter = new CountryFilter();

        countryFilter.setCountryName(countryInput.getName());
        countryFilter.setCountryFullName(countryInput.getFullName());
        countryFilter.setCountryAlphaCode(countryInput.getAlphaCode());

        return countryFilter;
    }

    public static Country toCountry(CountryRest country) {

        Country ret = new Country();

        ret.setName(country.getName());

        return ret;
    }
}
