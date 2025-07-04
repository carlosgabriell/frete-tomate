package com.gabriel.fretetomate.resolver;

import com.gabriel.fretetomate.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;
import java.util.Map;

@Controller
public class FreteResolver {

    @Autowired
    private FreteService freteService;

    @QueryMapping
    public Map<String, Object> frete(@Argument int quantidade, @Argument int distancia) {
        double precoFrete = freteService.calcularPrecoFrete(quantidade, distancia);
        String veiculo = freteService.definirVeiculo(quantidade);

        return Map.of(
            "precoFrete", precoFrete,
            "veiculo", veiculo
        );
    }
}
