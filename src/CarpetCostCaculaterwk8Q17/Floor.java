package CarpetCostCaculaterwk8Q17;

public class Floor {
    double width;
    double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;


        if ((width < 0) || (length < 0)) {
            this.width = 0;
            this.length = 0;
        }
    }
        public double getArea () {
            return (width * length);


    }

}