package br.com.sensedia.aceleradores.resolver;

import br.com.sensedia.aceleradores.models.Country;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public List<Country> countries(){
        return null;
    }

}
