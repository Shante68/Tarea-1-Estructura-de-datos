import java.io.*;
import java.util.*;

public class AnalisisRedes {

    private static final String NOMBRE_ARCHIVO = "datos_redes_sociales.txt";

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" ANÁLISIS DE REDES SOCIALES");
     
            System.out.println("\n2. Calcular diferencia de visualizaciones en YouTube");
            System.out.print("   > Ingrese el mes de inicio: ");
            String mesInicioYoutube = scanner.nextLine().trim().toUpperCase();
            System.out.print("   > Ingrese el mes de fin (hasta Junio): ");
            String mesFinYoutube = scanner.nextLine().trim().toUpperCase();

            try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
                String linea = br.readLine(); 
                if (linea == null) {
                    System.out.println("El archivo está vacío.");
                    return;
                }

                List<String> encabezados = Arrays.asList(linea.toUpperCase().split(","));

        
                while ((linea = br.readLine()) != null) {
                    String[] fila = linea.split(",");
                    String redSocial = fila[0].trim();
                    String concepto = fila[1].trim();

                    
                    if (redSocial.equalsIgnoreCase("TWITTER") && concepto.toLowerCase().contains("seguidores")) {
                        int idxEnero = encabezados.indexOf("ENERO");
                        int idxJunio = encabezados.indexOf("JUNIO");
                        if (idxEnero != -1 && idxJunio != -1) {
                            int followersEnero = parseIntLimpio(fila[idxEnero]);
                            int followersJunio = parseIntLimpio(fila[idxJunio]);
                            System.out.println("\n1. Diferencia de Followers en Twitter (Enero-Junio): " + (followersJunio - followersEnero));
                        }
                    }

                    
                    if (redSocial.equalsIgnoreCase("YOUTUBE") && concepto.equalsIgnoreCase("VISUALIZACIONES")) {
                        int idxInicio = encabezados.indexOf(mesInicioYoutube);
                        int idxFin = encabezados.indexOf(mesFinYoutube);
                        if (idxInicio != -1 && idxFin != -1) {
                            int vistasInicio = parseIntLimpio(fila[idxInicio]);
                            int vistasFin = parseIntLimpio(fila[idxFin]);
                            System.out.println("   > Diferencia de visualizaciones en YouTube (" + mesInicioYoutube + "-" + mesFinYoutube + "): " + (vistasFin - vistasInicio));
                        } else {
                            System.out.println("   > Error: No se encontraron los meses para el cálculo de YouTube.");
                        }
                    }

                    
                    
                    if ((redSocial.equalsIgnoreCase("FACEBOOK") || redSocial.equalsIgnoreCase("TWITTER")) && (concepto.equalsIgnoreCase("SEGUIDORES") || concepto.equalsIgnoreCase("SEGUIDORES (FOLLOWERS)"))) {
                        String[] mesesCrecimiento = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO"};
                        List<Integer> valores = new ArrayList<>();
                        for (String mes : mesesCrecimiento) {
                            int idx = encabezados.indexOf(mes);
                            if (idx != -1 && idx < fila.length) {
                                valores.add(parseIntLimpio(fila[idx]));
                            }
                        }

                        if (valores.size() > 1) {
                            int crecimientoTotal = valores.get(valores.size() - 1) - valores.get(0);
                            double promedio = (double) crecimientoTotal / (valores.size() - 1);
                            System.out.printf("\n3. Promedio de crecimiento de %s (Ene-Jun): %.2f\n", redSocial, promedio);
                        }
                    }

                   
                    if (concepto.toLowerCase().contains("me gusta")) {
                        long sumaTotal = 0;
                        int mesesContados = 0;
                        
                        for (int i = 3; i < fila.length; i++) {
                            try {
                                
                                int valor = parseIntLimpio(fila[i]);
                                if (valor > 0) {
                                    sumaTotal += valor;
                                    mesesContados++;
                                }
                            } catch (NumberFormatException e) {
                                
                            }
                        }
                        if (mesesContados > 0) {
                            double promedio = (double) sumaTotal / mesesContados;
                            System.out.printf("\n4. Promedio de 'Me Gusta' en %s: %.2f\n", redSocial, promedio);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo '" + NOMBRE_ARCHIVO + "': " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                e.printStackTrace();
            }
        } 
    }

   
    private static int parseIntLimpio(String valor) {
        
        return Integer.parseInt(valor.trim().replace(",", "").replace("\"", ""));
    }
}
