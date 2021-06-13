package com.moto.actions;

public class KcalPresets {

    public static final String[] red = {"256", "225", "250", "240", "256", "250", "250", "236", "256", "253", "226", "215", "217", "220", "223", "230", "230", "232", "232", "236", "237", "239", "240", "245", "245", "230"};
    public static final String[] green = {"256", "245", "250", "240", "250", "250", "250", "248", "256", "246", "215", "220", "215", "230", "223", "232", "235", "237", "228", "240", "235", "243", "245", "245", "240", "230"};
    public static final String[] blue = {"256", "256", "235", "240", "251", "256", "256", "256", "256", "243", "256", "255", "255", "255", "255", "252", "255", "256", "255", "255", "255", "255", "255", "256", "256", "230"};
    public static final String[] satIntensity = {"255", "264", "251", "257", "290", "284", "257", "274", "289", "274", "264" , "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255"};
    public static final String[] scrContrast = {"255", "255", "260", "255", "260", "264", "264", "258", "264", "258", "260", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255"};
    public static final String[] scrHue = {"0", "0", "1520", "0", "1526", "0", "0", "0", "0", "0", "10", "0", "0", "0", "0", "0","0", "0", "0", "0", "0","0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    public static final String[] scrValue = {"255", "255", "240", "255", "264", "245", "245", "251", "242", "251", "247", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255", "255"};

    enum Presets {
        DEFAULT, VERSION1, VERSION2, VERSION3, TRILUMINOUS, DEEPBW, DEEPND, COOLAMOLED, EXTREMEAMOLED, WARMAMOLED, HYBRIDMAMBA, SIRBANGER, GERARDEXTREMCOOL, YOYOZ808, PURIAN, DEEPBLACKCOLORFUL, VOMERDEEPRICH, FRANCO, WRINKLEFREECOOL, HARLEYTECH, PERFECTION, BANGEDUP, SIMCOOLER, OBSANITY, OBSANITYIPS, EVERTBURN;
        public static Presets toEnum(int index) {
            switch (index) {
                case 0:
                    return DEFAULT;
                case 1:
                    return VERSION1;
                case 2:
                    return VERSION2;
                case 3:
                    return VERSION3;
                case 4:
                    return TRILUMINOUS;
                case 5:
                    return DEEPBW;
                case 6:
                    return DEEPND;
                case 7:
                    return COOLAMOLED;
                case 8:
                    return EXTREMEAMOLED;
                case 9:
                    return WARMAMOLED;
                case 10:
                    return HYBRIDMAMBA;
                case 11:
                    return SIRBANGER;
                case 12:
                    return GERARDEXTREMCOOL;
                case 13:
                    return YOYOZ808;
                case 14:
                    return PURIAN;
                case 15:
                    return DEEPBLACKCOLORFUL;
                case 16:
                    return VOMERDEEPRICH;
                case 17:
                    return FRANCO;
                case 18:
                    return WRINKLEFREECOOL;
                case 19:
                    return HARLEYTECH;
                case 20:
                    return PERFECTION;
                case 21:
                    return BANGEDUP;
                case 22:
                    return SIMCOOLER;
                case 23:
                    return OBSANITY;
                case 24:
                    return OBSANITYIPS;
                case 25:
                    return EVERTBURN;
            }
            return null;
        }
    }

    public static void setValue(String value) {
        int index = Integer.parseInt(value);
        DisplayCalibration.setValueRGB(red[index], green[index], blue[index]);
        DisplayCalibration.setValueSat(satIntensity[index]);
        DisplayCalibration.setValueCon(scrContrast[index]);
	DisplayCalibration.setValueHue(scrHue[index]);
        DisplayCalibration.setValueVal(scrValue[index]);
    }
}

