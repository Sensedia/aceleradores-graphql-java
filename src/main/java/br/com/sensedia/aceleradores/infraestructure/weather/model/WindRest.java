package br.com.sensedia.aceleradores.infraestructure.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WindRest {

    private Integer speed;
    private Integer deg;

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }
}
