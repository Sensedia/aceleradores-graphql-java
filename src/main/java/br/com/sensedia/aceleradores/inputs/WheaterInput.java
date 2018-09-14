package br.com.sensedia.aceleradores.inputs;

public class WheaterInput {
  
  private String cityName;

  private Integer cityId;

  private CoordinateInput coordinate;

  private String zip;

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Integer getCityId() {
    return cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  public CoordinateInput getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(CoordinateInput coordinate) {
    this.coordinate = coordinate;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

}
