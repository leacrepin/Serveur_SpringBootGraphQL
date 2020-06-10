package org.ema.tp4.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ema.tp4.model.Ip;
import org.ema.tp4.model.Serveur;
import org.springframework.stereotype.Service;

@Service
public class ServeurResolver implements GraphQLResolver<Serveur> {
    public int server(Serveur serveur) {
        return 10;
    }

    public Ip ip(Serveur serveur) {
        Ip ip = new Ip();
        ip.setNumero("1.2.3.4");
        return ip;
    }
}
