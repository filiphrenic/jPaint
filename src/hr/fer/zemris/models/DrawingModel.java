package hr.fer.zemris.models;

import java.awt.Rectangle;

import hr.fer.zemris.drawing.objects.GeometricalObject;

/**
 * Models that provide objects.
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
public interface DrawingModel {

    /**
     * Number of objects.
     * 
     * @return number of objects
     */
    int getSize();

    /**
     * Returns the object at given index.
     * 
     * @param index object's index
     * @return object at given index
     */
    GeometricalObject getObject(int index);

    /**
     * Adds object to a list of objects.
     * 
     * @param obj object to add
     */
    void add(GeometricalObject obj);

    /**
     * Removes the given object from the object list
     * 
     * @param obj object to remove
     */
    void remove(GeometricalObject obj);

    /**
     * Clears the model.
     */
    void clear();

    /**
     * Adds the given listener to the listeners list.
     * 
     * @param l listener to add
     */
    void addDrawingModelListener(DrawingModelListener l);

    /**
     * Removes the given listener from the listeners list.
     * 
     * @param l listener to remove
     */
    void removeDrawingModelListener(DrawingModelListener l);

    /**
     * Returns a bounding box of this model. It is the smallest rectangle in which all components can be drawn.
     * 
     * @return bounding box of this model
     */
    Rectangle getBoundingBox();

}
