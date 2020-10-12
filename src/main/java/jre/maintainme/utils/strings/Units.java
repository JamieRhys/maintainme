package jre.maintainme.utils.strings;

public class Units {
    public static class Processor {
        public static class Frequency {
            public static enum Unit {
                HZ("Hz"),
                MHZ("MHz"),
                GHZ("GHz");
  
                private final String displayValue;

                private Unit(String value) { this.displayValue = value; }

                public String getDisplayValue() { return this.displayValue; }
            }
        }
    }

    public static class Storage {
        public static class Size {
            public static enum Unit {
                B("B", "Bytes"),
                KB("Kb", "Kilobytes"),
                MB("Mb", "Megabytes"),
                GB("Gb", "Gigabytes"),
                TB("Tb", "Terabytes"),
                PB("Pb", "Petabytes"),
                EB("Eb", "Exobytes"),
                ZB("Zb", "Zetabytes");

                private final String displayAbbrValue;
                private final String displayValue;

                private Unit(String abbrName, String name) { 
                    this.displayAbbrValue = abbrName;
                    this.displayValue = name; 
                }

                public String getDisplayAbbrValue() { return this.displayAbbrValue; }

                public String getDisplayValue() { return this.displayValue; }
            }
        }
    }
}
