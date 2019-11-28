package arraySort;

public class ShellSorting {
    private double value = 0;
    public double[] sort(double[] array) {

        for (int j = 0; j < array.length; j++) {

            if (array[0] <= array[1]) {
                value = array[2];
                array[2] = array[1];
                array[1] = array[0];
                array[0] = value;
            }

            for (int i = 1; i < array.length - 2; i++) {

                if (array[i] <= array[i + 1]) {
                    value = array[i + 2];
                    array[i + 2] = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = value;
                } else {
                    value = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }
            }

            if (array[array.length - 1] > array[array.length - 2]) {
                value = array[array.length - 3];
                array[array.length - 3] = array[array.length - 2];
                array[array.length - 2] = array[array.length - 1];
                array[array.length - 1] = value;
            }


            //return array;
        }
        return array;
    }
}
