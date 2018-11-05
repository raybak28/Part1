package by.epam.cdptr.main;

public class GroupLogic {
	
	public double avrStudentMark(Student st) {
		double avrStMark = 0.0;
		int count = 0;
		int sum = 0;
		int[] marks = st.getMarks();
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
			count++;
		}
		avrStMark = (double) sum / count;
	    return avrStMark;
	}
	
	public double avrGroupMark(Group gr) {
		Student[] students = gr.getStudents();
		double avrGrMark = 0;
		double totalsum = 0;
		int count2 = 0;
		for (int i = 0; i < students.length; i++) {
			//students[i].getMarks();
			totalsum = totalsum + avrStudentMark(students[i]);
			count2++;
		}
		avrGrMark = (double) totalsum / count2;
		return avrGrMark;		
	}
	
	public int countPerfectStudent(Group gr) {
		int count = 0;
		boolean perfect = false;
		Student[] students = gr.getStudents();
		
		for (int i = 0; i < students.length; i++) {
			int[] marks = students[i].getMarks();
			for (int j = 0; j < marks.length; j++) {
				if (marks[j] == 5) {
					perfect = true;	
		        } else {
		        	perfect = false;
		        }
	        }
			if (perfect) {
			count++;
			} 
	}
		return count;
	}
	
	public int countBadStudent(Group gr) {
		int count2 = 0;
		
		
		Student[] students = gr.getStudents();
		
		for (int i = 0; i < students.length; i++) {
			boolean bad = false;
			int[] marks = students[i].getMarks();
			for (int j = 0; j < marks.length; j++) {
				if (marks[j] == 2) {
			    bad = true;	
		        } 
	        }
			if (bad) {
			count2++;
			} 
	}
		return count2;
	}
	

}
