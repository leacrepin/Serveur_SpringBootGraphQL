package org.ema.tp4.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.ema.tp4.model.Heure;
import org.springframework.stereotype.Service;

@Service
public class QueryHeure implements GraphQLQueryResolver {
    public Heure heureCourante(int id) {
        Heure heure = new Heure();
        heure.setHeure(12);
        heure.setMinute(39+id);
        return heure;
    }
}
