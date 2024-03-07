import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueL

import jdk.incubator.vector.VectorSpecies;

import jdk.incubator.vector.VectorSpecies;

import java.nio.ByteOrder;
import java.util.Arrays;


        dk.incubator.vector.FloatVector;
import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.Vector;
import jdk.incubato ator.vector.VectorOperators;
import jdk.incubator.vector.VectorShape;
import jdk.incubator.vector.VectorShuffle;
import jdk.incubator.vector.VectorSpecies;

public class Main {
    public static void main(String[] args) {
 ing vectorSpecies
        VectorSpecies<Double> VS1 = VectorSpecies.of(double.class, VectorShape.S_512_BIT);
        VectorSpecies<Double> VS2 = VectorSpecies.of(double.class, VectorShape.S_Max_BIT);
        VectorSpecies<Double> VS3 = VectorSpecies.ofLargestShape(double.class);
        VectorSpecies<Double> VS4 = VectorSpecies.ofPreferred(double.class);
        VectorSpecies<Double> VS5 = DoubleVector.SPECIES_512;
        VectorSpecies<Double> VS6 = DoubleVector.SPECIES_MAX;
        VectorSpecies<Double> VS7 = DoubleVector.SPECIES_PREFERRED;

        //  printlning the element type and shape of VS
        System.out.println("Element type (VS1)" + VS1.elementType());
        System.out.println("Element shape (VS1)" + VS1.vectorShape());
        System.out.println("Element type (v2)" + VS2.elementType());
        System.out.println("Element shape " + VS2.vectorShape());
        System.out.println("Element type (VS3)" + VS3.elementType());
        System.out.println("Element shape " + VS3.vectorShape());
        System.out.println("Element type (VS4)" + VS4.elementType());
        System.out.p ut.println("Element type (VS5)" + VS5.elementType());
        System.out.println("Element shape" + VS5.vectorShape());
        System.out.println("Element type (VS6)" + VS6.elementType());
        System.out.println("Element shape " + VS6.vectorShape());
        System.out.println("Element type (VS7)" + VS7.elementType());
        System.out.println("Element shape " + VS7.vectorShape());
        System.out.println();

        // getting lenght ( number of lanes and scalars)
        VectorSpecies<Float> VSF =  FloatVector.SPECIES_256;
        System.out.println("Lenght: " + VSF.length());
        System.out.println("Lenght: " + VSF.vectorBitSize()/VSF.elementSize());
        System.out.println()

        // create vectors

        VectorSpecies<Integer> VS256 = IntegerVector.SPECIES_256;

        // creating vectors of zeros
        VectorSpecies<Integer> v1 = VS256.zero();
        System.out.println("v1: " + Arrays.toString(v1.toIntArray()));

        Intvector v2 = IntVector.zero(VS256);
        System.out.println("v2: " + Arrays.toString(v2.toIntArray()));
        

          

        

        

        
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    