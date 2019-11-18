using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Address
{
    public class Class1
    {
    }
    public class Detail
    {
       // public SelectList CountryList { get; set; }
    }
    public class Country
    {
        [Required]
        [MaxLength(2)]
        public string CountryName { get; set; }
       
    }

    public class User
    {
        [Required]
        public int UserId { get; set; }
        [Required]
        
        public string Address { get; set; }
    }

    public class Address
    {
        public string AddId { get; set; }
        public string Address1 { get; set; }
        public string BillAddress { get; set; }
    }
}
