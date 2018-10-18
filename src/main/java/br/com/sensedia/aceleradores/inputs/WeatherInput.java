package br.com.sensedia.aceleradores.inputs;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherInput {
  
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
