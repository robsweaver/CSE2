// Rob Weaver
// 7 September 2014
// CSE hw02
// Arithmetic Java Program

//  define a class
    public class Arithmetic {
        
//      add main method
        public static void main(String[] args) {
            
            
//          input variables
            int nSocks=3;   // number of pairs of socks
            double sockCost$=2.58;  // cost of one pair of socks in $
            
            int nGlasses=6; // number of drinking glasses
            double glassCost$=2.29;  // cost of one drinking glass in $
            
            int nEnvelopes=1;   // number of envelopes
            double envelopeCost$=3.25;  // cost of one envelope in $
            
            double taxPercent=0.06;  //  tax on the total cost
            
//          unknown variables
            double totalSocksCost$;  // total cost of socks
            double socksTax$;    // tax on socks
            double socksAfterTax$;  // cost of socks after tax
            
            double totalGlassesCost$;   // total cost of glasses
            double glassesTax$;    // tax on glasses
            double glassesAfterTax$;    // cost of glasses after tax
            
            double totalEnvelopesCost$;  // total cost of envelopes
            double envelopesTax$;    // tax on envelopes
            double envelopesAfterTax$;  // cost of envelopes after tax
            
            double totalTax$;   //  total tax on the purchase
            double totalCostNoTax$;  // total cost without tax
            double totalCostWithTax$;    // total cost including tax
            
//          arithmetic
            totalSocksCost$=nSocks*sockCost$;    // total cost of socks calculation 
            socksTax$=taxPercent*totalSocksCost$;    // calculation for the tax on socks
            socksAfterTax$=socksTax$+totalSocksCost$;   //calc for cost of socks after tax
            
            totalGlassesCost$=nGlasses*glassCost$;   // total cost of glasses calculation
            glassesTax$=taxPercent*totalGlassesCost$;   // calculation for tax on glasses
            glassesAfterTax$=glassesTax$+totalGlassesCost$; //calc for cost of glasses after tax
            
            totalEnvelopesCost$=nEnvelopes*envelopeCost$;    // total cost of envelopes calculation 
            envelopesTax$=taxPercent*totalEnvelopesCost$;   // calculation for tax on envelopes
            envelopesAfterTax$=envelopesTax$+totalEnvelopesCost$;   // calc for cost of envelopes after tax
            
            totalCostNoTax$=totalSocksCost$+totalGlassesCost$+totalEnvelopesCost$;   //total cost without tax calculation
            totalTax$=taxPercent*totalCostNoTax$;    // calculation of total tax
            totalCostWithTax$=totalTax$+totalCostNoTax$;    // calculation for tax plus total without tax

//          decimal fixes
            totalSocksCost$ = Math.round(totalSocksCost$*100.0)/100.0;
            socksTax$ = Math.round(socksTax$*100.0)/100.0;
            socksAfterTax$ = Math.round(socksAfterTax$*100.0)/100.0;
            
            totalGlassesCost$ = Math.round(totalGlassesCost$*100.0)/100.0;
            glassesTax$ = Math.round(glassesTax$*100.0)/100.0;
            glassesAfterTax$ = Math.round(glassesAfterTax$*100.0)/100.0;
            
            totalEnvelopesCost$ = Math.round(totalEnvelopesCost$*100.0)/100.0;
            envelopesTax$ = Math.round(totalEnvelopesCost$*100.0)/100.0;
            envelopesAfterTax$ = Math.round(envelopesAfterTax$*100.0)/100.0;
            
            totalCostNoTax$ = Math.round(totalCostNoTax$*100.0)/100.0;
            totalTax$ = Math.round(totalTax$*100.0)/100.0;
            totalCostWithTax$ = Math.round(totalCostWithTax$*100.0)/100.0;

//          print results of each calculation
            System.out.println("The total cost of the socks before tax is $"+totalSocksCost$);
            System.out.println("The tax on socks is $"+socksTax$);
            System.out.println("The total cost of the socks after tax is $"+socksAfterTax$);
            
            System.out.println("The total cost of the glasses before tax is $"+totalGlassesCost$);
            System.out.println("The tax on the glasses is $"+glassesTax$);
            System.out.println("The total cost of the glasses after tax is $"+glassesAfterTax$);
            
            System.out.println("The total cost of the envelopes before tax is $"+totalEnvelopesCost$);
            System.out.println("The tax on the envelopes is $"+envelopesTax$);
            System.out.println("The total cost of the envelopes after tax is $"+envelopesAfterTax$);
            
            System.out.println("The total cost, not including tax, is $"+totalCostNoTax$);
            System.out.println("The total tax on the purchase is $"+totalTax$);
            System.out.println("The total cost of the purhcase, including tax, is $"+totalCostWithTax$);
            
        }
    }   