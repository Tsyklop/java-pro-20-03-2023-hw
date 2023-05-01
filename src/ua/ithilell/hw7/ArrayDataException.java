package ua.ithilell.hw7;

public class ArrayDataException extends RuntimeException {

    public ArrayDataException(int arrayIndex, int elementInArrayIndex) {
        super("Error in [" + arrayIndex + "][" + elementInArrayIndex + "] element");
    }

}
