package hr.fer.zemris.drawing;

import hr.fer.zemris.models.DrawingModel;
import hr.fer.zemris.models.DrawingModelListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JComponent;

/**
 * This component is the "main" component in the jPaint program.
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
@SuppressWarnings("serial")
public class JDrawingCanvas extends JComponent implements DrawingModelListener {

    private final DrawingModel model;

    /**
     * Creates a new {@link JDrawingCanvas} that listens to <code>model</code>
     * 
     * @param model model to listen to
     */
    public JDrawingCanvas(final DrawingModel model) {
        this.model = model;
        model.addDrawingModelListener(this);
        setBorder(BorderFactory.createLineBorder(Color.RED, 3));
    }

    /**
     * Returns 200,200 dimension for preffered size.
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    /**
     * Paints every component from model.
     */
    @Override
    protected void paintComponent(Graphics g) {
        for (int i = 0, limit = model.getSize(); i < limit; i++) {
            model.getObject(i).paintComponent(g);
        }
    }

    /**
     * Draws added objects.
     */
    @Override
    public void objectsAdded(DrawingModel source, int index0, int index1) {
        final Graphics g = getGraphics();
        for (int i = index0; i <= index1; i++) {
            model.getObject(i).paintComponent(g);
        }
        repaint();
    }

    /**
     * Not supported by this program, just repaints
     */
    @Override
    public void objectsRemoved(DrawingModel source, int index0, int index1) {
        // not needed for this program
        repaint();
    }

    /**
     * Repaints changed objects.
     */
    @Override
    public void objectsChanged(DrawingModel source, int index0, int index1) {
        final Graphics g = getGraphics();
        for (int i = index0; i <= index1; i++) {
            model.getObject(i).paintComponent(g);
        }
    }
}
