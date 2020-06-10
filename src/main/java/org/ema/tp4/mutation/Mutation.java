package org.ema.tp4.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.ema.tp4.model.Heure;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver {
    public Heure writePost(Integer heure, Integer minute) {
        // maj heure serveur

        // Création des informations retournées.
        Heure h = new Heure();
        h.setHeure(heure);
        h.setMinute(minute);
        return h;
    }
}