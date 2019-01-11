package advancedDay1Assignment2n3;

public class EmployeeGrade {
	public static void main(String[] args){
//advanced assignment 2
        int employeeID[] = {1001,1002,1003,1004};
        int customer1Feedback[] = {3,3,4,5};
        int customer2Feedback[] = {2,1,4,2};
        int customer3Feedback[] = {4,3,5,5};
        float averageFeedback[] = new float[4];
        char grade[] = new char[4];

        for (int i = 0 ; i<averageFeedback.length; i++){
            averageFeedback[i] =  (customer1Feedback[i] + customer2Feedback[i] + customer3Feedback[i]) /3;
            if (averageFeedback[i] >=0 && averageFeedback[i] <1)
                grade[i] = 'E';
            else if (averageFeedback[i] >=1 && averageFeedback[i] <2)
                grade[i] = 'D';
            else if (averageFeedback[i] >=2 && averageFeedback[i] <3)
                grade[i] = 'C';
            else if (averageFeedback[i] >=3 && averageFeedback[i] <4)
                grade[i] = 'B';
            else if (averageFeedback[i] >=4 && averageFeedback[i] <5)
                grade[i] = 'A';
        }

        for (int i = 0; i<employeeID.length; i++){
            System.out.println(employeeID[i] + " has average rating of " + averageFeedback[i] + " and the grade is "+ grade[i]);
        }
 //advanced assignment 3
        int [][] employeeInfo = {{1001, 2,2,3}, {1002, 3,4,5,6,4,7}, {1003, 3,4,5,2,1,3,4,5}};

        for (int i=0; i<employeeInfo.length; i++){
            for (int j=0; j<employeeInfo[i].length; j++){
                System.out.println(employeeInfo[i][j] + "\t");
            }
            System.out.println("\n");
        }



    }
}
