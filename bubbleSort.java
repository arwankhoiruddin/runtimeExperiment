import java.io.FileWriter;

class bubbleSort {
    public static void main(String[] args) throws Exception {

        int numExperiments = 1000;
        long[] duration = new long[numExperiments];

        // initialize numbers (ascending)
        int[] angka = new int[1000];


        System.out.println("Duration to sort");
        System.out.print("");

        FileWriter writer = new FileWriter("durasi.txt", false);

        for (int exp=0; exp < numExperiments; exp++) {
            System.out.println("Perform experiment number " + exp);
            // reinitialize the numbers. back to ascending
            for (int i=0; i<angka.length; i++) {
                angka[i] = i;
            }

            // printArray("Unsorted", angka);

            long start = System.nanoTime();
            // bubble sort the numbers, turn to descending
            for (int i=0; i<angka.length-1; i++) {
                for (int j=0; j<angka.length-i-1; j++) {
                    if (angka[j] < angka[j+1]) {
                        int temp = angka[j];
                        angka[j] = angka[j+1];
                        angka[j+1] = temp;
                    }
                }
            }

            long finish = System.nanoTime();
            duration[exp] = finish - start;
            // printArray("Sorted", angka);

            writer.write(duration[exp] + "\n");

        }
        System.out.print("]");
        writer.close();
    }

    public static void printArray(String judul, int[] angka) {
        System.out.println();
        System.out.println(judul);
        for (int i=0; i<angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}