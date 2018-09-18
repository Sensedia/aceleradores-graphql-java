package br.com.sensedia.aceleradores.specification.filter;

public class CountryFilter {

    private String countryName;
    private String countryFullName;
    private String countryAlphaCode;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryFullName() {
        return countryFullName;
    }

    public void setCountryFullName(String countryFullName) {
        this.countryFullName = countryFullName;
    }

    public String getCountryAlphaCode() {
        return countryAlphaCode;
    }

    public void setCountryAlphaCode(String countryAlphaCode) {
        this.countryAlphaCode = countryAlphaCode;
    }
}
