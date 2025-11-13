package mypokemons;

import mymoves.BugBuzz;
import mymoves.QuickAttack;
import mymoves.Swagger;
import mymoves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Illumise extends Pokemon {
    public Illumise(String name, int level){
        super(name, level);

        super.setType(Type.BUG);
        super.setStats(65, 47, 75, 73, 85, 85);

        QuickAttack quickAttack = new QuickAttack (40,100, 1, 0);
        Swagger swagger = new Swagger(0,85);
        BugBuzz bugbuzz = new BugBuzz(90,100);
        Thunder thunder = new Thunder(110,70);


       
        super.setMove(quickAttack, swagger, bugbuzz, thunder);

    }
}
