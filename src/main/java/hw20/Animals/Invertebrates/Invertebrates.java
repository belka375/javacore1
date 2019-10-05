package hw20.Animals.Invertebrates;

import hw20.Animals.Animals;

public interface Invertebrates extends Animals {

    @Override
    void metabolism();

    @Override
    void reproduction();

    @Override
    void consumerFoodChainInfo();

    void noInvertebrata();
}
