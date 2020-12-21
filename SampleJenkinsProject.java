public class SampleJenkinsProject
{
public static void main(String[] args)
{
SampleJenkinsProject sjp= new SampleJenkinsProject();
System.out.println(sjp.getData());
System.out.println("Welcome to Jenkins Project");

}
public String getData()
{
return "Hello World From GetData";
}
}