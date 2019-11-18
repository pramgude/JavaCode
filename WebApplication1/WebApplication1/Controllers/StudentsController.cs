using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class StudentsController : ApiController
    {
        static List<Student> students = new List<Student>()
        {
            new Student(){id=1,Name="Tome"},
            new Student(){id=2,Name="Sam"},
            new Student(){id=3,Name="Jhon"},
        };



        public ArrayList a1 = new ArrayList();
        
        
        
        public IEnumerable<Student> Get()
        {
            return students;
        }
        public Student Get(int id)
        {
            return students.FirstOrDefault(s => s.id == id);
        }
        [Route("api/Students/{id}/courses")]
        public IEnumerable<string> GetStudentsCourses(int id)
        {
            if (id == 1)
                return new List<String>() { "C#", "ASP.NET", "SQL Server" };
            else if(id==2)
                return new List<String>() { "ASP.NET WEB API" };
            else
                return new List<String>() { "BOOTSTRAP","JQUERY" };

        }

        [Route("api/Students/student")]
        public void PostStudent([FromBody] Student student)
        {
            students.Add(student);
           
            
        }

        [Route("api/all")]
       public IHttpActionResult All()
        {
            List<Student> stu = new List<Student>()
            {
                new Student()
                {
                    id=4,
                    Name="hghg"
                }
            };
            return Ok(stu);
        }



        //public void Put([FromBody] Student student)
        //{
        //    students.
        //}
       



    }
}
