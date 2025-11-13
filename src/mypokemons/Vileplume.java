package mypokemons;

import mymoves.Absorb;
import mymoves.DoubleTeam;
import mymoves.SludgeBomb;
import mymoves.StunSpore;
import ru.ifmo.se.pokemon.Type;

public class Vileplume extends Gloom {
    public Vileplume(String name, int level){
        super(name,level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(75,80,85,110,90,50);

        DoubleTeam doubleteam = new DoubleTeam(0,0);
        SludgeBomb sludgeBomb = new SludgeBomb(90,100);
        Absorb absorb = new Absorb(20,100);
        StunSpore stunspore = new StunSpore(0,75);

        super.setMove(doubleteam, sludgeBomb, absorb, stunspore);
    }
}
