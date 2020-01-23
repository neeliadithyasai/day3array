import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int a[];
        int []b;
        int c[]= new int[5];
         c[0]=10;
         c[1]=20;
         c[2]=30;
         c[3]=40;
         c[4]=50;
         //c[5]= 60;

         a= new int[2];
         a[0]=100;
         a[1]=200;

         int d[]= new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("length of array "+d.length);
        for(int i=0; i<d.length;i++)
        {
            System.out.println(d[i]);
        }

       int[] x,y;//both are array
         int x2,y2[];//1- int , 2- array
         int x3[],y3;//1 - array, 2 - int
         int[] x4,y4[];// x4 - 1d array, y4 - 2d array

        y4 = new int[3][3];
        System.out.println("using compact for(:) ");
        for(int p:d)
        {
            System.out.println(p);
        }
        exercise();
    }

    public static void exercise()
    {

        int n[]= new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("length of n "+n.length);
        System.out.println("minimium of array "+n[0]);//min of array
        System.out.println("maximum of array "+n[n.length-1]);//max of array

        int sum = 0;
        for(int i=0; i < n.length ; i++)
            sum = sum + n[i];
        // average value
        float average = (float)sum / n.length;
        System.out.println("Average value of the array elements is : " + average);
        System.out.println("sum of array "+ sum);
        System.out.println("array in reverse order");

        for(int j=n.length-1; j>=0;j--)
        {

            System.out.print(n[j]+" ");
        }
        String[] names = {"Adithya ", "sam ", "karthik ", "aron ","james ","mohit ","surya ","nikhil ","emilia ","tom "};
        System.out.println("\nlist of strings: ");
        for(String p:names)
        {
            System.out.print(p);
        }


    }

}