package hr.fer.zemris.models;

/**
 * Listeners to {@link DrawingModel}.
 * 
 * @author Filip Hrenić
 * @version 1.0
 */
public interface DrawingModelListener {

    /**
     * Called when there were objects added on some interval
     * 
     * @param source source on which objects were added
     * @param index0 index0
     * @param index1 index1
     */
    void objectsAdded(DrawingModel source, int index0, int index1);

    /**
     * Called when there were objects removed on somme interval
     * 
     * @param source source on which objects were removed
     * @param index0 index0
     * @param index1 index1
     */
    void objectsRemoved(DrawingModel source, int index0, int index1);

    /**
     * Called when there were objects changed on some intervalF
     * 
     * @param source source on which objects were changed
     * @param index0 index0
     * @param index1 index1
     */
    void objectsChanged(DrawingModel source, int index0, int index1);

}
