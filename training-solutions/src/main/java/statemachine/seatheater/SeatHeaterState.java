package statemachine.seatheater;

public enum SeatHeaterState {
    OFF{
        @Override
        SeatHeaterState next() {
            return MAX;
        }
    },MAX{
        @Override
        SeatHeaterState next() {
            return MEDIUM;
        }
    },MEDIUM{
        @Override
        SeatHeaterState next() {
            return MIN;
        }
    },MIN{
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    };

    abstract SeatHeaterState next();
}
