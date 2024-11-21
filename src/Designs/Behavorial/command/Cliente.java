package src.Designs.Behavorial.command;

import java.util.UUID;

public class Cliente {
    private int client_id;
    private String nome;

    public Cliente(){}

    void speak (){
        System.out.println("Agua");
    }

    void Nothing(){
        System.out.println("Doing Nothing");
    }
}
