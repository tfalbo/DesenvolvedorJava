class FatorialGrande {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int i = 1; i < 21; i++) {
            fatorial *= i;
            System.out.println("Fatorial de "+i+ " = " +fatorial);
        }
    }
}
