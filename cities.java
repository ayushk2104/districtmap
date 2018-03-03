public class cities
{
    public int data1(int m,int n)
    {
        String name1[]={"Location 1","Location 2","Location 3","Location 4","Location 5","Location 6","Location 7","Location 8","Location 9","Location 10"};
        int dist1[]={10,20,30,40,50,60,70,80,90};
        int i,s=0;
        
      if(m!=0&& n!=0)
      {
      for(i=m-1;i<n-1;i++)
      {
          s+=dist1[i];
      }
    }
    else
    {
    for(i=0;i<10;i++)
      {
      System.out.println((i+1)+") "+name1[i]);
      }
    }
      return s;
    }
     public int data2(int m,int n)
    {
        String name1[]={"Location 11","Location 12","Location 13","Location 14","Location 15","Location 16","Location 17","Location 18","Location 19","Location 20"};
        int dist1[]={10,20,30,40,50,60,70,80,90};
        int i,s=0;
        
      if(m!=0&& n!=0)
      {
      for(i=m-1;i<n-1;i++)
      {
          s+=dist1[i];
      }
    }
    else
    {
    for(i=0;i<10;i++)
      {
      System.out.println((i+1)+") "+name1[i]);
      }
    }
      return s;
    }
     public int data3(int m,int n)
    {
        String name1[]={"Location 21","Location 22","Location 23","Location 24","Location 25","Location 26","Location 27","Location 28","Location 29","Location 30"};
        int dist1[]={10,20,30,40,50,60,70,80,90};
        int i,s=0;
        
      if(m!=0&& n!=0)
      {
      for(i=m-1;i<n-1;i++)
      {
          s+=dist1[i];
      }
    }
    else
    {
    for(i=0;i<10;i++)
      {
      System.out.println((i+1)+") "+name1[i]);
      }
    }
      return s;
    }
}