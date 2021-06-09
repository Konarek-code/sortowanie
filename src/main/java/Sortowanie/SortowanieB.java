package Sortowanie;

public class SortowanieB implements Interface {

    int[] tab = new int[200];
    int Steps;
   public int[] sort(int[] tab)
    {
        int pomoc;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    pomoc = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = pomoc;
                    zmiana++;
                    Steps++;
                }
            }
        }
        return tab;
    }

    public  double step_counting(){
      return  this.Steps;
    }


}
