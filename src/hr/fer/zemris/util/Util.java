package hr.fer.zemris.util;

import java.awt.Color;

public final class Util {

    private Util() {
    }

    /**
     * Returns string parsed to int. If the string cannot be parsed to int, 0 is returned.
     * 
     * @param arg string to parse
     * @return int valeu of the string
     */
    public static int getInt(final String arg) {
        int result = 0;
        try {
            result = Integer.parseInt(arg);
        } catch (NumberFormatException ignore) {
        }
        return result;
    }

    /**
     * Returns a color that is parsed from a string. String should look like (r,g,b)
     * 
     * @param arg string to parse
     * @return color represented by this string
     */
    public static Color getColor(final String arg) {
        String[] args = arg.substring(1, arg.length() - 1).split(",");
        if (args.length != 3) {
            return Color.BLACK;
        }
        final int r = getInt(args[0]);
        final int g = getInt(args[1]);
        final int b = getInt(args[2]);

        return new Color(r, g, b);
    }

}
