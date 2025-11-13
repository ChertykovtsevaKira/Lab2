package mymoves;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite(double pow, double acc) {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() <= 0.3){
            Effect.flinch(pokemon);
        };
    }
}
