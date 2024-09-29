package com.campusdual.classroom;

public class Exercise19 {

    private static String getTridimensionalString(int[][][] intArrayTri, int[][] flatMatrix) {

        int rows = intArrayTri[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(stringFlatMatrixRow(flatMatrix, i));
            sb.append("   →   ");
            sb.append(stringTriMatrixRow(intArrayTri, i));
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();

    }

    private static String stringTriMatrixRow(int[][][] intArrayTri, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArrayTri.length-1; i++){
            sb.append(getUnidimensionalString(intArrayTri[i][row]));
            sb.append("   ");
        }
        sb.append(getUnidimensionalString(intArrayTri[intArrayTri.length-1][row]));

        return sb.toString();
    }

    private static String stringFlatMatrixRow(int[][] flatMatrix, int row) {
        return getUnidimensionalString(flatMatrix[row]);
    }

    public static String getTridimensionalString(int[][][] intArrayTri) {
        int[][] flatMatrix = flatTridimensionalArray(intArrayTri);
        return getTridimensionalString(intArrayTri, flatMatrix);
    }

    //TODO
    public static int[][] flatTridimensionalArray(int[][][] intArrayTri) {
        int rows = intArrayTri[0].length;
        int columns = intArrayTri[0][0].length;
        int[][] flatMatrix = new int[rows][columns];

        for (int i = 0; i < intArrayTri.length; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    flatMatrix[j][k] += intArrayTri[i][j][k];
                }
            }
        }
        return flatMatrix;
    }


    // TODO
    public static String getBidimensionalString(int[][] intArrayBi) {
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < intArrayBi.length; i++) {
            for (int j = 0; j < intArrayBi[i].length; j++) {
                cadena.append(intArrayBi[i][j]);
                if (j < intArrayBi[i].length - 1) {
                    cadena.append(" ");
                }
            }
            if (i < intArrayBi.length - 1) {
                cadena.append("\n");
            }
        }
        return cadena.toString();
    }

    // TODO
    public static String getUnidimensionalString(int[] uniArray) {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < uniArray.length; i++) {
            if(i< uniArray.length-1) {
                cadena.append(uniArray[i] + " ");
            }else{
                cadena.append(uniArray[i]);
            }
        }
        return cadena.toString();
    }

    // TODO
    public static int[] createAndPopulateUnidimensionalArray(int columns) {
        int [] numerosUni = new int[columns];
        for (int i = 0; i < numerosUni.length; i++) {
            numerosUni[i] = (i+1);
        }
        return numerosUni;
    }

    // TODO
    public static int[][] createAndPopulateBidimensionalArray(int rows, int columns) {
        int [][] numerosDos = new int[rows][columns];
        int acu = 1;
        for (int i = 0; i < numerosDos.length; i++) {
            for (int j = 0; j < numerosDos[i].length; j++) {
                numerosDos[i][j] = acu++;
                System.out.println("Prueba ["+i+"]["+j+"]: "+numerosDos[i][j]);
            }
        }
        return numerosDos;
    }

    // TODO
    public static int[][][] createAndPopulateTridimensionalArray(int depth, int rows, int columns) {
        int [][][] numerosTres = new int[depth][rows][columns];
        int acu = 1;
        for (int i = 0; i < numerosTres.length; i++) {
            for (int j = 0; j < numerosTres[i].length; j++) {
                for (int k = 0; k < numerosTres[j].length; k++) {
                    numerosTres[i][j][k] = acu++;
                    System.out.println("Prueba ["+i+"]["+j+"]["+k+"]: "+numerosTres[i][j][k]);
                }
            }
        }
        return numerosTres;
    }

    public static void main(String[] args) {
        int[] uniArray = createAndPopulateUnidimensionalArray(5);
        System.out.println(getUnidimensionalString(uniArray));
        System.out.println("===================");
        int[][] intArrayBi = createAndPopulateBidimensionalArray(3, 3);
        System.out.println(getBidimensionalString(intArrayBi));
        System.out.println("===================");
        int[][][] intArrayTri = createAndPopulateTridimensionalArray(1, 1, 1);
        System.out.println(getTridimensionalString(intArrayTri));
    }

}
