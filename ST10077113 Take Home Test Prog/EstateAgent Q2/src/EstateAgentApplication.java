import java.util.Scanner;

public class EstateAgentApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the estate agent's name: ");
        String sName = scanner.nextLine();

        System.out.print("Enter the property price: R ");
        double dPrice = scanner.nextDouble();

        EstateAgentSales objEstate = new EstateAgentSales(sName, dPrice); //creates an object
        objEstate.printPropertyReport(); //calls for the method

        scanner.close();
    }
}

interface iEstateAgent {
    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}

class EstateAgentSales implements iEstateAgent {
    private String sName;
    private double dPrice;

    public EstateAgentSales(String agentName, double propertyPrice) {
        this.sName = agentName;
        this.dPrice = propertyPrice;
    }

    public void printPropertyReport() {
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("******");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
    }

    @Override
    public String getAgentName() {
        return sName;
    }

    @Override
    public double getPropertyPrice() {
        return dPrice;
    }

    @Override
    public double getAgentCommission() {
        return dPrice*20/100;
    }
}