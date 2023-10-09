package org.graalvm.word;

public class WordFactory {
    private WordFactory() {
    }

    public static <T extends PointerBase> T nullPointer() {
        throw new UnsupportedOperationException();
    }

    public static <T extends PointerBase> T pointer(long val) {
        throw new UnsupportedOperationException();
    }
}
