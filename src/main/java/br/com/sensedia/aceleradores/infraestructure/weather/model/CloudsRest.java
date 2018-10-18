package br.com.sensedia.aceleradores.infraestructure.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CloudsRest {

    private Integer all;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }
}
