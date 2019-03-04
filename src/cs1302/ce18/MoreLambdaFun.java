package cs1302.ce18;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * This class contains methods related to {@code cs1302-ce18}.
 */
public class MoreLambdaFun {

    /**
     * Main entry-point into the application.
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {


    } // main    
    
    /**
     * Prints the elements of the array that pass the test specified by the given predicate
     * using a string mapper. More formally, this method prints the string mapped elements 
     * {@code f.apply(e)} in the array referred to by {@code t} for each {@code e} such that 
     * {@code p.test(e)}. Each string mapped element will be printed on its own line.
     *
     * @param <T> the type of the array elements
     * @param t the specified array
     * @param p the specified predicate
     * @param p the specified string mapper
     * @throws NullPointerException if the specified predicate or string mapper is {@code null}
     */
    private static <T> void printlnMappedMatches(T[] t, Predicate<T> p, Function<T, String> f) {
        throw new UnsupportedOperationException("not yet implemented");
    } // printlnMappedMatches    
    
    /**
     * Returns a copy of the specified array, truncating or padding with nulls (if necessary) so 
     * that the copy has the specified length. For all indices that are valid in both the original 
     * array and the copy, the two arrays will contain identical values. For any indices that are 
     * valid in the copy but not the original, the copy will contain {@code null}. Such indices will
     * exist if, and only if, {@code l} is greater than {@code a.length}. The 
     * resulting array is created using {@code g}.
     *
     * @param <T> the type of the array elements.
     * @param a the array to be copied
     * @param l the length of the copy to be returned
     * @param g a function which produces a new array of the desired type and length
     * @return a copy of the original array with the specified length
     * @throws NegativeArraySizeException if {@code l} is negative
     * @throws NullPointerException if {@code a} or {@code g} is {@code null}
     */
    public static <T> T[] copyOf(T[] a, int l, IntFunction<T[]> g) {
	throw new UnsupportedOperationException("not yet implemented");
    } // copyOf

} // MoreLambdaFun

