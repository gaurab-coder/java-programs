import java.util.Scanner;
class SwitchDemo
{
    public static void main(String [] ae)
    {
        int marks;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks=input.nextInt();
        if(marks>100 || marks<0)
        {
            System.err.println("you entered invalid marks.");
        }
        else{
            switch(marks/10)
            {
                case 10:
                    System.out.println("Grade A+");
                    break;
                    case 9:
                        System.out.println("Grade A");
                        break;
                        case 8:
                            System.out.println("Grade B+");
                            break;
                            case 7:
                                System.out.println("grade B");
                                break;
                                case 6:
                                    System.out.println("Grade C+");
                                    break;
                                    default:
                                        System.out.println("Fail");
;            }
        }
    }
}
