package br.com.sensedia.aceleradores.infraestructure.country.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryResp {

    private List<CountryRest> countryRest;

    public List<CountryRest> getCountryRest() {
        return countryRest;
    }

    public void setCountryRest(List<CountryRest> countryRest) {
        this.countryRest = countryRest;
    }
}
