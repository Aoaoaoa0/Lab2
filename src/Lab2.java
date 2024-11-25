import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Lab2 {
    public static void main(String[] args){
        Battle b = new Battle();

        Kecleon kecleon = new Kecleon("Чесночек", 1);
        Snover snover = new Snover("Гена", 1);
        Abomasnow abomasnow = new Abomasnow("Чипс", 1);
        Bounsweet bounsweet = new Bounsweet("Грибочек", 1);
        Steenee steenee = new Steenee("Абобус", 1);
        Tsareena tsareena = new Tsareena("Киллиан", 1);
        
        b.addAlly(kecleon);
        b.addAlly(snover);
        b.addAlly(abomasnow);
        b.addFoe(bounsweet);
        b.addFoe(steenee);
        b.addFoe(tsareena);

        b.go();
    }
}
