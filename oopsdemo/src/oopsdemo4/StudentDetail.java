package oopsdemo4;

//multiple Interface implementation
public class StudentDetail implements CollegeData,HostelData{
	
	College c1=new College("Marry","500","Delhi University","MCA");

	Hostel h1=new Hostel("Ram","Block A");

	@Override
	public void hostelDetail() {
		System.out.println("**********Hostel Details***********");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location    :"+h1.getLocation());
		
	}

	@Override
	public void studentRecord() {
		System.out.println("Students selected on the basis of percentage and Financial situation");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("**********College Details***********");
		System.out.println("College Name :"+c1.getName());
		System.out.println("College Id   :"+c1.getId());
		System.out.println("University   :"+c1.getUniversity());
		System.out.println("Course       :"+c1.getCourse());
		
	}

	@Override
	public void studentData() {
		System.out.println("student can join courses : MCA, MTech, BCA, BTech");
		
	}
	
	public static void main(String[] args) {
		
		StudentDetail s1=new StudentDetail();
		
		s1.collegeDetail();
		s1.studentData();
		s1.studentRecord();
		s1.hostelDetail();

}
	}
