using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Address1
{
    public class Country
    {
        //string CountryName;
        [Required]
        [MaxLength(2)]
        
        public string CountryName { get; }
        [Required]
        //[Key]
        public bool BillAddress { get; }

        public Country(string CountryName)
        {
            this.CountryName = CountryName;
            if (CountryName == "CR") BillAddress = true;
            else if (CountryName == "TT") BillAddress = false;
        }
       


    }
    public class Address
    {
        //string AddressId;
        //string Addressdesc;
        //bool BillAddress;
        public string AddressId { get; }
        public string Addressdesc { get; }

        [Required]
        //[ForeignKey("Country")]
        public bool BillAddress { get;  }
        public Address(string AddressId, string Addressdesc, bool BillAddress)
          //  public Address(string AddressId, string Addressdesc)
        {
            this.AddressId = AddressId;
            this.Addressdesc = Addressdesc;
            this.BillAddress = BillAddress;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Address address = new Address("A123", "13th Avenue, Downtown,CR", true);

            //Address address1 = new Address("A124", "Springland Avenue, Trinidad y Tobago,TT",false);
            // Console.WriteLine(address.AddressId + " " +address.Addressdesc + " " +address.BillAddress);
            // ArrayList al = new ArrayList();
            //bool BillAddress = true;

            // List<Address> al = new List<Address>();
            // al.Add(address);
            //// al.Add(address1);
            // foreach (var item in al)
            // {
            //     Console.WriteLine(item.AddressId);
            //     Console.WriteLine(item.Addressdesc);
            //     Console.WriteLine(item.BillAddress);


            //     }


            //ArrayList al = new ArrayList();
            //al.Add(address.AddressId);
            //al.Add(address.Addressdesc);
            //al.Add(address.BillAddress);
            //foreach (var item in al)
            //{
            //    Console.WriteLine(item);

            //}

            // ArrayList<> al = new ArrayList<>();
           


            Country ct = new Country("CR");
            Console.WriteLine( "CR : " + ct.BillAddress);
            Country ct1 = new Country("TT");
            Console.WriteLine("TT : " + ct1.BillAddress);
            Console.ReadLine();
        }
    }
}
