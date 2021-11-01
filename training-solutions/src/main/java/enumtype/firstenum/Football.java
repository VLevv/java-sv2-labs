package enumtype.firstenum;

public enum Football {
    HÁTVÉD("hátvéd"),CSATÁR("csatár"),SZÉLSŐ("szélső"),KAPUS("kapus"),KÖZÉPPÁJÁS("közép");

    private final String value;

    Football(String value) {
        this.value = value;
    }
}
