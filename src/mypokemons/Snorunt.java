package mypokemons;

import mymoves.Swagger;
import mymoves.Bite;
import mymoves.Icywind;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {
    public Snorunt(String name, int level){
        super(name,level);

        super.setType(Type.ICE);
        super.setStats(50,50,50,50,50,50);

        Swagger swagger = new Swagger(0,85);
        Icywind icywind = new Icywind(55, 95);
        Bite bite = new Bite(60,100);
        setMove(swagger, icywind, bite);
    }
}
