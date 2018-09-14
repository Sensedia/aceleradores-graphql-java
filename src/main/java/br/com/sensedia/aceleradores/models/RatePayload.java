package br.com.sensedia.aceleradores.models;

import java.util.Date;
import java.util.List;

public class RatePayload {
  
  private Integer timestamp;

  private String base;

  private Date date;

  private List<Rate> rates;

  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public List<Rate> getRates() {
    return rates;
  }

  public void setRates(List<Rate> rates) {
    this.rates = rates;
  }
  
}
