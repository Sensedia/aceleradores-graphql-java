package br.com.sensedia.aceleradores.models;

import java.util.List;

public class Wheater {
  
  private Integer id;

  private String name;

  private Integer dt;

  private Integer cod;

  private Coordinate coord;

  private WheaterSys sys;

  private List<Wheaters> weathers;

  private WheaterMain main;

  private Wind wind;

  private Rain rain;

  private Clouds clouds;

  private Country country;

  private RatePayload rate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getDt() {
    return dt;
  }

  public void setDt(Integer dt) {
    this.dt = dt;
  }

  public Integer getCod() {
    return cod;
  }

  public void setCod(Integer cod) {
    this.cod = cod;
  }

  public Coordinate getCoord() {
    return coord;
  }

  public void setCoord(Coordinate coord) {
    this.coord = coord;
  }

  public WheaterSys getSys() {
    return sys;
  }

  public void setSys(WheaterSys sys) {
    this.sys = sys;
  }

  public List<Wheaters> getWeathers() {
    return weathers;
  }

  public void setWeathers(List<Wheaters> weathers) {
    this.weathers = weathers;
  }

  public WheaterMain getMain() {
    return main;
  }

  public void setMain(WheaterMain main) {
    this.main = main;
  }

  public Wind getWind() {
    return wind;
  }

  public void setWind(Wind wind) {
    this.wind = wind;
  }

  public Rain getRain() {
    return rain;
  }

  public void setRain(Rain rain) {
    this.rain = rain;
  }

  public Clouds getClouds() {
    return clouds;
  }

  public void setClouds(Clouds clouds) {
    this.clouds = clouds;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public RatePayload getRate() {
    return rate;
  }

  public void setRate(RatePayload rate) {
    this.rate = rate;
  }
  
}
