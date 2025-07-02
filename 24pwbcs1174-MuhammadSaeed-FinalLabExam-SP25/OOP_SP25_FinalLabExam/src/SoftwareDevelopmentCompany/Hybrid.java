package SoftwareDevelopmentCompany;
public abstract class Hybrid extends Course {
	Hybrid(int course_code, String title, int durationInWeeks) {
		super(course_code, title, durationInWeeks);
	}
	int Fee_per_Week = 120;
	int fee =(durationInWeeks * 120) ;{
		boolean CourseType;
		if(CourseType = "offline" != null) {
			System.out.println(fee + "+300");
		}
		else {
			System.out.println(fee + "fee");	
		}	
      System.out.println(CourseType + "Hybrid");
}
}