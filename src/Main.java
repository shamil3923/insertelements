
public class Main {
    public static void main(String[] args) {
       ordArray x=new ordArray(5);
       x.insert(1);
       x.insert(2);
       x.insert(3);

       x.display();
       x.insert(18);
       x.insert(15);

       x.display();
    }
}

class ordArray{
    private int[] a;
    private int nElems;

    //constructor
    public ordArray(int max){
        this.a=new int[max];
        this.nElems=0;
    }

    //return max size of the array
    public int size(){
        return a.length;
    }

    //return the position of the number if it is in the array
    public int find(int searchkey){
        for (int i = 0; i < nElems; i++) {
            if(a[i]==searchkey){
                return i+1;
            }
        }
        return -1;
    }

    //insert the number in the array
    public void insert(int value){
        if(a.length==nElems){
            System.out.println("Array is full");
            return;
        }
        else {
            for (int i = 0; i < nElems; i++) {
                if (a[i] > value) {
                    for (int j = nElems; j > i; j--) {
                        a[j] = a[j - 1];
                    }
                    a[i] = value;
                    nElems++;
                    return;
                }

                a[nElems] = value;
                nElems++;
            }
        }
    }

    //delete the number from the array
    public void delete (int value){
        for (int i = 0; i <nElems ; i++) {
            if(a[i]==value){
                for(int j=i;j<nElems;j++){
                    a[j]=a[j+1];
                    return;
                }
                nElems--;
            }
        }
        return;
    }

    public void display(){
        for (int i = 0; i <nElems ; i++) {
            System.out.println(a[i]);
        }
    }


}