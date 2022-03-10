public class Package {
    private Address origin;
    private Address destination;
    private double weight;

    public Package(Address o, Address d, double w)
    {
        origin = o;
        destination = d;
        if (w > 0.10)
        {
            weight = w;
        }
    }

    public Address getOrigin()
    {
        return origin;
    }

    public Address getDestination()
    {
        return destination;
    }

    public double getWeight()
    {
        return weight;
    }
}
