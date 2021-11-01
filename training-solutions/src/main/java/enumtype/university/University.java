package enumtype.university;

public enum University {
    BME("BUDAPESTI MŰSZAKI ÉS GAZDASÁGTUDOMÁNYI EGYETEM"),ELTE("EÖTVÖS LÓRÁND TUDOMÁNY EGYETEM");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
