import java.io.*;
public class calci extends cities
{
    public static void main(String args[])throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
    calci ob=new calci();
    System.out.println("\fState the city you are currently in, from amongst the following \nEg. To select city 2 type 2.");
    System.out.println("1) City 1 \n2) City 2 \n3) City 3");
    int ch=Integer.parseInt(br.readLine());
    int m,n;
    System.out.println("Enter your choice from amongst the following");
    switch(ch)
    {
        case 1:
    ob.data1(0,0); 
    System.out.println("Please enter your nearest landmark i.e. code of the place where you're present.");
    m=Integer.parseInt(br.readLine());
    System.out.println("Please enter your desired location i.e. the code of the place you are willing to go to");
    n=Integer.parseInt(br.readLine());
    System.out.println("You are presently in city1.");
    System.out.println("Vital information about city1:\n Banks available at locations 2\nThe bus depot is at location 6\nHotels are available at locations 1 and 9 ");
    System.out.print("You are presently ");
    if(m<n)
    System.out.print(ob.data1(m,n));
    else
    System.out.print(ob.data1(n,m));
    System.out.print(" km away from your destination via the main route.");
    break ;
    case 2:
    ob.data2(0,0);
   System.out.println("Please enter your nearest landmark i.e. code of the place where you're present.");
    m=Integer.parseInt(br.readLine());
    System.out.println("Please enter your desired location i.e. the code of the place you are willing to go to");
    n=Integer.parseInt(br.readLine());
    System.out.println("You are presently in city2.");
    System.out.println("Vital information about city2:\n Banks available at locations 12\nThe bus depot is at location 16\nHotels are available at locations 11 and 19 ");
    System.out.print("You are presently ");
    if(m<n)
    System.out.print(ob.data2(m,n));
    else
    System.out.print(ob.data2(n,m));
    System.out.print(" km away from your destination via the main route.");
    break ;
    case 3:
    ob.data3(0,0);
    System.out.println("Please enter your nearest landmark i.e. code of the place where you're present.");
    m=Integer.parseInt(br.readLine());
    System.out.println("Please enter your desired location i.e. the code of the place you are willing to go to");
    n=Integer.parseInt(br.readLine());
    System.out.println("You are presently in city3.");
    System.out.println("Vital information about city3:\n Banks available at locations 22\nThe bus depot is at location 26\nHotels are available at locations 21 and 29 ");
    System.out.print("You are presently ");
    if(m<n)
    System.out.print(ob.data3(m,n));
    else
    System.out.print(ob.data3(n,m));
    System.out.print(" km away from your destination via the main route.");
    break ;
    default :
    System.out.println("You have entered the wrong choice");
}
} 
}