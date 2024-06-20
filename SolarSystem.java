public class SolarSystem {
    public enum SolarSystemPlanets {
        // оголошено набір плбанет із властивностями: відстань до попередньої планети, радіус планети, попередня планета
        MERCURY(0, 2440, null),
        VENUS(50, 6052, MERCURY),
        EARTH(41, 6371, VENUS),
        MARS(78, 3389, EARTH),
        JUPITER(550, 69911, MARS),
        SATURN(650, 58232, JUPITER),
        URANUS(1430, 25362, SATURN),
        NEPTUNE(1620, 24622, URANUS);

        private final int ordinalNumber;
        private final int prevDistance;
        private final int distanceFromSun;
        private final int radius;
        private final SolarSystemPlanets previous;
        private SolarSystemPlanets next;


        // статичний блок, проходяться всі значення enum та встановлюється поле next для кожної планети
        // на основі поля previous.
        static {
            for (SolarSystemPlanets planet : SolarSystemPlanets.values()) {
                if (planet.previous != null) {
                    planet.previous.next = planet;
                }
            }
        }


        // Конструктор приймає три параметри та обчислює значення відстані від Сонця
        // на основі даних попередньої планети. Якщо попередньої планети немає (previous == null),
        // відстань від Сонця дорівнює 0.
        SolarSystemPlanets(int prevDistance, int radius, SolarSystemPlanets previous) {
            this.ordinalNumber = this.ordinal() + 1; // Порядковий номер від Сонця
            this.prevDistance = prevDistance;
            // відстань від Сонця, обчислюється як сума відстані попередньої планети від Сонця і prevDistance.
            this.distanceFromSun = (previous == null) ? 0 : previous.distanceFromSun + prevDistance;
            this.radius = radius;
            this.previous = previous;
        }

        public int getOrdinalNumber() {
            return ordinalNumber;
        }

        public int getPrevDistance() {
            return prevDistance;
        }

        public int getDistanceFromSun() {
            return distanceFromSun;
        }

        public int getRadius() {
            return radius;
        }

        public SolarSystemPlanets getPrevious() {
            return previous;
        }

        public SolarSystemPlanets getNext() {
            return next;
        }

        @Override
        public String toString() {
            return String.format("%s: ordinalNumber=%d, prevDistance=%d, distanceFromSun=%d, radius=%d, previous=%s, next=%s",
                    this.name(), ordinalNumber, prevDistance, distanceFromSun, radius,
                    (previous != null ? previous.name() : "null"),
                    (next != null ? next.name() : "null"));
        }

        // Виводить інформацію про всі планети в консоль.
        public static void main(String[] args) {
            for (SolarSystemPlanets planet : SolarSystemPlanets.values()) {
                System.out.println(planet);
            }
        }
    }
}
