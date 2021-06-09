package Sortowanie;


public class SortowanieKube implements Interface {
    private double Steps;


    public int[] sort(int[] tabe) {


        int max = 0;

        for (int i = 0; i < tabe.length; i++) {
            if (tabe[i] > max) {
                max = tabe[i];
            }
        }
        int[] Bucket = new int[max + 1];
        int[] posortowana = new int[tabe.length];

        for (int j = 0; j < tabe.length; j++) {
            Bucket[tabe[j]]++;
        }
        int pos = 0;

        for (int k = 0; k < Bucket.length; k++) {
            for (int l = 0; l < Bucket[k]; l++) {
                posortowana[pos++] = k;
                Steps++;
            }
        }
        return posortowana;
    }

    public double step_counting() {
        return this.Steps;
    }

}



