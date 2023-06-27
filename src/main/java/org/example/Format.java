package org.example;

public class Format {
    public static final String POCHE = "Poche";
    public static final String BROCHE = "Broché";
    public static final String GRAND_FORMAT = "Grand format";

    private String format;

    public Format(String format) {
        setFormat(format);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (!isValidFormat(format)) {
            throw new IllegalArgumentException("Format non autorisé");
        }
        this.format = format;
    }

    private boolean isValidFormat(String format) {
        return format.equals(POCHE) || format.equals(BROCHE) || format.equals(GRAND_FORMAT);
    }
}
