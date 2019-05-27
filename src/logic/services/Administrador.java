package logic.services;

import java.util.HashMap;
import java.util.Map;

public class Administrador {
    private static Map<Integer, String> credenciales = new HashMap<>();

    public static void agregarUsuario(Integer id, String password) {
        credenciales.put(id, password);
    }

    public static boolean validar(Integer id, String password) {
        if (!(credenciales.containsKey(id)))
            return false;
        return credenciales.get(id).equals(password);
    }
}
