/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
public interface Priority {
        public static final int MIN_PRIORITY = 1;
        public static final int MED_PRIORITY = 5;
        public static final int MAX_PRIORITY = 10;
        
        public abstract void setPriority(int p);
        
        public abstract int getPriority(); 

        
    }
