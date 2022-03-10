import java.util.ArrayList;

public class Address {
    private String streetNum;
    private String streetName;
    private int apartNum;
    private String city;
    private String state;
    private int zipCode;

    // Constructors
    public Address (String sNum, String sName, int aNum, String c, String st, int zip)
    {
        streetNum = sNum;
        streetName = sName;
        apartNum = aNum;
        city = c;
        state = st;
        zipCode = zip;
    }

    public Address (Address a)
    {
        streetNum = a.getStreetNum();
        streetName = a.getStreetName();
        apartNum = a.getApartNum();
        city = a.getCity();
        state = a.getState();
        zipCode = a.getZipCode();
    }

    public Address (String address)
    {
        while (address.indexOf(",") != -1)
        {
            String part1 = address.substring(0, address.indexOf(","));
            String part2 = address.substring(address.indexOf(",") + 1);
            address = part1 + part2;
        }
        if (!(address.substring(address.length() - 1).equals(" ")))
        {
            address = address + " ";
        }
        ArrayList<String> info = new ArrayList<String> ();
        while (!(address.equals(" ")))
        {
            String addInfo = address.substring(0, address.indexOf(" "));
            info.add(addInfo);
            address = address.substring(address.indexOf(" ") + 1);
        }
        streetNum = info.get(0);
        streetName = info.get(1);
        apartNum = Integer.parseInt(info.get(2));
        city = info.get(3);
        state = info.get(4);
        zipCode = Integer.parseInt(info.get(5));
    }

    // Accessor Methods
    public String getStreetNum()
    {
        return streetNum;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public int getApartNum()
    {
        return apartNum;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public int getZipCode()
    {
        return zipCode;
    }

    // toString method
    public String toString()
    {
        return streetNum + " " + streetName + " " + "Apt " + apartNum + ", " + city + ", " + state + " " + zipCode;
    }

    // Comparison method
    public boolean compareTo (Address add2)
    {
        if (!streetNum.equals(add2.getStreetNum()))
        {
            return false;
        }
        if (!streetName.equals(add2.getStreetName()))
        {
            return false;
        }
        if (apartNum != add2.getApartNum())
        {
            return false;
        }
        if (!city.equals(add2.getCity()))
        {
            return false;
        }
        if (!state.equals(add2.getState()))
        {
            return false;
        }
        if (zipCode != add2.getZipCode())
        {
            return false;
        }
        return true;
    }
}
