package PetShop.entities;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private  String name;
    private String especie;
    private Dono dono;
    private List<ServicoPet> servicos = new ArrayList<>();

    public Pet(){

    }

    public Pet(String name, String especie, List<ServicoPet> servicos, Dono dono) {
        this.name = name;
        this.especie = especie;
        this.servicos = servicos;
        this.dono = dono;
    }


}
