import java.util.*;
import java.io.*; 
interface GuideLine
{
public boolean isDoctorIsAvalable();
public boolean isBedAvalable();
public int DoctorFee();
public String checkInTime(int patientId);
public String checkOutTime(int patientId);
}
class Patient implements GuideLine
{
private int patientId;
private String patientName;
private String patientGender;
private boolean doctorFree=true;
private boolean bedAvalable=true;
private int doctorFee=500;
private String checkInTime;
private String checkOutTime; 
 

public int getPatientId()
{
return this.patientId;
}
public void setPatientId(int patientid)
{
 this.patientId=patientId;
}
public String getPatientName()
{
return this.patientName;
}
public void setPatientName(String patientName)
{
 this.patientName=patientName;
}

public String getPatientGender()
{
return this.patientGender;
}
public void  setPatientGender(String patientGender)
{
 this.patientGender=patientGender;
}


public boolean getDoctorFree()
{
return this.doctorFree;
}
public void setDoctorFree(boolean a)
{
 this.doctorFree=a;
}
public boolean getBedAvalable()//
{
return this.bedAvalable;
}
public void setBedAvalable(boolean a)
{
 this.bedAvalable=a;
}
public void setDoctorFee(int fee)
{
this.doctorFee=fee;
}
public int getDoctorFee()
{
return this.doctorFee;
}

public void setCheckInTime(String d)
{
this.checkInTime=d;
}
public String getCheckInTime()
{
return this.checkInTime;
}

public void setCheckOutTime(String d)
{
this.checkOutTime=d;
}
public String getCheckOutTime()
{
 return this.checkOutTime;
}

////////////////////////////////
public boolean isDoctorIsAvalable()
{              
return this.doctorFree;
}
public boolean isBedAvalable()
{
return this.bedAvalable;
}
public int DoctorFee()
{
return this.doctorFee;
}
public String checkInTime(int patientId)
{
return this.checkInTime;
}
public String checkOutTime(int patientId)
{
return this.checkOutTime;
}
}
class psp 
{
public static void main(String gg[])
{
/*Patient p1=new Patient();
p1.setPatientId(1);
p1.setPatientName("Ram");
*/

//public Patient all[]=new Patient[10];
Patient all[]=new Patient[10];
Scanner sc=new Scanner(System.in);
int x=0;
int i=0;
while(true)
{
System.out.println("1.Register the patient");
System.out.println("2.check detail of patient");
System.out.println("3.Exit");
x=sc.nextInt();
sc.nextLine();
if(x==1)
{
Patient p1=new Patient();
p1.setPatientId(i);

System.out.print("Enter the patient name :");
String  name=sc.nextLine();
p1.setPatientName(name);
System.out.print("Enter the patient gender :");
String gender;
gender=sc.nextLine();
p1.setPatientGender(gender);
System.out.print("enter the patient checkintime");
String checkin;
checkin=sc.nextLine();
p1.setCheckInTime(checkin);
System.out.print("enter the patient checkouttime");
String checkout;
checkout=sc.nextLine();
p1.setCheckOutTime(checkout);
all[i]=p1;
i++;
}
if(x==2)
{
System.out.println("enter the patient Id");
int j=sc.nextInt();
sc.nextLine();
boolean found=false;
for(int k=0;k<i;i++)
{
if(j==k)
{
found=true;
System.out.println(all[j].getPatientId());
System.out.println(all[j].getPatientName());
System.out.println(all[j].getPatientGender());
System.out.println(all[j].getCheckInTime());
System.out.println(all[j].getCheckOutTime());
k++;
}
}
if(found==false)
{
System.out.println("patient not exist");
}
}
if(x==3)
{
break;
}
}
}
}