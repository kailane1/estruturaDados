package ifma.lista02;

public class lista02 {

    private static final int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {
        q01();
        q02();
        q03();
        q04();
        q05();
        q06();
        q07();
        q08();
        q09();
        q10();
        q11();
        q12();
        q13();
        q14();
        q15();
        q16();
        q17();
        q18();
    }

    public static void q01() {
        System.out.println("Questão 1: Matriz com diagonal principal substituída por ZERO");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void q02() {
        System.out.println("Questão 2: Matriz com diagonal secundária substituída por ZERO");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void q03() {
        System.out.println("Questão 3: Elementos da diagonal secundária");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println("\n");
    }

    public static void q04() {
        System.out.println("Questão 4: Soma dos elementos da diagonal secundária");
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][2 - i];
        }
        System.out.println("Soma: " + soma + "\n");
    }

    public static void q05() {
        System.out.println("Questão 5: Elementos da diagonal secundária e abaixo");
        for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    public static void q06() {
        System.out.println("Questão 6: Média dos elementos da diagonal secundária e abaixo");
        int soma = 0, count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j < 3; j++) {
                soma += matriz[i][j];
                count++;
            }
        }
        System.out.println("Média: " + (double) soma / count + "\n");
    }

    public static void q07() {
        System.out.println("Questão 7: Elementos abaixo da diagonal secundária");
        for (int i = 1; i < 3; i++) {
            for (int j = 3 - i; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    public static void q08() {
        System.out.println("Questão 8: Maior valor abaixo da diagonal secundária");
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < 3; i++) {
            for (int j = 3 - i; j < 3; j++) {
                max = Math.max(max, matriz[i][j]);
            }
        }
        System.out.println("Maior valor: " + max + "\n");
    }

    public static void q09() {
        System.out.println("Questão 9: Elementos da diagonal secundária e acima");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    public static void q10() {
        System.out.println("Questão 10: Menor valor da diagonal secundária e acima");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 2 - i; j++) {
                min = Math.min(min, matriz[i][j]);
            }
        }
        System.out.println("Menor valor: " + min + "\n");
    }

    public static void q11() {
        System.out.println("Questão 11: Elementos acima da diagonal secundária");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 1 - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    public static void q12() {
        System.out.println("Questão 12: Produto dos elementos acima da diagonal secundária");
        int produto = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 1 - i; j++) {
                produto *= matriz[i][j];
            }
        }
        System.out.println("Produto: " + produto + "\n");
    }

    public static void q13() {
        System.out.println("Questão 13: Matriz B com regras de par/quadrado e ímpar/cubo");
        int[][] matrizB = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = (matriz[i][j] % 2 == 0) ? matriz[i][j] * matriz[i][j] : matriz[i][j] * matriz[i][j] * matriz[i][j];
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void q14() {
        System.out.println("Questão 14: Matriz girada 90°");
        int[][] matriz90 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz90[j][2 - i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz90[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void q15() {
        System.out.println("Questão 15: Matriz girada 180°");
        int[][] matriz180 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz180[2 - i][2 - j] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz180[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void q16() {
        System.out.println("Questão 16: Matriz girada 270°");
        int[][] matriz270 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz270[2 - j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz270[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void q17() {
        System.out.println("Questão 17: Elementos destacados em vermelho");
        // Imprimindo a matriz com os elementos destacados em vermelho
        System.out.println("[1, 2, 3]");
        System.out.println("[4, 5, 6]");
        System.out.println("[7, 8, 9]");
        System.out.println("Elementos destacados: 1, 5, 9");
        System.out.println();
    }

    public static void q18() {
        System.out.println("Questão 18: Matriz invertida");
        int[][] matrizInvertida = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizInvertida[i][j] = matriz[2 - i][2 - j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizInvertida[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}