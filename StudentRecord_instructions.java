```java
public class StudentRecord {
    private int[] scores;
    //contains scores.lengths values
    //scores.length > 1

    //constructors and other data fields not shown

    //returns the average (arithmetic mean) of the values in scores
    //whose subscripts are between first and last, inclusive inclusive
    //precondition: 0 <= first <= last < scores.length
    private double average(int first, int last)
    { /* to be implemented in part (a) */ }

    //returns true if each successive value in scores is greater
    //than or equal to the previous value;
    //otherwise, returns false
    private boolean hasImproved()
    { /* to be implemented in part (b) */ }

    //if the values in scores have improved, returns the average
    //of the elements in scores with indexes greater than or equal
    //to scores.length/2;
    //otherwise, returns the average of all of the values in scores
    public double finalAverage()
    { /* to be implemented in part (c) */ }
}
```
