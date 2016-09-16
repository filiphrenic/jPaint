package hr.fer.zemris.models;

import hr.fer.zemris.drawing.objects.GeometricalObject;

import javax.swing.AbstractListModel;
import javax.swing.JList;

/**
 * A wrapper around {@link DrawingModel} that can serve as a list model to {@link JList}
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
@SuppressWarnings("serial")
public class DrawingObjectListModel extends AbstractListModel<GeometricalObject> implements DrawingModelListener {

    private final DrawingModel model;

    /**
     * Creates a new {@link DrawingObjectListModel} that is a wrapper around {@link DrawingModel}
     * 
     * @param model model that this list model represents
     */
    public DrawingObjectListModel(final DrawingModel model) {
        this.model = model;
        model.addDrawingModelListener(this);
    }

    @Override
    public int getSize() {
        return model.getSize();
    }

    @Override
    public GeometricalObject getElementAt(int index) {
        return model.getObject(index);
    }

    @Override
    public void objectsAdded(DrawingModel source, int index0, int index1) {
        fireIntervalAdded(source, index0, index1);
    }

    @Override
    public void objectsRemoved(DrawingModel source, int index0, int index1) {
        fireIntervalRemoved(source, index0, index1);
    }

    @Override
    public void objectsChanged(DrawingModel source, int index0, int index1) {
        fireContentsChanged(source, index0, index1);
    }

}
