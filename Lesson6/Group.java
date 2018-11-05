package by.epam.cdptr.main;

class Group {

	private Student[] students;
	private int index;
	
	public Group(int countOfStudents) {
		students = new Student[countOfStudents];
		index = 0;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
     public void print() {
    	for (int i = 0; i < students.length; i++) {
		System.out.println(students[i].getShowMarks());
	}
    	
	}	
	
	
	public void addStudent(Student st) {
		if (index < students.length) {
			students[index] = st;
			index ++;
		}
						
	}
	
}
