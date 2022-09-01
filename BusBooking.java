class BusBooking
{
double amount;
double igst18;
double totalamt;
    public void availableBus()
    {
     System.out.println("Coimbatore to Bangalore");
     System.out.println("      SRS TRAVELS NON AC 6PM:FARE=RS 600 \nBus no:1");
     System.out.println("    LAXMI TRAVELS NON AC 8PM:FARE=RS 600 \nBus no:2");
     System.out.println("BETHLEHEM TRAVELS NON AC 9PM:FARE=RS 600 \nBus no:3");
     System.out.println("Select the bus number");
    }
    public float billing(int a)
    {
     
     int b=a;
     switch(b)
     {
     case 1:
            amount=600*100/118;
            igst18=600-amount;
            totalamt=amount+igst18;
            System.out.println("---------------------------");
            System.out.println("SRS TAVELS \nNon AC \nBill No:560 \nFrom:COIMBATORE JN \nTo:BANGALORE ");
            System.out.println("AMOUNT:"+amount);
            System.out.println("IGST 18%:"+igst18);
            System.out.println("TOTAL:"+totalamt);
            break;
      }
    return b;
    }
    
  public static void main(String[] args)
    {
     BusBooking person1=new BusBooking();
     //float b=1;
    float b=person1.billing(1);
    }
}
     
    
