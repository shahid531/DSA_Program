package java_program;

public class RainWaterTrappingJava {
    public int waterUnit(int[] arr1) {
        //height of the building
        //int[] arr1 = {3, 0, 0, 2, 0, 4};
        //min
        int[] minArr1 = new int[arr1.length];
        minArr1[0] = arr1[0];
        //max
        int[] maxArr1 = new int[arr1.length];
        maxArr1[arr1.length - 1] = arr1[arr1.length - 1];
        //water
        int[] waterArr1 = new int[arr1.length];
        //total unit water
        int result = 0;
        /*program start*/
        for (int i = 1; i < arr1.length; i++) {
            minArr1[i] = Math.max(minArr1[i - 1], arr1[i]);
        }

        for (int i = arr1.length - 2; i >= 0; i--) {
            maxArr1[i] = Math.max(maxArr1[i + 1], arr1[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            waterArr1[i] = Math.min(minArr1[i], maxArr1[i]) - arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            result += waterArr1[i];
        }
        /*program end*/
        return result;
    }
}
