package br.com.sensedia.aceleradores.models;

public class WheaterMain {
  
  private Float temp;

  private Float humidity;

  private Float pressure;

  private Float temp_min;

  private Float temp_max;

  public Float getTemp() {
    return temp;
  }

  public void setTemp(Float temp) {
    this.temp = temp;
  }

  public Float getHumidity() {
    return humidity;
  }

  public void setHumidity(Float humidity) {
    this.humidity = humidity;
  }

  public Float getPressure() {
    return pressure;
  }

  public void setPressure(Float pressure) {
    this.pressure = pressure;
  }

  public Float getTemp_min() {
    return temp_min;
  }

  public void setTemp_min(Float temp_min) {
    this.temp_min = temp_min;
  }

  public Float getTemp_max() {
    return temp_max;
  }

  public void setTemp_max(Float temp_max) {
    this.temp_max = temp_max;
  }
  
}
