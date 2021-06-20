package com.company;

abstract class Transport{
    String way;
    public String toString(){
        return("Transporting way: "+way);}}

    abstract class TransportFactory{
    public abstract Transport CreateTransport();
}
    class SeaTransportingFactory extends TransportFactory{
    public Transport CreateTransport(){
        return new SeaTransport();
    }
    }
    class AirTransportingFactory extends TransportFactory{
    public Transport CreateTransport(){
        return new AirTransport(); }
}
class LandTransportingFactory extends TransportFactory{
    public Transport CreateTransport(){
        return new LandTransport();
    }
}
class LandTransport extends Transport{
    public LandTransport(){
        way = "Land transporting";
    }
}
class AirTransport extends Transport{
    public AirTransport(){
        way = "Air transporting";
    }
}
class SeaTransport extends Transport{
    public SeaTransport(){
        way = "Sea transporting";
    }
}
public class lab_13 {
    public  static  void main(String[] args){
        TransportFactory myLandFactory = new LandTransportingFactory();
        TransportFactory mySeaFactory = new SeaTransportingFactory();
        TransportFactory myAirFactory = new AirTransportingFactory();
        Transport myLandTransport = myLandFactory.CreateTransport();
        Transport mySeaTransport = mySeaFactory.CreateTransport();
        Transport myAirTransport = myAirFactory.CreateTransport();
        System.out.println(myAirTransport);

        System.out.println(mySeaTransport);

        System.out.println(myLandTransport);
    }

}
