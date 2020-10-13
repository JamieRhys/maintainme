package jre.maintainme.utils.strings;

public class Types {
    public static class Physical {
        public static enum Type {
            HARDWARE("Hardware"),
            SOFTWARE("Software");

            private final String displayValue;

            private Type(String value) { this.displayValue = value; }

            public String getDisplayString() { return this.displayValue; }
        }

        /**
         * Returns the physical type string
         * @param type
         * @return
         */
        public static final String getPhysicalType(Type type) {
            switch(type) {
                case HARDWARE:
                    return "HARDWARE";
                case SOFTWARE:
                    return "SOFTWARE";
                default:
                    return "UNKNOWN";
            }
        }
    }

    

    public static class PC {
        public static class Designated {
            public static enum Type {
                GRAPHICS,
                OPERATOR,
                SERVER,
                PERSONAL,
                TABLET
            }
    
            /**
             * Returns the designated type as a string
             * @param type
             * @return
             */
            public static final String getDesignatedType(Type type) {
                switch(type) {
                    case GRAPHICS:
                        return "Graphics PC";
                    case OPERATOR:
                        return "Operator PC";
                    case SERVER:
                        return "Server PC";
                    case PERSONAL:
                        return "Personal PC";
                    case TABLET:
                        return "Tablet PC";
                    default:
                        return "Unknown PC";
                }
            }
        }

        public static class Motherboard {
            public static enum Size {
                PITX("Pico-ITX"),
                NITX("Nano-ITX"),
                MITX("Mini-ITX"),
                MATX("Micro-ATX"),
                ATX("ATX");

                private final String displayValue;

                private Size(String value) { this.displayValue = value; }

                public String getDisplayValue() { return this.displayValue; }
            }
        }

        public static class RAM {
            public static enum Type {
                SRAM("SRAM"),
                SDRAM("SDRAM"),
                DDR("DDR"),
                DDR2("DDR2"),
                DDR3("DDR3"),
                DDR4("DDR4"),
                DDR5("DDR5");

                private final String displayValue;

                private Type(String name) { this.displayValue = name; }

                public String getDisplayValue() { return this.displayValue; }
            }
        }

        public static class Storage {
            public static enum Type {
                SSD("SSD"),
                HDD("HDD");

                private final String displayValue;

                private Type(String displayValue) { this.displayValue = displayValue; }

                public String getDisplayValue() { return this.displayValue; }
            }
        }

        public static class OS {
            public static enum Type {
                WIN,
                LINUX,
                MACOS
            }

            /**
             * Returns the Operating System type.
             * @param type
             * @return
             */
            public static final String getOSType(Type type) {
                switch(type) {
                    case WIN: 
                        return "Windows";
                    case LINUX:
                        return "Linux";
                    case MACOS:
                        return "MacOS";
                    default:
                        return "Unknown OS";
                }
            }
        }
    }

    public static class Input {
        public static enum Type {
            HDMI,
            DVI,
            SDI,
            DISPLAY_PORT,
            VGA
        }

        /**
         * Returns the input type string
         * @param type
         * @return
         */
        public static final String getInputType(Type type) {
            switch(type) {
                case HDMI:
                    return "HDMI";
                case DVI:
                    return "DVI";
                case SDI:
                    return "SDI";
                case DISPLAY_PORT:
                    return "Display Port";
                case VGA:
                    return "VGA";
                default:
                    return "Unkown";
            }
        }
    }

    public static class TransferProtocol {
        public static enum Type {
            XLR,
            DMX,
            ETHERNET,
            WIRELESS,
            MIDI
        }

        /**
         * Returns the Transfer Protocol type as a String
         * @param type
         * @return
         */
        public static final String getTransferProtocolType(Type type) {
            switch(type) {
                case XLR:
                    return "XLR";
                case DMX:
                    return "DMX";
                case ETHERNET:
                    return "Ethernet";
                case WIRELESS:
                    return "Wireless";
                case MIDI:
                    return "MIDI";
                default:
                    return "Unknown";
            }
        }
    }
}
