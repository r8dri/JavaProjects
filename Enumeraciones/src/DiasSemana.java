public enum DiasSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES;

    public static void imprimirDia(DiasSemana dia) {
        switch (dia) {
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            case MIERCOLES -> System.out.println("Tercer dia de la semana");
            case JUEVES -> System.out.println("Cuarto dia de la semana");
            case VIERNES -> System.out.println("Quinto dia de la semana");
            case null, default -> System.out.println("Dia no valido");
        }
    }
}
