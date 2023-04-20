package fligthControl.domain;

public class Flight {
    private Airplane airplane;
    private Place deparatureAirport;
    private Place targetAirport;
    
    public Flight(Airplane airplane, Place deparatureAirport, Place targetAirport){
        this.airplane = airplane;
        this.deparatureAirport = deparatureAirport;
        this.targetAirport = targetAirport;
    }
    
    public Airplane getAirplane(){
        return this.getAirplane();
    }
    
    public Place getDeparaturePlace(){
        return this.deparatureAirport;
    }
    
    public Place getTargetPlace(){
        return this.targetAirport;
    }
    
    public String toString(){
        return this.airplane.toString() + " (" + this.deparatureAirport + "-" + this.targetAirport + ")";
    }
}


