
package mypokemons;

import mymoves.Absorb;
import mymoves.DoubleTeam;
import mymoves.SludgeBomb;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Oddish {
    public Gloom(String name, int level){
        super(name,level);
        super.setType(Type.GRASS,Type.POISON);
        super.setStats(60,65,70,85,75,40);

        DoubleTeam doubleteam = new DoubleTeam(0,0);
        SludgeBomb sludgeBomb = new SludgeBomb(90,100);
        Absorb absorb = new Absorb(20,100);

        super.setMove(doubleteam, sludgeBomb, absorb);
    }
}
