package CarpetCostCaculaterwk8Q17;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator (Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
