public class BigRectangleFilter implements Filter
{

    @Override
    public boolean accept(Object x) {
        int i = (int) x;
        return i > 10;
    }
}
