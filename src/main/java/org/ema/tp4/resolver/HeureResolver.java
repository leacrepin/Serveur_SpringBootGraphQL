package org.ema.tp4.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ema.tp4.model.Heure;
import org.ema.tp4.model.Serveur;
import org.springframework.stereotype.Service;

@Service
public class HeureResolver implements GraphQLResolver<Heure> {
    public int heure(Heure heure) {
        return 10;
    }
    public Serveur serveur(Heure heure) {
        Serveur serveur = new Serveur();
        serveur.setNom("un nom");
        return serveur;
    }
}