// TextLab11st.java
// The Student Records Algorithm Program
// This is the student, starting version of the TextLab11 assignment.

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

//test
public class Lab_2
{
    public static void main(String args[]) throws IOException
    {
        List studentArray = new List(33);
        studentArray.getList();
        studentArray.display("UNSORTED LIST OF STUDENTS");
        studentArray.pause();

        studentArray.gpaSort();
        studentArray.display("STUDENTS SORTED IN DESCENDING ORDER BY GPA");
        studentArray.pause();

        studentArray.ageSort();
        studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY AGE");
        studentArray.pause();

        studentArray.idSort();
        studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID#");
        studentArray.pause();

		int studentID = getID();
		int index = studentArray.search(studentID);

		if (index == -1)
		    System.out.println("There is no student with an ID# of "+studentID+".\n");
		else
		{
			studentArray.displayStudent(index);   // displays the information for the found student
			studentArray.delete(index);           // remove the same student from the array
			studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID# WITHOUT STUDENT# "+studentID);
			studentArray.pause();
		}
    }

    public static int getID()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 6-digit ID of the student.  { 100000 - 999999 }  -->  ");
        return input.nextInt();
    }
}


class Person
{
    public String name;
    public int id;
    public int age;
    public double gpa;

    Person(String n, int ID, int a,double g)
    {
        name = n;
        id = ID;
        age = a;
        gpa = g;
    }
}


class List
{
    private Person student[];	// stores array elements
    private int capacity;		// actual array capacity
    private int size;			// number of elements in the array

    public List(int c)
    {
        capacity = c;
        size = 0;
        student = new Person[capacity];
    }

    public void getList() throws IOException{
        FileReader inFile = new FileReader("students2.dat");
        BufferedReader inStream = new BufferedReader(inFile);
        String s1,s2,s3,s4;
        int age, id;
        double gpa;
        int index = 0;
        while( ((s1 = inStream.readLine()) != null) &&
                ((s2 = inStream.readLine()) != null) &&
                ((s3 = inStream.readLine()) != null) &&
                ((s4 = inStream.readLine()) != null) )
        {
            String name = s1;
            id = Integer.parseInt(s2);
            age = Integer.parseInt(s3);
            gpa = Double.parseDouble(s4);

            student[index] = new Person(name,id,age,gpa);
            index++;
        }
        inStream.close();
        size = index;
    }
    public int search(int studentID){
		int max = student.length-1;
		int min = 0;
		while(min <= max){
			int mid = (max + min)/2; 
			if(student[mid].id == studentID)
			{
				return mid;
			}else if(student[mid].id > studentID){
				max = mid - 1; 
			}else{
				min = mid + 1; 
			}
			mid = (max + min) / 2; 
		}
	return -1;
    }
    private String spaces(String name)
    {
        int tab = 24 - name.length();
        String temp = "";
        for (int j = 1; j <= tab; j++)
            temp += " ";
        return temp;
    }

    public void display(String listInfo)
    {
        DecimalFormat output = new DecimalFormat("0.000");
        System.out.println("\nDISPLAYING "+ listInfo);
        System.out.println("\nStudent ID#     Student Name            Age         GPA");
        System.out.println("============================================================");

        for (int k = 0; k < size; k++)
            System.out.println(student[k].id + "          "+student[k].name + spaces(student[k].name) +
                    student[k].age + "          " + output.format(student[k].gpa));
    }

    public void pause()
    {
        Scanner input = new Scanner(System.in);
        String dummy;
        System.out.println("\nPress <Enter> to continue.");
        dummy = input.nextLine();
    }

    public void displayStudent(int k)
    {
        DecimalFormat output = new DecimalFormat("0.000");
        System.out.println("\nDISPLAYING STUDENT");
        System.out.println("\nStudent ID#     Student Name            Age         GPA");
        System.out.println("============================================================");

            System.out.println(student[k].id + "          "+student[k].name + spaces(student[k].name) +
                    student[k].age + "          " + output.format(student[k].gpa));
    }

    private void swap(int x, int y)
    {

    }

    public void gpaSort(){
        Arrays.sort(student,new gpaCompar());  //sorts with gpa
    }

    public void ageSort()
    {
        Arrays.sort(student,new ageCompar()); // sorts with age
    }

    public void idSort()
    {
        Arrays.sort(student,new idCompar()); // sorts with IDs
    }


    public void delete(int index)
    {
        Person[] tempStudent = new Person[size-1];
        int t = 0;
        for(int i=0;i<student.length;i++){
            if(i != index){
                tempStudent[t] = student[i];  //adds everything to the new array except the one with that index value
                t++;
            }
        }
        student = tempStudent; //changes that array to the new array
        size = size-1; // subtracts one so we know the array length.

    }
}
class gpaCompar implements Comparator<Person>{ //GPA (descending)
    public int compare(Person s1, Person s2){
        if(s1.gpa > s2.gpa){
            return -1; //puts first person first if there gpa is larger.
        }else if(s1.gpa < s2.gpa){
            return 1; // if the first person gpa is less than the second. put them after.
        }
        return 0; // do nothing
    }
}
class ageCompar implements Comparator<Person>{ //Age (ascending)
    public int compare(Person s1, Person s2){
        if(s1.age < s2.age){
            return -1; //if the first person age is less than the second. Put them first
        }else if(s1.age > s2.age){
            return 1;  // or put them last
        }
        return 0; // do nothing
    }
}
class idCompar implements Comparator<Person>{ // ID# (ascending).
    public int compare(Person s1, Person s2){
        if(s1.id < s2.id){
            return -1; // if the first person id is less than the first put them first
        }else if(s1.id > s2.id){
            return 1; // or put them last
        }
        return 0; // do nothing
    }
}

