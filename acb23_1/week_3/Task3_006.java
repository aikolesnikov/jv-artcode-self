//package week_3;
//
//
//
//public class Task3_006 {
//
//    private static void printMatrixS(String[][] m) {
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++)
//                Entity.out.print(m[i][j] + " ");
//            Entity.out.println();
//        }
//    }
//
//    private static String[][] filterBySalary(String m[][], int salMin, int salMax){
//
//        int filterX=0;
//
//        for (int i=0; i<m.length; i++){
//            if (Integer.parseInt(m[i][5]) >= salMin && Integer.parseInt(m[i][5])<=salMax){
//                filterX++;
//            }
//        }
//
//        String[][] mFilter = new String[filterX][5];
//
//        filterX=0;
//        for (int i=0; i<m.length; i++){
//            if (Integer.parseInt(m[i][5]) >= salMin && Integer.parseInt(m[i][5])<=salMax){
//                mFilter[filterX++] = m[i];
//            }
//        }
//
//        return mFilter;
//    }
//
//    private static String[][] filterByProperty(String m[][], String prop,
//                                               int pMin, int pMax){
//
//        int filterProperty = 0;
//        for (int i=0; i<m[1].length; i++){
//            if (m[1][i].equals(prop){
//                filterProperty=i;
//                break;
//            }
//        }
//
//        int filterX=0;
//
//        for (int i=0; i<m.length; i++){
//            if (Integer.parseInt(m[i][filterProperty]) >= pMin && Integer.parseInt(m[i][filterProperty])<=pMax){
//                filterX++;
//            }
//        }
//
//        String[][] mFilter = new String[filterX][5];
//
//        filterX=0;
//        for (int i=0; i<m.length; i++){
//            if (Integer.parseInt(m[i][5]) >= salMin && Integer.parseInt(m[i][5])<=salMax){
//                mFilter[filterX++] = m[i];
//            }
//        }
//
//        return mFilter;
//    }
//
//
//    public static void main(String[] args) {
//
//        String[][] ms = new String[][]
//                {
//                        {"Name", "Age", "Eng", "Lang", "Exp", "Sal"},
//                        {"Ivan", "30", "4", "Java", "2", "1000"},
//                        {"Maria", "35", "5", "Java", "3", "1200"},
//                        {"John", "25", "6", "C++", "3", "1200"},
//                };
//
//        Entity.out.println("Matrix initial:");
//        printMatrixS(ms);
//        Entity.out.println();
//
//        Entity.out.println();
//
//        Entity.out.println("Matrix filtered:");
//        printMatrixS(filterBySalary(ms, 900, 1100));
//    }
//}
