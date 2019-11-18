using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ass2
{
    public class Student
    {

        public int StudentID { get; set; }
        public string StudentName { get; set; }
        public int Age { get; set; }
        public int StandardID { get; set; }
    }

    public class Standard
    {

        public int StandardID { get; set; }
        public string StandardName { get; set; }
    }
    class Program
    {
       

        static void Main(string[] args)
        {
            

            //IList<string> strList1 = new List<string>() {
            //"One",
            //"Two",
            //"Three",
            //"Four"
            //};

            //IList<string> strList2 = new List<string>() {
            //"One",
            //"Two",
            //"Five",
            //"Six"
            //};

            //var result = strList1.Join(strList2,
            //    str1 => str1,
            //    str2 => str2,
            //    (str1, str2) => str1
            //    );
            //foreach(var Result in result)
            //{
            //    Console.WriteLine("Result : {0}" ,Result);
            //}
            //Console.ReadLine();



            IList<Student> studentList = new List<Student>() {
                new Student() { StudentID = 1, StudentName = "John", Age = 18, StandardID = 1 } ,
                new Student() { StudentID = 2, StudentName = "Steve",  Age = 21, StandardID = 1 } ,
                new Student() { StudentID = 3, StudentName = "Bill",  Age = 18, StandardID = 2 } ,
                new Student() { StudentID = 4, StudentName = "Ram" , Age = 20, StandardID = 2 } ,
                new Student() { StudentID = 5, StudentName = "Ron" , Age = 21 }
            };

            IList<Standard> standardList = new List<Standard>() {
                new Standard(){ StandardID = 1, StandardName="Standard 1"},
                new Standard(){ StandardID = 2, StandardName="Standard 2"},
                new Standard(){ StandardID = 3, StandardName="Standard 3"}
            };

            //var result = studentList.Join(standardList,
            //    student => student.StudentID,
            //    standard => standard.StandardID,
            //    (student, standard) => 
            //    new 
            //    {
            //        student = student.StudentName,
            //        standard = standard.StandardName
            //    });


            //var innerJoinResult = studentList.Join(// outer sequence 
            //          standardList,  // inner sequence 
            //          student => student.StandardID,    // outerKeySelector
            //          standard => standard.StandardID,  // innerKeySelector
            //          (student, standard) => new  // result selector
            //          {
            //              StudentName1 = student.StudentName,
            //              StandardName1 = standard.StandardName
            //          });

           
            var innerJoinResult = from s in studentList
                                  join st in standardList
                                  on s.StudentID equals st.StandardID
                                  select new
                                  {
                                      StudentName1 = s.StudentName,
                                      StandardName1 = st.StandardName
                                  };


            foreach (var Result in innerJoinResult)
            {
                Console.WriteLine("{0} - {1}" , Result.StudentName1, Result.StandardName1);
            }
            Console.ReadLine();
        }
    }
    
}
