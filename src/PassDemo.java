class ObjectPassDemo
{
    int a, b;
  
    ObjectPassDemo(int i, int j)
    {
        a = i;
        b = j;
    }
  
    // return true if o is equal to the invoking
    // object notice an object is passed as an
    // argument to method
    boolean equalTo(ObjectPassDemo o)
    {
        return (o.a == a && o.b == b);
    }
}
  
