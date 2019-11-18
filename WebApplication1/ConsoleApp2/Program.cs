using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class Student
    {
        //int id;
        //string name;
        //bool branch;
        public int id { get; }
        public string name { get;  }
        public bool branch { get;  }

        public Student(int id,string name,bool branch)
        {
            this.id = id;
            this.name = name;
            this.branch = branch;
        }
      



    }
    
   
    class Program
    {
        //public static object a1 { get; private set; }
       
        
        static void Main(string[] args)
        {
            Student s1 = new Student(1, "aaa",true);
            Console.WriteLine(s1.id + " "+s1.name + " " +s1.branch);
            Student s2 = new Student(2, "bbb",false);
            Console.WriteLine(s2.id + " " + s2.name + " " + s2.branch);
            ArrayList al = new ArrayList();
           
            al.Add(s1);
            al.Add(s2);
            foreach (var item in al)
                Console.WriteLine(item);

            Console.ReadLine();
        }
       
    }
}
