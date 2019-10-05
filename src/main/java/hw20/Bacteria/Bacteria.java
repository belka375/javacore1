package hw20.Bacteria;

import hw20.Life;

public interface Bacteria extends Life {

    @Override
    void reproduction();

    @Override
    void metabolism();

    boolean gramPositive ();
}
