package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambah 1sehinggah i = 1
        System.out.println(i);  //betulkan i nilainya 1
        i++;                    //karena i tadinya bernilai 1 maka sekarang ditambah lagi 1 menjadi 2
        System.out.println(i);  //tuh betulkan i nilainya 2
        i=i+1;                  //bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);  // i tadi 2 sekarang jadi 3

        i+=3; // sama dengan i  = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }
}
