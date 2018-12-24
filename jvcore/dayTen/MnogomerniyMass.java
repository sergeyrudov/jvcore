package jvcore.jvcore.dayTen;

public class MnogomerniyMass {
    public static void main(String[] args) {
        String[][] data = {{"China", "Beijing", "13540000"},
                {"India", "New Deli", "12000000"},
                {"USA", "Washington", "10000000"},
                {"Indonezia", "Jakarta", "800000"},
                {"Brazil", "Brasilia", "6000000"},
                {"Pakistan", "Islambad", "500000"}};
        getPopulation(data);
    }
    static void getPopulation(String[][]data){
        long sum = 0;
        for (int i=0;i<data.length;i++){
            sum += Long.parseLong(data[i][2]);
        }
        System.out.println(sum);
    }
}
