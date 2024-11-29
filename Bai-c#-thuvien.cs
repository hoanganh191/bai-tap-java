using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace Tuan6
{
    public partial class Form1 : Form
    {
        SqlConnection con = new SqlConnection("Data Source=ADMIN;Initial Catalog=74DCTT23_Quanlythuvien;Integrated Security=True;Encrypt=False");
        public Form1()
        {
            InitializeComponent();
        }

        private void load_Loaisach()
        {
            //b1 ket noi database

            if (con.State == ConnectionState.Closed)
                con.Open();
            //b2 tao doi tuong commad de thuc thi cau lenh
            string sql = "Select * From Loaisach";
            SqlCommand cmd = new SqlCommand(sql, con);

            //b3 : tao doi tuong data Adapter de lay ket qua tu cmd
            SqlDataAdapter da = new SqlDataAdapter();
            da.SelectCommand = cmd;

            //b4 : tao doi tuong dataTable de nhap ket qua tu da
            DataTable tb = new DataTable();
            da.Fill(tb); //do du lieu tu da vao dataTable

            cmd.Dispose();
            con.Close();

            //b5 do du lieu tu tb vao dataGripView
            dgvLoaisach.DataSource = tb;
            dgvLoaisach.Refresh();

        }

        private bool checktrungMaloai(string ml)
        {
            //b1 ket noi voi data base
            if(con.State == ConnectionState.Closed) con.Open();

            //b2 Tao doi tuong commad de thuc thi cau lenh sql
            string sql = "Select count(*) from Loaisach Where Maloai = '" + ml + "'";
            SqlCommand cmd = new SqlCommand(sql, con);
            int kq = int.Parse(cmd.ExecuteScalar().ToString());
            if (kq > 0) return true;
            else return false;
        }

        

        private void btnLuu_Click(object sender, EventArgs e)
        {
            //B1 Lay du lieu tu cac control dua vao bien
            string ml = txtMaloai.Text.Trim();
            string tl = txtTenloai.Text.Trim();
            string mt = txtMota.Text.Trim();


            //Check rong
            if (ml == "")
            {
                MessageBox.Show("Ban de ma loai trong");
                txtMaloai.Focus();
                return;
            }

            if (tl == "")
            {
                MessageBox.Show("Ban de ten loai trong");
                txtTenloai.Focus();
                return;
            }

            //Kiem tra trung ma loai
            if(checktrungMaloai(ml))
            {
                MessageBox.Show("Trung ma loai!");
                txtMaloai.Focus(); //con tro chi ve cho do
                return;
            };

            

            //b2 ket noi DB
            SqlConnection con = new SqlConnection("Data Source=ADMIN;Initial Catalog=74DCTT23_Quanlythuvien;Integrated Security=True;Encrypt=False");
            if (con.State == ConnectionState.Closed)
            {
                con.Open();
            }

            //b3 tao doi tuong command de thuc thi cau lenh
            //b3.1 tao cau lenh sql
            string sql = "Insert Loaisach Values('"+ml+"',N'"+tl+"',N'"+mt+"')";

            //b3.2 tao doi tuong Command
            SqlCommand cmd = new SqlCommand(sql, con);

            //b3.3 thuc thi cau lenh sql
            cmd.ExecuteNonQuery();

            //b4 : Giai phong bo nho
            cmd.Dispose();
            con.Close();
            MessageBox.Show("Them moi thanh cong ahihi!");

            //load lai du lieu
            load_Loaisach();
            

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            load_Loaisach();
        }

        private void dgvLoaisach_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            int i = e.RowIndex;
            txtMaloai.Text = dgvLoaisach.Rows[i].Cells[0].Value.ToString();
            txtTenloai.Text = dgvLoaisach.Rows[i].Cells[1].Value.ToString();
            txtMota.Text = dgvLoaisach.Rows[i].Cells[2].Value.ToString();
            txtMaloai.Enabled = false;
        }

        private void btnSua_Click(object sender, EventArgs e)
        {
            //b1 lay du lieu tu cac control dua vao bien
            string ml = txtMaloai.Text.Trim();
            string tl = txtTenloai.Text.Trim();
            string mt = txtMota.Text.Trim();

            //b2 ket noi data base
            if (con.State == ConnectionState.Closed) 
                con.Open();

            //b3 tao doi tuong command
            string sql = "Update Loaisach Set Tenloai = '" + tl + "', Mota = '" + mt + "' Where Maloai = '" + ml +"' ";
            SqlCommand cmd = new SqlCommand(sql, con);
            cmd.ExecuteNonQuery();

            cmd.Dispose();
            con.Close();
            MessageBox.Show("Sua thanh cong !");
            load_Loaisach();
        }

        private void btnXoa_Click(object sender, EventArgs e)
        {
            
            DialogResult res = MessageBox.Show("Ban co xoa hay khong", "Canh bao", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (res == DialogResult.Yes) {
                string ml = txtMaloai.Text.Trim();
                //b2 ket noi data base
                if (con.State == ConnectionState.Closed)
                    con.Open();

                //b3 tao doi tuong command
                string sql = "Delete Loaisach Where Maloai = '" + ml + "'";
                SqlCommand cmd = new SqlCommand(sql, con);
                cmd.ExecuteNonQuery();

                cmd.Dispose();
                con.Close();
            } 
            
            

            load_Loaisach();
        }

        private void Reset_Click(object sender, EventArgs e)
        {
            txtMaloai.Enabled = true;
            txtMaloai.Text = "";
            txtTenloai.Text = "";
            txtMota.Text = "";
        }
    }
}
