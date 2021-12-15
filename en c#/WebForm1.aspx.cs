using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace FIBONA
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnCal_Click(object sender, EventArgs e)
        {
			//int n1 = Convert.ToInt32(txtNum1.Text.ToString().Trim());
			//int cantidad = Convert.ToInt32(txtNum1.Text.ToString().Trim());
            string a = "";
            //Console.Write("Enter the number of elements: ");
            //number = int.Parse(txtNum1.Text.ToString().Trim());

            double s = Convert.ToDouble(txtNum1.Text.ToString().Trim());
            double x = s * Math.PI / 180.0;
            double res = Math.Sin(x);
            lblRes.Text = "El seno del número " + s + " es: " + res.ToString() + "<br />";


            double c = Convert.ToDouble(txtNum2.Text.ToString().Trim());
            double y = c * Math.PI / 180.0;
            double res2 = Math.Cos(y);
            lblRes2.Text = "El coseno del número " + c + " es: " + res2.ToString() + "<br />";


            double t = Convert.ToDouble(txtNum3.Text);
            double z = t * Math.PI / 180.0;
            double res3 = Math.Tan(z);
            lblRes3.Text = "El tangente del número " + t + " es: " + res3.ToString() + "<br />";


            //a = a + " " + n3.ToString();
            //lblRes.Text = a;
        }
    }
}