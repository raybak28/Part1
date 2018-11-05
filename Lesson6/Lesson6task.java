package by.epam.cdptr.main;

public class Lesson6task {

	public static void main(String[] args) {
		Student st1 = new Student("Ivanov", new int[]{4,5,3,4});
		Student st2 = new Student("Petrov", new int[]{4,2,3,4});
		Student st3 = new Student("Vasechkin", new int[]{3,2,3});
		Student st4 = new Student("Rostova", new int[]{5,5});
		Student st5 = new Student("Poklonskaya", new int[]{5,5,4});
		
		Group group = new Group(5);
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		
		group.print();
		System.out.println("");

				
		GroupLogic grLogic = new GroupLogic();
		System.out.println("Average mark for " + st1.getName() + " " + grLogic.avrStudentMark(st1));
		System.out.println("Average mark for " + st2.getName() + " " + grLogic.avrStudentMark(st2));
		System.out.println("Average mark for " + st3.getName() + " " + grLogic.avrStudentMark(st3));
		System.out.println("Average mark for " + st4.getName() + " " + grLogic.avrStudentMark(st4));
		System.out.println("Average mark for " + st5.getName() + " " + grLogic.avrStudentMark(st5));
		
		System.out.println("");
		System.out.println("Average group mark " + grLogic.avrGroupMark(group));
		
		System.out.println("");
		System.out.println("Quantity of perfect students in the group = " + grLogic.countPerfectStudent(group));
		
		System.out.println("");
		System.out.println("Quantity of bad students in the group = " + grLogic.countBadStudent(group));
		
	}

}
