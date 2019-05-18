package day1;

import java.util.Objects;

public class PolskiZloty {
    // operujemy na groszach - 1zl = 100 gr
    private int value;

    public PolskiZloty(double value) {
        this.value = (int) (value * 100.0);
    }

    @Override
    public String toString() {
        return String.format("%.2f PLN", (double) value / 100.0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolskiZloty that = (PolskiZloty) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public PolskiZloty minus(PolskiZloty pz) {
        PolskiZloty result = new PolskiZloty(0);
        result.value = value - pz.value;
        return result;
    }
}
