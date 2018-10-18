package br.com.sensedia.aceleradores.specification.filter;

public class WeatherFilter {

    private String cityName;
    private String countryAlphaCode;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryAlphaCode() {
        return countryAlphaCode;
    }

    public void setCountryAlphaCode(String countryAlphaCode) {
        this.countryAlphaCode = countryAlphaCode;
    }
}
