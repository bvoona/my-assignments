package StringAssignments;

public class Builder2 {


	public static void main(String[] args)
	{
		StringBuilder st1 = new StringBuilder("It is used to at the specified index position");
		StringBuilder st2 = st1.insert(14,"insert text ");
		System.out.println("after inserting text:"+st2);

	}

}
