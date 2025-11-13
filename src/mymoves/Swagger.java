package mymoves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        pokemon.addEffect(e);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.confuse(pokemon);
    }

}
