public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting as= new ArraySorting();
        //as.sort();
        QuickSort qs= new QuickSort();
        BubleSort bs= new BubleSort();

        as.sort(qs);
        as.sort(bs);


    Sorting quickSort=()-> System.out.println("Quick sorting");
    as.sort(quickSort);

     as.sort(()-> System.out.println("Quick sorting"));
        Sorting bubleSort=()-> System.out.println("Buble sorting");
        as.sort(bubleSort);
    }

    private void sort(Sorting sorting) {

        sorting.sort();
    }

}
