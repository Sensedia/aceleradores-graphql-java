package br.com.sensedia.aceleradores.models;

import java.util.List;

public class Country {

    private String name;
    
    private List<String> topLevelDomain;

    private String alpha2Code;

    private String alpha3Code;

    private List<String> callingCodes;

    private String capital;

    private List<String> altSpellings;

    private String region;

    private String subregion;

    private Integer population;

    private Float lat;

    private Float lng;

    private String demonym;

    private Float area;

    private Float gini;

    private List<String> timezones;

    private String borders;

    private String nativeName;

    private Integer numericCode;

    private String cioc;

    private String flag;

    private List<Currency> currencies;

    private List<Language> languages;

    private List<Translate> translations;

    private List<Wheater> weather;

    private RatePayload rate;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<String> getTopLevelDomain() {
      return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
      this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
      return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
      this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
      return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
      this.alpha3Code = alpha3Code;
    }

    public List<String> getCallingCodes() {
      return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
      this.callingCodes = callingCodes;
    }

    public String getCapital() {
      return capital;
    }

    public void setCapital(String capital) {
      this.capital = capital;
    }

    public List<String> getAltSpellings() {
      return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
      this.altSpellings = altSpellings;
    }

    public String getRegion() {
      return region;
    }

    public void setRegion(String region) {
      this.region = region;
    }

    public String getSubregion() {
      return subregion;
    }

    public void setSubregion(String subregion) {
      this.subregion = subregion;
    }

    public Integer getPopulation() {
      return population;
    }

    public void setPopulation(Integer population) {
      this.population = population;
    }

    public Float getLat() {
      return lat;
    }

    public void setLat(Float lat) {
      this.lat = lat;
    }

    public Float getLng() {
      return lng;
    }

    public void setLng(Float lng) {
      this.lng = lng;
    }

    public String getDemonym() {
      return demonym;
    }

    public void setDemonym(String demonym) {
      this.demonym = demonym;
    }

    public Float getArea() {
      return area;
    }

    public void setArea(Float area) {
      this.area = area;
    }

    public Float getGini() {
      return gini;
    }

    public void setGini(Float gini) {
      this.gini = gini;
    }

    public List<String> getTimezones() {
      return timezones;
    }

    public void setTimezones(List<String> timezones) {
      this.timezones = timezones;
    }

    public String getBorders() {
      return borders;
    }

    public void setBorders(String borders) {
      this.borders = borders;
    }

    public String getNativeName() {
      return nativeName;
    }

    public void setNativeName(String nativeName) {
      this.nativeName = nativeName;
    }

    public Integer getNumericCode() {
      return numericCode;
    }

    public void setNumericCode(Integer numericCode) {
      this.numericCode = numericCode;
    }

    public String getCioc() {
      return cioc;
    }

    public void setCioc(String cioc) {
      this.cioc = cioc;
    }

    public String getFlag() {
      return flag;
    }

    public void setFlag(String flag) {
      this.flag = flag;
    }

    public List<Currency> getCurrencies() {
      return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
      this.currencies = currencies;
    }

    public List<Language> getLanguages() {
      return languages;
    }

    public void setLanguages(List<Language> languages) {
      this.languages = languages;
    }

    public List<Translate> getTranslations() {
      return translations;
    }

    public void setTranslations(List<Translate> translations) {
      this.translations = translations;
    }

    public List<Wheater> getWeather() {
      return weather;
    }

    public void setWeather(List<Wheater> weather) {
      this.weather = weather;
    }

    public RatePayload getRate() {
      return rate;
    }

    public void setRate(RatePayload rate) {
      this.rate = rate;
    }
}