class StudentDetails
{
	String name;
	String roolNumber;
	int marks;
	public static void main(String[] args)
	{
		StudentDetails s=new StudentDetails();
		s.name="Dhoni";
		s.roolNumber="7";
		s.marks=97;
		System.out.println(s.name+" "+s.roolNumber+" "+s.marks);
		
		
		StudentDetails s1=new StudentDetails();
		s1.name="Kohli";
		s1.roolNumber="18";
		s1.marks=100;
		System.out.println(s1.name+" "+s1.roolNumber+" "+s1.marks);
	}
}