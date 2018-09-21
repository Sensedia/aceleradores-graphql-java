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

    public static Country toCountry(CountryRest countryRest) {

        Country country = new Country();

        country.setName(countryRest.getName());
        country.setTopLevelDomain(countryRest.getTopLevelDomain());
        country.setAlpha2Code(countryRest.getAlpha2Code());
        country.setAlpha3Code(countryRest.getAlpha3Code());
        country.setCallingCodes(countryRest.getCallingCodes());
        country.setCapital(countryRest.getCapital());
        country.setAltSpellings(countryRest.getAltSpellings());
        country.setRegion(countryRest.getRegion());
        country.setSubregion(countryRest.getSubregion());
        country.setPopulation(countryRest.getPopulation());
        country.setLat(countryRest.getLat());
        country.setLng(countryRest.getLng());
        country.setDemonym(countryRest.getDemonym());
        country.setArea(countryRest.getArea());
        country.setGini(countryRest.getGini());
        country.setTimezones(countryRest.getTimezones());
        country.setBorders(countryRest.getBorders());
        country.setNativeName(countryRest.getNativeName());
        country.setNumericCode(countryRest.getNumericCode());
        country.setCioc(countryRest.getCioc());
        country.setFlag(countryRest.getFlag());
        country.setCurrencies(CurrencyConverter.toCurrencyList(countryRest.getCurrencies()));
        country.setLanguages(LanguageConverter.toLanguageList(countryRest.getLanguages()));

        return country;
    }
}
