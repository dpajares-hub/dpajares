package clase;

public class Usuario {
    // ... implementación de la clase Usuario ...
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;  

    }

    public void login() {
        // Lógica para iniciar sesión
        System.out.println("Usuario " + username + " ha iniciado sesión.");
    }

    public void logout() {
        // Lógica para cerrar sesión
        System.out.println("Usuario " + username + " ha cerrado sesión.");
    }
}
