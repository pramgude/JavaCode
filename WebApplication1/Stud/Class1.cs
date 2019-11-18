using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stud
{



    public class Student
    {
        int rollno;
        String name;

        Student()
        {

        }
        Student(int rollno, String name)
        {
            this.rollno = rollno;
            this.name = name;
        }


        public class class1
        {

            public static void main(String[] args)
            {
                Student s1 = new Student(101, "PPPP");
                Student s2 = new Student();
            }
        }
    }
}
