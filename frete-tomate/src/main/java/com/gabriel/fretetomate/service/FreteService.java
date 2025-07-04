package com.gabriel.fretetomate.service;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double calcularPrecoFrete(int quantidade, int distancia) {
        double precoFrete = 0.0;

        if (quantidade <= 250) {
            precoFrete += 100.0;
            if (distancia <= 100) {
                precoFrete += distancia * 5.0;
            } else {
                precoFrete += 100 * 5.0 + (distancia - 100) * 4.0;
            }
        } else {
            precoFrete += 200.0 + distancia * 7.0;
        }

        return precoFrete;
    }

    public String definirVeiculo(int quantidade) {
        return quantidade <= 250 ? "caminhão" : "carreta";
    }
}
