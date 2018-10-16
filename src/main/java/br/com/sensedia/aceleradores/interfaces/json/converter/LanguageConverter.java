package br.com.sensedia.aceleradores.interfaces.json.converter;

import br.com.sensedia.aceleradores.infraestructure.country.model.LanguageRest;
import br.com.sensedia.aceleradores.models.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageConverter {

    public static List<Language> toLanguageList(List<LanguageRest> languageRest){

        List<Language> list = new ArrayList<Language>();

        if (languageRest != null) {
            for (LanguageRest languageRestItem : languageRest){

                Language language = new Language();
                language.setIso639_1(languageRestItem.getIso639_1());
                language.setIso639_2(languageRestItem.getIso639_2());
                language.setName(languageRestItem.getName());
                language.setNativeName(languageRestItem.getNativeName());

                list.add(language);
            }
        }

        return list;
    }
}
