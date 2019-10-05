package hw20.Animals;

import hw20.Life;

public interface Animals extends Life {

    @Override
    void metabolism();

    @Override
    void reproduction();

    void consumerFoodChainInfo();
}
