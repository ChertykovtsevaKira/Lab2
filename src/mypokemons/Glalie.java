package mypokemons;

import mymoves.Swagger;
import mymoves.Bite;
import mymoves.Icywind;
import mymoves.Bulldoze;
import ru.ifmo.se.pokemon.Type;

public class Glalie extends Snorunt {
    public Glalie(String name, int level){
        super(name,level);
        super.setType(Type.ICE);
        super.setStats(80,80,80,80,80,80);

        Swagger swagger = new Swagger(0,85);
        Icywind icywind = new Icywind(55, 95);
        Bite bite = new Bite(60,100);
        Bulldoze bulldoze = new Bulldoze(60,100);

        setMove(swagger, icywind, bite, bulldoze);
    }
}
