package br.com.sensedia.aceleradores.interfaces.json.converter;

import br.com.sensedia.aceleradores.infraestructure.country.model.CurrencyRest;
import br.com.sensedia.aceleradores.models.Currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter {

    public static List<Currency> toCurrencyList(List<CurrencyRest> currencyRest){

        List<Currency> list = new ArrayList<Currency>();

        if (currencyRest != null) {
            for (CurrencyRest currencyRestItem : currencyRest){

                Currency currency = new Currency();
                currency.setCode(currencyRestItem.getCode());
                currency.setName(currencyRestItem.getName());
                currency.setSymbol(currencyRestItem.getSymbol());

                list.add(currency);
            }
        }

        return list;
    }
}
