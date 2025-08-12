import java.util.*;
class matrix
{
    int row,col,row1,col1;
    int m[][];

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:of rows : ");
        row=sc.nextInt();
        System.out.println("Enter the no:of columns : ");
        col=sc.nextInt();
        m=new int[row][col];

        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
    }

    void add(matrix a,matrix b)
    {
        if(a.row==b.row && a.col==b.col) 
        {
            this.row=a.row;
            this.col=a.col;
            this.m=new int[row][col];

            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    this.m[i][j]=a.m[i][j]+b.m[i][j];
                }
            }
        }
        else
        {
            System.out.println("Unable to proceed addition");
        }
    }

    void transpose(matrix a)
    {
        this.row=a.row;
        this.col=a.col;
        this.m=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                this.m[i][j]=a.m[j][i];
            }
        }
    }
    void symmetric(matrix a)
    {
        this.row=a.row;
        this.col=a.col;
        int flag=1;

        this.m= new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                this.m[i][j]=a.m[j][i];
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(this.m[i][j] !=a.m[i][j])
                {
                    flag=0;
                }                  
            }
        }

        if(flag==1)
        {
            System.out.println("\nMatrix is Symmetric");
        }
        else
        {
            System.out.println("\nMatrix is unsymmetric");
        }

    }
    
    

    void multiplication(matrix a,matrix b)
    {
        this.row=a.row;
        this.col=a.col;
        this.row1=b.row;
        this.col1=b.col;

        this.m= new int[row][col1];
        
        if(col==row1)
        {
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    for(int k=0;k<col;k++)
                    {
                        this.m[i][j]+=a.m[i][k]*b.m[k][j];
                    }
                }
            }
            
        }

    }

    void display()
    {
        for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(m[i][j]+" ");
                }
                System.out.println();
            }
    }
}


public class matrixoperations 
{
    public static void main(String[] args)
    {
        matrix a=new matrix();
        matrix b=new matrix();
        matrix c=new matrix();
        matrix d=new matrix();
        matrix e=new matrix();
        matrix f=new matrix();

        a.read();
        b.read();
        System.out.println("\nThe first matrix is");
        a.display();
        System.out.println("The second matrix is");
        b.display();
        c.add(a,b);
        System.out.println("The matrix after addition is : ");
        c.display();
        d.transpose(a);
        System.out.println("The transpose matrix is : ");
        d.display();
        e.symmetric(b);
        System.out.println("The symmetric matrix is");
        e.display();
        f.multiplication(a, b);
        System.out.println("The matrix after multiplication ");
        f.display();
    }
        
}
