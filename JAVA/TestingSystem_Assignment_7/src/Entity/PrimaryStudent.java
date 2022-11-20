package Entity;
// trưởng tiểu học

import java.util.Arrays;

public class PrimaryStudent extends Student {



    @Override
    public String toString() {
        return "PrimaryStudent{}";
    }

    public static int COUNTPri = 0;
    public PrimaryStudent() {
        super();
        COUNTPri++;
    }

}

