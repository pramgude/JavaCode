using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ssss
{
    //abstract class AreaClass
    //{
    //    abstract public int Area();
    //}
   

    //class Square :AreaClass
    //{
    //    int side;

    //   public Square(int side)
    //    {
    //        this.side = side;
    //    }
    //    public override int Area()
    //    {
    //        return side * side;
    //    }
    //}
    class Program
    {
        static void Main(string[] args)
        {
            //Square s = new Square(6);
            //Console.WriteLine("Area  = " + s.Area());
            //Console.ReadLine();


            Thread thr = new Thread(mythread);
            thr.Start();
            Console.WriteLine("Main Thread Ends!!");
        }

        static void mythread()
        {
            for (int c = 0; c <= 3; c++)
            {

                Console.WriteLine("mythread is in progress!!");
                Thread.Sleep(1000);
            }
            Console.WriteLine("mythread ends!!");
        }
    }
}
