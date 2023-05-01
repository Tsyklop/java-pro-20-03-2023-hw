package ua.ithilell.hw7;

public class ArraySizeException extends RuntimeException {

    public ArraySizeException(int arrayIndex, int wrongSize) {
        super("Array [" + arrayIndex + "] have incorrect size - " + wrongSize);
    }
}
