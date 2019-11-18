using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace stud5
{
    class Program
    {

        public static void main(String[] args) 

        {
            square s = new square();

            double areasq = s.AreaClaculate();  // we will get 100, because x=y=100 and x*y=100
            Console.WriteLine(areasq);

            rectangle r = new rectangle(10, 5);   // behind the scene 10,5 are passing to shape(double x, double y) at base class

            double arearect = r.AreaClaculate();   // we will get 50.
            Console.WriteLine(arearect);
        }
    }
}
