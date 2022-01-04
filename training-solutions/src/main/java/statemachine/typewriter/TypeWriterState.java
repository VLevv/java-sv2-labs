package statemachine.typewriter;

public enum TypeWriterState {
    ON{
        @Override
        TypeWriterState state() {
            return OFF;
        }
    },OFF{
        @Override
        TypeWriterState state() {
            return ON;
        }
    };

    abstract TypeWriterState state();
}
