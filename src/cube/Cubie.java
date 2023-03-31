package cube;

/**
 * Class that represent an inner-cube of a Rubik's cube. 
 * This can then be implemented for NxNxN cubes. 
 * A cubie has 6 faces for a cubic rubik's cube. Each face can hold a color, from the enumeration.
 */
public class Cubie {

    /* The index of this cube should be static, even when rotating all the cube */
    private int index;

    /* The color from the upper part of the cubie*/
    private Color up;
    private Color down;
    private Color right;
    private Color left;
    private Color front;
    private Color back;

    /*
     * Creates cubie.
     */
    public Cubie(int index){
        this.index = index;
    }

}