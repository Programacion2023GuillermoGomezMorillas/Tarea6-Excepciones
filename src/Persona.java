public class Persona {

    private String dni;
    private int edad;
    private String nombre;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        String regrexDni = "[0-9]{8}[a-zA-Z]";
        if (!dni.matches(regrexDni)) {
            throw new IllegalArgumentException("El DNI no existe");
        }
        else if (comprobarDni(dni)){
        }
            this.dni = dni;
    }

    private boolean comprobarDni(String dni) {
        boolean isTrue = false;
        String cadenaComprobacion = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra = String.valueOf(dni.charAt(8));
        int numero = Integer.parseInt(dni.substring(0, 8));
        if ((numero % 23) != cadenaComprobacion.indexOf(letra)) {
            throw new IllegalArgumentException("El dni no es correcto");
        }else
            isTrue = true;
        return isTrue;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 1) {
            throw new IllegalArgumentException("La edad tiene que ser mayor que 0");
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String regrex1 = "\\w+\\s\\w+\\s\\w+";

        if (nombre.matches(regrex1)) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Tiene que ser nombre y apellidos");
        }


    }
}

