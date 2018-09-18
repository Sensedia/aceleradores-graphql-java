package br.com.sensedia.aceleradores.inputs;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryInput {
  
  private String name;
  private String fullName;
  private String alphaCode;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getAlphaCode() {
    return alphaCode;
  }

  public void setAlphaCode(String alphaCode) {
    this.alphaCode = alphaCode;
  }

}
