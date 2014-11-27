package de.app.JenkinsTest;

public class Del {
	int result=10;
	public int remove(int a,int b)
	{
		return a-b;
	}
	public void sum(int a, int b )
	{
		result=(result*a)-b;
        System.out.print(result);
	}
}
