package Example;
import java.util.Vector;
import java.lang.Cloneable;

public class Address implements Cloneable{
    private Vector itsLines = new Vector();
    public void setLine(int n, String line)
    {
        if( n >= itsLines.size())
        {
            itsLines.setSize(n + 1);
        }
        itsLines.setElementAt(line, n);
    }
    public Object clone() throws CloneNotSupportedException
    {
        Address newAddress = (Address)super.clone();
        newAddress.itsLines = (Vector)itsLines.clone();
        return newAddress;
    }
}
