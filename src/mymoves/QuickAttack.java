package mymoves;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(double pow, double acc, int priority, int hits){
        super(Type.NORMAL, pow, acc, priority, hits);


        }


    @Override
    protected String describe() {
        return "applies " + getClass().getSimpleName();

    }
}



