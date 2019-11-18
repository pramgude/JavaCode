using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Address.web.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            ViewBag.Message = "Multiple DropDown List";
            Detail obj = new Detail();
            Country obj1 = new Country();

            List<Country> objCountry = new List<Country>();


            objCountry = GetCountryList();

          //  SelectList objlistofcountrytobind = new SelectList(objCountry, "ID", "CountryName");





           // obj.CountryList = objlistofcountrytobind;

           

            return View(obj);

        }

        public List<Country> GetCountryList()

        {

            List<Country> objCountry = new List<Country>();

            objCountry.Add(new Country {  CountryName = "CR" });

            objCountry.Add(new Country { CountryName = "TT" });

            

            return objCountry;

        }

        

    }
}
   
