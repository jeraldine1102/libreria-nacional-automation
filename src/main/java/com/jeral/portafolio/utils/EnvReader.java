package com.jeral.portafolio.utils;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EnvReader {
    private static final Dotenv dotenv = Dotenv.load();

    // Constructor privado para evitar instanciación
    private EnvReader() {
        throw new UnsupportedOperationException("Clase de utilidades, no debe ser instanciada.");
    }

    public static String getUseremail() {
        return dotenv.get("USER_EMAIL");
    }

    public static String getPassword() {
        return dotenv.get("USER_PASSWORD");
    }

    public static String getEmailInvalid() {
        return dotenv.get("USER_EMAIL_INVALID");
    }

    public static String getPasswordInvalid() {
        return dotenv.get("USER_PASSWORD_INVALID");
    }

    private static final List<String> LIBROS = Arrays.asList("Juvenil", "Terror", "Romance", "Suspenso", "Historia");

    private static final Random RANDOM = new Random();

    public static String getLibroAleatorio() {
        return LIBROS.get(RANDOM.nextInt(LIBROS.size()));
    }


}
