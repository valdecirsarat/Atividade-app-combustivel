package com.example.applcationcombistivel;

public class Combustivel {

    private Double precoEtanol;
    private Double precoGasolina;
    private Double consumoEtanol;
    private Double consumoGasolina;

    private String msg;

    public Combustivel() {
    }

    public Combustivel(Double precoEtanol, Double precoGasolina, Double consumoEtanol, Double consumoGasolina) {
        this.precoEtanol = precoEtanol;
        this.precoGasolina = precoGasolina;
        this.consumoEtanol = consumoEtanol;
        this.consumoGasolina = consumoGasolina;
    }

    public Double getPrecoEtanol() {
        return precoEtanol;
    }

    public void setPrecoEtanol(Double precoEtanol) {
        this.precoEtanol = precoEtanol;
    }

    public Double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(Double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public Double getConsumoEtanol() {
        return consumoEtanol;
    }

    public void setConsumoEtanol(Double consumoEtanol) {
        this.consumoEtanol = consumoEtanol;
    }

    public Double getConsumoGasolina() {
        return consumoGasolina;
    }

    public void setConsumoGasolina(Double consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    public String getMsg() {
        return msg;
    }

    public String calculoRedimento(){
        double desempenho = getConsumoEtanol()/getConsumoGasolina();
        double relPreco = getPrecoEtanol()/getPrecoGasolina();

        if(relPreco <  0.70 && desempenho > 0.70){
            return msg = "Melhor Abastecer com Etanol";
        }
        else {
            return msg = "Melhor Abastecer com Gasolina";
        }

    }
}
