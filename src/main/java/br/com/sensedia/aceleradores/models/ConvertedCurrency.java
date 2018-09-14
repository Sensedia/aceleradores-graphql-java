package br.com.sensedia.aceleradores.models;

import java.util.Date;

public class ConvertedCurrency {
  
  private Integer timestamp;

  private Float rate;

  private Date date;

  private Float result;

  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public Float getRate() {
    return rate;
  }

  public void setRate(Float rate) {
    this.rate = rate;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Float getResult() {
    return result;
  }

  public void setResult(Float result) {
    this.result = result;
  }

}
