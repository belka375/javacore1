package hw20.Plants;

import hw20.Life;

public interface Plants extends Life {

    @Override
    void metabolism();

    @Override
    void reproduction();

    void photosynthesis();
}
