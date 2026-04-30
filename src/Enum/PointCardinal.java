package Enum;

public enum PointCardinal {
    NORD("N"),
    EST("E"),
    SUD("S"),
    OUEST("O")

    ;
    private final String libelleCourt;

    PointCardinal(String libelleCourt) {

        this.libelleCourt = libelleCourt ;
    }

    public String getLibelleCourt() {
        return libelleCourt;
    }
}
