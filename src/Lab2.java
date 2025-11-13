import ru.ifmo.se.pokemon.Battle;
import mypokemons.Snorunt;
import mypokemons.Illumise;
import mypokemons.Glalie;
import mypokemons.Gloom;
import mypokemons.Oddish;
import mypokemons.Vileplume;

public class Lab2 {

    public static void main(String[] args){


        Battle b = new Battle();
        Snorunt snorunt = new Snorunt("horse", 1);
        Illumise illumise = new Illumise("monkey", 1);
        Glalie glalie = new Glalie("lama",1 );
        Gloom gloom = new Gloom("tiger",1);
        Oddish oddish = new Oddish("aardvark",1);
        Vileplume vileplume = new Vileplume("parrot",1 );
        b.addAlly(snorunt);
        b.addAlly(glalie);
        b.addAlly(oddish);

        b.addFoe(illumise);
        b.addFoe(gloom);
        b.addFoe(vileplume);

        b.go();
    }
}
