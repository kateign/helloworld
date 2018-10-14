package dynarray;

public class DynList {
    private final static int DEFAULT_SIZE = 10;
    private final static double GROW_FACTOR = 1.5;
    
    private int actualSize;
    private int[] sourceArray;

    public DynList() {
        this(DEFAULT_SIZE);
    }

    public DynList(int actualSize) {
        sourceArray = new int[actualSize];
        this.actualSize = 0;
    }
    
    public DynList(int[] source) {
        this.sourceArray = source;
        enlargeArray(GROW_FACTOR);
    }

    public DynList(DynList otherDynList) {
        
        this.sourceArray = otherDynList.sourceArray;
        enlargeArray(GROW_FACTOR);
    }
    
    public void add(int element) {
        
        if (actualSize == sourceArray.length) {
            enlargeArray(GROW_FACTOR);
        }
        this.sourceArray[actualSize] = element;
        this.actualSize++;
    }
    
    public int getSize() {
        return actualSize;
    }
    
    public void setSize(int newSize) {
        this.actualSize = newSize;
    }
    
    private void enlargeArray(double growFactor) {
        int[] newSource = new int[(int)(sourceArray.length * growFactor)];
        for (int i = 0; i < sourceArray.length; i++) {
            newSource[i] = sourceArray[i];
        }
        this.sourceArray = newSource;
    }
}
