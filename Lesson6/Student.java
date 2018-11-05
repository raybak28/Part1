package by.epam.cdptr.main;

class Student {

	private String name;
	int[] marks;
	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}
		
		
	public void arrayPrint(int[] marks) {
	    for (int i = 0; i < marks.length; i++) {
	        System.out.println(marks[i]);
	    }
	}
	
	
	   public String getShowMarks() {
		String m = "";
		   for (int i = 0; i < marks.length; i++)   {
		m = m + " " + marks[i];
		}
			return name + m;
	}
	
	
	   public String toString() {
		   return name + marks.toString();
	   }
	
	   public String getName() {
			return name;
		}
		
		public int[] getMarks() {
			return marks;
		}
	}
	

