public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,3,2};
        //int[] array2 = new int[] {1,3,-4,5};
        //System.out.println(containsTheSameElements(array1,array2));
        if (isSorted(array1) == true)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        return sum;
    }

    public static int findMissingInt (int [] array) {
        // Write your code here:
        int missingInt = 0;
        int j = 0;
        while (j < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (missingInt == array[i])
                    missingInt++;
            }
            j++;
        }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = array[0];
        int secMax = min(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                secMax = max;
                max = array[i];
            }
            else {
                if (array[i] >= secMax && array[i] != max)
                    secMax = array[i];
            }
        }
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean aInb = false;
        boolean bIna = false;
        int i = 0;
        int j = 0;
        while (i < array1.length) {
            while (j < array2.length) {
                if (array1[i] == array2[j]) {
                    aInb = true;
                    break;
                }
                else {
                    aInb = false;
                    j++;
                }
            }
            if (aInb == false)
                return false;
            j = 0;
            i++;
        }
        i = 0;
        j = 0;
        while (j < array2.length) {
            while (i < array1.length) {
                if (array2[j] == array1[i]) {
                    bIna = true;
                    break;
                }
                else {
                    bIna = false;
                    i++;
                }
            }
            if (bIna == false)
                return false;
            i = 0;
            j++;
        }
        if (aInb == true && bIna == true)
            return true;
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] <= array[i+1])
                increasing = true;
            else {
                increasing = false;
                break;
            }
        }
        for (int j = 0; j < array.length-1; j++){
            if (array[j] >= array[j+1])
                decreasing = true;
            else {
                decreasing = false;
                break;
            }
        }
        if (increasing == true || decreasing == true) {
            return true;
        }
        return false;
    }

}
