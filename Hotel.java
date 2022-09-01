class Hotel
{
       public static void main(String[] args)
        {
         Hotel obj=new Hotel();
         obj.welcome();
         int d=obj.option();
         obj.bill(d);
        }

        void welcome()
        {
         System.out.println("Welcome to Saravana Bhavan \nTastier ever");
         System.out.println("1.Briyani (Rs.80) \n2.Chicken Rice (Rs.70) \n3.Veg rice (Rs.60)\nSelect your options 1  2  3");
        }
        public int option()
        {
         int a=1;
         int b=2;
         int c=3;
         return c;
        }
        public void bill(int food)
        {
         if(food==1)
            {
            System.out.println("---------------------\nHotel Saravana Bhavan-Bill No:1 \nBriyani: Rs.80 \nThank You \nVisit Again\n-----------------");
            }
        else if(food==2)
            {
             System.out.println("---------------------\nHotel Saravana Bhavan-Bill No:1 \nChicken Rice: Rs.70 \nThank You \nVisit Again\n-----------------");
            }
        else if(food==3)
            {
             System.out.println("---------------------\nHotel Saravana Bhavan-Bill No:1 \nVeg Rice: Rs.60 \nThank You \nVisit Again\n----------------------"); 
            }
        else
            {
             System.out.println("---------------------\nSorry.Please select another option \n-----------------------------------");
            }
        }
}
