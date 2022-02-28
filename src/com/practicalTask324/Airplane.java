package com.practicalTask324;

public class Airplane {


    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        Technical technical = new Technical();

        String support = technical.technicalSupport();
        String drive = airplane.flyThePlane();
        String stewardessService = airplane.stewardessService();
        String flightDirector = AirPort.flightDirector();
        System.out.println(support + flightDirector + drive + stewardessService);
    }

    private String flyThePlane() {
        String drive ="Drrrrr,drrrrrr" + ")))";
        return drive;
    }
    public String stewardessService(){
        String stewardessService = "Du yiu want coffee" + "? ))";
        return stewardessService;
    }

}

    class Technical extends Airplane {
    protected String technicalSupport() {
       String technicalSupport = "Kerosene filled" + "!!!";
        return technicalSupport;
    }
}
    class AirPort extends Airplane{
      static String flightDirector (){
          String flightDirector = "Board 738 get on the runway"+ "!!!";
          return flightDirector;
      }
        }
