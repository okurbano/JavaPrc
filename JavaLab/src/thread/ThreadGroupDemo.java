package thread;

class ThreadGroupDemo
{
   @SuppressWarnings("deprecation")
public static void main (String [] args)
   {
      ThreadGroup tg = new ThreadGroup ("subgroup 1");
      Thread t1 = new Thread (tg, "gita");
      Thread t2 = new Thread (tg, "sita");
      Thread t3 = new Thread (tg, "bata");
      System.out.println(" Thread name = "+t1.getName());
      System.out.println(" Thread Group Name = "+tg.getName());
      
      ThreadGroup tg2 = new ThreadGroup ("Mens");
      Thread t11 = new Thread (tg2, "naresh");
      Thread t22 = new Thread (tg2, "suresh");
      Thread t33 = new Thread (tg2, "rakesh");
      System.out.println(" Thread name = "+t11.getName());
      System.out.println(" Thread Group Name = "+tg2.getName());
      t11.start();
      t22.start();
      t11.destroy();
      System.out.println("active threads from group2  = "+tg2.activeCount());
     
   }
}