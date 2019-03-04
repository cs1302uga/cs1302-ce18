package cs1302.ce18;

import java.util.function.IntFunction;

/**
 * This class contains methods related to {@code cs1302-ce18}.
 */
public class MoreLambdaFun {

    /**
     * Prints the elements of the array that pass the test specified by the given predicate.
     * More formally, this method prints all elements {@code e} in the array referred to by
     * {@code t} such that {@code p.test(e)}. Each element will be printed on its own line.
     *
     * @param <T> the type of the array elements
     * @param t the specified array
     * @param p the specified predicate
     * @throws NullPointerException if the specified predicate is {@code null}
     */
    private static <T> void printlnMatches(T[] t, Predicate<T> p) {
        throw new UnsupportedOperationException("not yet implemented");
    } // printlnMatches    
    
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

