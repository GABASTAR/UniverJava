package task4;

public class seasons {
    public static class Seasons {
        enum Season {
            WINTER(-20),
            SPRING(10),
            SUMMER(25),
            AUTUMN(3);

            private final double temperature;
            
            Season(double temperature) {
                this.temperature = temperature;
            }

            public double getTemp() {
                return this.temperature;
            }

            public String getDescription() {
                if (this.equals(SUMMER)) {
                    return "Теплое время года";
                } else {
                    return "Холодное время года";
                }
            }
        }

        public static String LovedSeason(Season season) {
            switch (season) {
                case WINTER -> {
                    return "Я люблю зиму";
                }
                case SPRING -> {
                    return "Я люблю весну";
                }
                case SUMMER -> {
                    return "Я люблю лето";
                }
                case AUTUMN -> {
                    return "Я люблю осень";
                }
                default -> {
                    return null;
                }
            }
        }

        public void allSeasons() {
            Season myFavSeason = Season.WINTER;
            System.out.println(myFavSeason);
            System.out.println(LovedSeason(myFavSeason));
            System.out.println(myFavSeason.getDescription());
            for (Season season : Season.values()) {
                System.out.println(season + " " + season.getTemp() + " " + season.getDescription());
            }
        }
    }

    public static void main(String[] args) {
        Seasons seasons = new Seasons();
        seasons.allSeasons();
    }
}
