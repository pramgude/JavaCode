using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class Student
    {
        //int id;
        //string name;
        //bool branch;
        public int id { get; }
        public string name { get; }
        public bool branch { get; }

        public Student(int id, string name, bool branch)
        {
            this.id = id;
            this.name = name;
            this.branch = branch;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Student s1 = new Student(1, "aaa", true);
            Student s2 = new Student(2, "bbb", false);
            bool branch = true;

            if (branch)
            {
                Console.WriteLine("Country is CR");
            }
            else {
                Console.WriteLine("Country is TT");
            }
            
            List<Student> al = new List<Student>();

            al.Add(s1);
            al.Add(s2);
            foreach (var item in al)
            {
                Console.WriteLine(item.id);
                Console.WriteLine(item.name);
                Console.WriteLine(item.branch);

                
            }
            Console.ReadLine();
            
            
        }
    }
}
