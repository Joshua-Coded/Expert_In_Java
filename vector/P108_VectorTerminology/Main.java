

import jdk.incubator.*;
import jdk.incubator.vector.DoubleVector;
import jdk.incubator.vector.VectorShape;
import jdk.internal.vm.vector.VectorSupport.VectorSpecies;

public class Main {
    public static void main(String[] args) {

        // creating vectorSpecies
        VectorSpecies<Double> VS1 = VectorSpecies.of(double.class, VectorShape.S_512_BIT);
        VectorSpecies<Double> VS2 = VectorSpecies.of(double.class, VectorShape.S_Max_BIT);
        VectorSpecies<Double> VS3 = VectorSpecies.ofLargestShape(double.class)
        VectorSpecies<Double> VS4 = VectorSpecies.ofPreferredShape(double.class);
        VectorSpecies<Double> VS5 = DoubleVector.SPECIES_512;
        VectorSpecies<Double> VS6 = DoubleVector.SPECIES_MAX;
        VectorSpecies<Double> VS7 = DoubleVector.SPECIES_PREFERRED;
    }
}