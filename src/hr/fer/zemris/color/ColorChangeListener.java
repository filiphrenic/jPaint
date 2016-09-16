package hr.fer.zemris.color;

import java.awt.Color;

/**
 * Interface used for classes that have to listen to {@link IColorProvider} to act on it.
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
public interface ColorChangeListener {

    /**
     * This method will be called when any {@link IColorProvider} that this {@link ColorChangeListener} is listening to
     * changes it's color.
     *  @param source source that changed it's color
     * @param newColor new color
     */
    void newColorSelected(IColorProvider source, Color newColor);

}
