import java.sql.*;
public class JdbcTest
{
public static void main(String[] args) 
{
    String JDriver="com.mysql.jdbc.Driver";//SQL���ݿ�����
    String connectDB="jdbc:mysql://127.0.0.1:3306/mysqltest";//����Դע��IP��ַ�Ͷ˿ںţ����ݿ�����
    try  
    {
        Class.forName(JDriver);//�������ݿ����棬���ظ����ַ���������
    }
    catch(ClassNotFoundException e)
    {
        //e.printStackTrace();
        System.out.println("�������ݿ�����ʧ��");
        System.exit(0);
    } 
    System.out.println("���ݿ������ɹ�");
    try
    {
        String user="root";//���Լ��������û����ֺ�����
        String password="0211";
        Connection con=DriverManager.getConnection(connectDB,user,password);//�������ݿ����
        //Connection con=DriverManager.getConnection(connectDB);
        System.out.println("�������ݿ�ɹ�");
        Statement stmt=con.createStatement();//����SQL�������
        //������
        System.out.println("��ѯ");
        System.out.println("��ʼ��ȡ����");
        ResultSet rs=stmt.executeQuery("SELECT * FROM user where age=21");//����SQL����ѯ�����(����)
        //ѭ�����ÿһ����¼
        while(rs.next())
        {
              //���ÿ���ֶ�
             System.out.println(rs.getString("id")+"\t"+rs.getString("name"));
        }
        System.out.println("��ȡ���");


        //��������
        System.out.println("����");
        stmt.executeUpdate("insert into StuDate values(5,'����','Ů',19,'���')");//����һ����¼
        System.out.println("���Ӻ�������ǣ�");
        ResultSet rs1=stmt.executeQuery("SELECT * FROM StuDate" );//����SQL����ѯ�����(����)
       //ѭ�����ÿһ����¼
        while(rs1.next())
        {
        //���ÿ���ֶ�
              System.out.println(rs1.getString("id")+"\t"+rs1.getString("name"));
        }
        System.out.println("��ȡ���");


       //�޸�����
        System.out.println("�޸�");
        stmt.executeUpdate("Update StuDate set age=13 where id=3 ");//�޸ļ�¼
        System.out.println("�޸ĺ�������ǣ�");
        ResultSet rs2=stmt.executeQuery("SELECT * FROM StuDate where id=3" );//����SQL����ѯ�����(����)
       //ѭ�����ÿһ����¼
        while(rs2.next())
        {
         //���ÿ���ֶ�
             System.out.println(rs2.getString("id")+"\t"+rs2.getString("age"));
        }
        System.out.println("��ȡ���");


        //ɾ������
        System.out.println("ɾ��");
        stmt.executeUpdate("Delete From StuDate where id='4' ");//�޸ļ�¼
        System.out.println("ɾ����������ǣ�");
        ResultSet rs3=stmt.executeQuery("SELECT * FROM StuDate " );//����SQL����ѯ�����(����)
        //ѭ�����ÿһ����¼
        while(rs3.next())
        {
         //���ÿ���ֶ�
           System.out.println(rs3.getString("id")+"\t"+rs3.getString("age"));
        }
        System.out.println("��ȡ���");


       //�ر�����
        stmt.close();//�ر������������
        con.close();//�ر����ݿ�����
    }
    catch(SQLException e)
    {
       e.printStackTrace();
       //System.out.println("���ݿ����Ӵ���");
       System.exit(0);
    }
}
}