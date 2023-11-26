package Day_11;
public class Day_49 {
    public static void main(String[] args) {
                      
        LoopLuar: // Label untuk loop luar
        for (int luar = 1; luar <= 5; luar++) {
            LoopDalam: // Label untuk loop dalam
            for (int dalam = 1; dalam <= 5; dalam++) {
                System.out.println("Luar = " + luar + ", Dalam = " + dalam);

                // Contoh kondisi untuk break loop
                if (luar == 4 && dalam == 3) {
                    break LoopLuar; // Break loop luar berdasarkan label
                }
            }
        }
    }
}

    
