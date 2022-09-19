package util;

import java.util.Objects;

public class Assert {

    public static void checkEmpty(String field) {
        if (field.length() == 0 || Objects.equals(field, null)) {
            throw new IllegalArgumentException();
        }
    }
}
