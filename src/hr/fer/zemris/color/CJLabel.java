package hr.fer.zemris.color;

import java.awt.Color;

import javax.swing.JLabel;

/**
 * This ColorJLabel is used to provide information about 2 colors.
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
public class CJLabel extends JLabel implements ColorChangeListener {

    private static final long serialVersionUID = 276462161827110627L;

    private final Color[] colors = new Color[2];

    /**
     * @param foreground
     * @param background
     */
    public CJLabel(JColorArea foreground, JColorArea background) {
        colors[0] = foreground.getCurrentColor();
        colors[1] = background.getCurrentColor();
        foreground.addColorChangeListener(this);
        background.addColorChangeListener(this);
        updateText();
    }

    @Override
    public void newColorSelected(IColorProvider source, Color newColor) {
        colors[source.isFgColor() ? 0 : 1] = newColor;
        updateText();
    }

    /**
     * Updates the text in the label to <code>Foreground color: (r,g,b), background color: (r,g,b).</code>
     */
    private void updateText() {
        setText("Foreground color: " + getColor(colors[0]) + ", background color: " + getColor(colors[1]) + "");
    }

    /**
     * Returns (r, g, b) representation of the color <code>c</code>
     * 
     * @param c color
     * @return string representation of the color
     */
    private String getColor(final Color c) {
        return "(" + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue() + ")";
    }
}
