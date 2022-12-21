package examples;

import java.util.Objects;

public class Examples {
        private final int a;
        private final int b;

        public Examples(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Examples examples = (Examples) o;
            return a == examples.a && b == examples.b || a == examples.b && b == examples.a;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(a) + Objects.hashCode(b);
        }

        @Override
        public String toString() {
            return a +" * "+ b + " = ?";
        }
    }
