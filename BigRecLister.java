import java.util.ArrayList;

public class BigRecLister
{



    public static void main(String[] args)
    {
        ArrayList rectangles = new ArrayList();

        rectangles.add(4);
        rectangles.add(7);
        rectangles.add(8);
        rectangles.add(40);
        rectangles.add(71);
        rectangles.add(2);
        rectangles.add(13);
        rectangles.add(10);
        rectangles.add(15);

        collectAll(rectangles);

    }

    public static void collectAll(ArrayList q)
    {
        BigRectangleFilter bigRectangle = new BigRectangleFilter();
        for(int i = 0; i < 10; i++)
        {
            if(bigRectangle.accept(q.get(i)))
            {
                System.out.println("Rectangle number: " + (i+1) + " has a perimeter of: " + q.get(i));
            }
        }
    }
}
