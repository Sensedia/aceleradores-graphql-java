package br.com.sensedia.aceleradores.infraestructure.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherRest {

    private Integer id;
    private String name;
    private Integer cod;
    private CoordRest coord;
    private String base;
    private Integer visibility;
    private MainRest main;
    private WindRest wind;
    private CloudsRest clouds;
    private SysRest sys;
    private Integer dt;

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

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public CoordRest getCoord() {
        return coord;
    }

    public void setCoord(CoordRest coord) {
        this.coord = coord;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public MainRest getMain() {
        return main;
    }

    public void setMain(MainRest main) {
        this.main = main;
    }

    public WindRest getWind() {
        return wind;
    }

    public void setWind(WindRest wind) {
        this.wind = wind;
    }

    public CloudsRest getClouds() {
        return clouds;
    }

    public void setClouds(CloudsRest clouds) {
        this.clouds = clouds;
    }

    public SysRest getSys() {
        return sys;
    }

    public void setSys(SysRest sys) {
        this.sys = sys;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }
}
