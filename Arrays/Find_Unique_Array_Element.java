 class FindUnique{
    public static void main(String []args)
    {

         int arr[]={2,3,3,2,4};

        int unique = 0;

          for(int num:arr)
          unique^=num;


        System.out.print(unique);

    }
}