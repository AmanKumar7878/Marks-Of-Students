import java.util.Scanner;

public class MarksOfStudents
{
    int arr[][];
    Scanner sc = new Scanner(System.in);
    public MarksOfStudents()
    {
        arr = new int[4][5];
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Enter the numbers of 5 subjects of "+i+" Student");
            for (int j = 0; j <5 ; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public void AvgInEachSubject()
    {
        for (int j = 0; j < 5; j++)
        {   float avg = 0;
            for (int i = 0; i <4 ; i++)
            {
                avg = avg+arr[i][j];

            }
            System.out.println("average marks in "+j+" subject is "+avg/4);


        }
    }
    public void AvgMarksOfEachStudent()
    {
        for (int i = 0; i < 4; i++)
        {   float avg = 0;
            for (int j = 0; j <5 ; j++)
            {
                avg = avg+arr[i][j];
            }
            System.out.println("average marks of "+i+" student is "+avg/5);
        }
    }
    public void ScoreOfEachStudent()
    {
        for (int i = 0; i < 4; i++) {
            float score = 0;
            for (int j = 0; j < 5; j++) {
                score = score + arr[i][j];

            }
            System.out.println("Score of "+i+" Student is "+score);
        }
    }
}
class Test
{
    public static void main(String[] args) {
        MarksOfStudents obj = new MarksOfStudents();
        obj.AvgInEachSubject();
        obj.AvgMarksOfEachStudent();
        obj.ScoreOfEachStudent();
    }
}