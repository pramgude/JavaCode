using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace stud5
{
    //public class Class1
    //{
    //}

    public abstract class Shape

    {

        protected double x = 10;

        protected double y = 10;

        protected Shape()

        { }

        protected Shape(double x, double y)

        {

            this.x = x;

            this.y = y;

        }

        public abstract double AreaClaculate();

    }

    public class square : Shape

    {

        public square()

        { }

        public override double AreaClaculate()

        {

            return x * y;    // here x=10 and y=10 works, i set x=y due to square, if any we have any other shape other than square then x!=y

        }

    }

    public class rectangle : Shape

    {

        public rectangle(double x, double y)

            : base(x, y)    // it will call Shape(double x, double y) at base class

        {

        }

        public override double AreaClaculate()

        {

            return x * y;   /// hre x and y will pass from runtime

        }

    }


}
