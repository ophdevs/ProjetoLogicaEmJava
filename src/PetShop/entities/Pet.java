package PetShop.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pet {
    private String name;
    private String especie;
    private Dono dono;
    private List<ServicoPet> servicos = new ArrayList<>();

    public Pet(String name, String especie, Dono dono) {
        this.name = name;
        this.especie = especie;
        this.dono = dono;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addServicos(ServicoPet servico) {
        servicos.add(servico);
    }

    public Double totalGasto(int mes, int ano) {
        double soma = 0;

        for (ServicoPet s : servicos) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(s.getData());
            int mesServico = cal.get(Calendar.MONTH) + 1;
            int anoServico = cal.get(Calendar.YEAR);
            if (mesServico == mes && anoServico == ano) {
                soma += s.valorTotal();
            }
        }
        return soma;
    }

}
