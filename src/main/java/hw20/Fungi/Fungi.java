package hw20.Fungi;

import hw20.Life;

public interface Fungi extends Life {
    @Override
    void metabolism();

    @Override
    void reproduction();

    void osmotrophy();
}
