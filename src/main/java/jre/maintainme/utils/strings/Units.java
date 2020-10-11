package jre.maintainme.utils.strings;

public class Units {
    public static class Processor {
        public static class Frequency {
            public static enum Unit {
                HZ,
                MHZ,
                GHZ
            }

            /**
             * Returns the unit type as a string
             * @param unit
             * @return
             */
            public static final String getFrequencyUnit(Unit unit) {
                switch(unit) {
                    case HZ:
                        return "Hz";
                    case MHZ:
                        return "MHz";
                    case GHZ:
                        return "GHz";
                    default:
                        return "Unknown";
                }
            }
        }
    }

    public static class Storage {
        public static class Size {
            public static enum Unit {
                B,
                KB,
                MB,
                GB,
                TB,
                PB,
                EB,
                ZB
            }

            /**
             * Returns the abbreviated size unit as a string
             * @param unit
             * @return
             */
            public static final String getAbbreviatedSizeUnit(Unit unit) {
                switch(unit) {
                    case B:
                        return "B";
                    case KB:
                        return "KB";
                    case MB:
                        return "MB";
                    case GB:
                        return "GB";
                    case TB:
                        return "TB";
                    case PB:
                        return "PB";
                    case EB:
                        return "EB";
                    case ZB:
                        return "ZB";
                    default:
                        return "Unknown";
                }
            }

            public static final String getSizeUnit(Unit unit) {
                switch(unit) {
                    case B:
                        return "Byte";
                    case KB:
                        return "Kilobyte";
                    case MB:
                        return "Megabyte";
                    case GB:
                        return "Gigabyte";
                    case TB:
                        return "Terrabyte";
                    case PB:
                        return "Petabyte";
                    case EB:
                        return "Exobyte";
                    case ZB:
                        return "Zetabyte";
                    default:
                        return "Unknown";
                }
            }
        }
    }
}
