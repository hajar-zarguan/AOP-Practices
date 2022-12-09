package org.example;

import metier.Compte;
import metier.IMetierBanque;
import metier.IMetierBanqueImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new  Main().start();
    }
    public  void  start(){
        System.out.println("Demarrage de lapp");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le code du compte :");
        long code = scanner.nextLong();
        System.out.println("Donner le solde initiqle du compte:");
        double solde = scanner.nextLong();
        IMetierBanque metierBanque = new IMetierBanqueImpl();
        metierBanque.addCompte(new Compte(code, solde));
        while (true ){
            try {
                System.out.println("Type operation:");
                String type = scanner.next();
                System.out.println("Montant");
                double montant = scanner.nextDouble();

                if (type.equals("q")){
                  break;
                }
                else  if(type.equals("v")){
                    metierBanque.verser(code, montant);
                }
                else if (type.equals("r")){
                    metierBanque.retirer(code, montant);
                }
                Compte compte = metierBanque.consulter(code);
                System.out.println("Etat du compte = "+compte);

            }catch (Exception e){

            }
           }
    }
}