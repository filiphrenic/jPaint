package hr.fer.zemris.color;

import java.awt.Color;

/**
 * Classes that implement this interface must have methods for providing it's color. Color is provided to their
 * listeners.
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
public interface IColorProvider {

    /**
     * Returns the current color of this {@link IColorProvider}.
     * 
     * @return current color
     */
    Color getCurrentColor();

    /**
     * If the {@link IColorProvider} provides <i>foreground</i> color.
     * 
     * @return <code>true</code> if it provides foreground color
     */
    boolean isFgColor();

}
