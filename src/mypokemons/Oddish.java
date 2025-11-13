package mypokemons;

import mymoves.DoubleTeam;
import mymoves.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish(String name, int level){
        super(name,level);
        super.setType(Type.GRASS,Type.POISON);
        super.setStats(45,50,55,75,65,30);

        DoubleTeam doubleteam = new DoubleTeam(0,0);
        SludgeBomb sludgeBomb = new SludgeBomb(90,100);

        super.setMove(doubleteam, sludgeBomb);
    }

}
