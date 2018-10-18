package br.com.sensedia.aceleradores.interfaces.json.converter;

import br.com.sensedia.aceleradores.infraestructure.weather.model.*;
import br.com.sensedia.aceleradores.models.*;
import org.springframework.util.ObjectUtils;

public class WeatherConverter {

    public static Weather toWheater(WeatherRest weatherRest) {

        Weather weather = new Weather();

        weather.setId(weatherRest.getId());
        weather.setName(weatherRest.getName());
        weather.setCod(weatherRest.getCod());
        weather.setCoord(toCoord(weatherRest.getCoord()));
        weather.setBase(weatherRest.getBase());
        weather.setVisibility(weatherRest.getVisibility());
        weather.setMain(toMain(weatherRest.getMain()));
        weather.setWind(toWind(weatherRest.getWind()));
        weather.setClouds(toClouds(weatherRest.getClouds()));
        weather.setSys(toSys(weatherRest.getSys()));
        weather.setDt(weatherRest.getDt());

        return weather;
    }

    private static Sys toSys(SysRest sysRest) {

        Sys sys = new Sys();

        if (!ObjectUtils.isEmpty(sysRest)){
            sys.setType(sysRest.getType());
            sys.setId(sysRest.getId());
            sys.setMessage(sysRest.getMessage());
            sys.setCountry(sysRest.getCountry());
            sys.setSunrise(sysRest.getSunrise());
            sys.setSunset(sysRest.getSunset());
        }

        return sys;
    }

    private static Clouds toClouds(CloudsRest cloudsRest) {

        Clouds clouds = new Clouds();

        if (!ObjectUtils.isEmpty(cloudsRest)) {
            clouds.setAll(cloudsRest.getAll());
        }

        return clouds;

    }

    private static Wind toWind(WindRest windRest) {

        Wind wind = new Wind();

        if (!ObjectUtils.isEmpty(windRest)) {
            wind.setSpeed(windRest.getSpeed());
            wind.setDeg(windRest.getDeg());
        }

        return wind;

    }

    private static Main toMain(MainRest mainRest) {

        Main main = new Main();

        if (!ObjectUtils.isEmpty(mainRest)) {
            main.setTemp(mainRest.getTemp());
            main.setPressure(mainRest.getPressure());
            main.setHumidity(mainRest.getHumidity());
            main.setTemp_min(mainRest.getTemp_min());
            main.setTemp_max(mainRest.getTemp_max());
        }

        return main;
    }

    private static Coord toCoord(CoordRest coordRest) {

        Coord weatherCoord = new Coord();

        if (!ObjectUtils.isEmpty(coordRest)) {
            weatherCoord.setLon(coordRest.getLon());
            weatherCoord.setLat(coordRest.getLat());
        }

        return weatherCoord;
    }
}
