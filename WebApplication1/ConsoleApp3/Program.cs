using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
   
    class Program
    {
        
        public static void swap(ref int a, ref int b,ref int x)
        {
            
            if (x == 0)
                x--;

            a--;
            b++;
            swap(ref a, ref b,ref x);
            Console.WriteLine("swap: {0} {1} {2}", a, b);
        }
        public static void swap_helper(ref int a, ref int b)
        {
            int a1 = a;
            int b1 = b;
            if (a > b)
            {
                int x = a1 - b1;
                swap(ref a1, ref b1, ref x);
            }
            else
            {
                int x = b1 - a1;
                swap(ref b, ref a, ref x);
               // h = 6;
            }
        }
        static void Main(string[] args)
        {
            int a = 5;
            int b = 7;
            int x;
            swap_helper(ref a, ref b);
            Console.WriteLine("swap: {0} {1} {2}", a, b);
            Console.ReadLine();

        }
    }
}
