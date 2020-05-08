package ejercicio17programacionfuncional.e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        ejercicio19();
        ejercicio20();
        ejercicio21();
        ejercicio22();
        ejercicio23();
        ejercicio24();
        ejercicio25();
        ejercicio26();
        ejercicio27();
    }

    private static void ejercicio1() {

        //obtener la cantidad de usuarios con edad mayor a 18
        List<User> users = getUsers();

        //imperativo
        int cantidad = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() > 18)
                cantidad++;
        }
        System.out.println("Usuarios con edad mayor a 18: " + cantidad);

        //declarativo
        long resultado = users.stream().filter(user -> user.getAge() > 18).count();
        System.out.println("Usuarios con edad mayor a 18: " + resultado);
    }

    private static void ejercicio2() {
        List<User> users = getUsers();
        long cantidad = users.stream().count();
        System.out.println("tamaño de la lista: " + cantidad);

        long mayoresA18 = users.stream().filter(user -> user.getAge() > 18).count();
        System.out.println("Usuarios mayores a 18: " + mayoresA18);
    }

    private static void ejercicio3() {
        /**obtener usuarios con edad > 18 y letra inicial de su nombre sea C*/
        List<User> users = getUsers();
        long cantidad = users.stream()
                .filter(user -> user.getAge() > 18 && user.getUsername().startsWith("C"))
                .count();
        System.out.println("obtener usuarios con edad > 18 y letra inicial de su nombre sea C: " + cantidad);
    }

    private static void ejercicio4() {
        List<User> users = getUsers();
        /**obtener usuarios con edad mayor a 20 y almacenarlos en una nueva lista*/
        List<User> usersAge20 = users.stream().filter(user -> user.getAge() > 20).collect(Collectors.toList());
        System.out.println(usersAge20);
    }

    private static void ejercicio5() {
        /**Imprimir el cuadrado de todos los numeros de la lista*/
        List<Integer> numbers = getNumbers();
        List<Integer> newNumbers = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(newNumbers);
    }

    private static void ejercicio6() {
        /**Generar una lista de números tipo String apartir de la lista ya existente.*/
        List<Integer> numbers = getNumbers();
        List<String> stringsNumbers = numbers.stream().map(number -> "'" + number + "'").collect(Collectors.toList());
        System.out.println(stringsNumbers);
    }

    private static void ejercicio7() {
        /**Imprimir en consola los strings con todas sus letras en mayúsculas.*/
        List<String> strings = Arrays.asList("hola", "mundo", "de", "los", "streams");
        List<String> newStrings = strings.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
        ;
        System.out.println(newStrings);
    }

    private static void ejercicio8() {
        /**FlatMap -> combina multiples colecciones y genera una unica*/
        List<String> strings1 = Arrays.asList("abc", "def", "ghi");
        List<String> strings2 = Arrays.asList("jkl", "mnl", "opq");
        List<String> strings3 = Arrays.asList("rst", "uvw", "xyz");

        List<String> complete = Stream.of(strings1, strings2, strings3).flatMap(element -> element.stream()).collect(Collectors.toList());
        System.out.println(complete);
    }

    private static void ejercicio9() {
        List<Integer> numbers = getNumbers();
        numbers.stream()
                .map(number -> number * number)
                .forEach(number -> System.out.print(number + " "));
    }

    private static void ejercicio10() {
        System.out.println();
        /**resolver si existen calificaciones reprobadas con el metodo COUNT y el metodo ANYMATCH*/

        List<Integer> calificaciones = getCalificaciones();

        /**COUNT*/
        long result = calificaciones.stream().filter(calif -> calif < 6).count();
        if (result > 0) System.out.println("Con calificaciones reprobadas");
        else System.out.println("No reprobo alumno");

        /**ANYMATCH*/
        boolean resultado = calificaciones.stream()
                .anyMatch(calificacion -> calificacion < 6);
        System.out.println("reprobo materias? " + resultado);
    }

    private static void ejercicio11() {
        /**encontrar un usuario con edad 56*/
        List<User> users = getUsers();
        User user = users.stream().filter(myUser -> myUser.getAge() == 56).findAny().orElse(null); /**orElse devuelve valor default en caso de no pasar el filtro*/
        if (user != null) System.out.println("->" + user.getUsername());
        else System.out.println("No se encontraron resultados");
    }

    private static void ejercicio12() {
        List<Integer> calificaciones = getCalificaciones();

        /**Sumar todas las calificaciones con el metodo SUM*/
        int suma = calificaciones.stream().mapToInt(calif -> calif /**es necesario pasar a int*/).sum();
        System.out.println("La suma de calificaciones es: " + suma);

        /**obtener promedio de la lista de calificaciones con el metodo AVERAGE*/
        double promedio = calificaciones.stream().mapToInt(calif -> calif/**es necesario pasar a int*/).average().orElse(0);
        System.out.println("Promedio: " + promedio);

        /**obtener la calificacion mas baja con el metodo MIN*/
        int min = calificaciones.stream().mapToInt(calif -> calif/**es necesario pasar a int*/).min().getAsInt();
        System.out.println("La calificacion mas baja es : " + min);

        /**obtener la calificacion mas alta con el metodo MAX*/
        int max = calificaciones.stream().mapToInt(calif -> calif/**es necesario pasar a int*/).max().getAsInt();
        System.out.println("La calificacion mas alta es: " + max);
    }

    private static void ejercicio13() {
        /**Ocupar el metodo REDUCE para obtener la suma de todos los elementos  (un único valor de una coleccion de valores)*/
        List<Integer> valores = getNumbers();
        int suma = valores.stream()
                .reduce( /**valor inicial del acumulador*/0,  /**lambda*/(acumulador, elemento) ->  /**el elemento que se retorna se suma al acumulador*/acumulador + elemento);
        System.out.println("suma es: " + suma);

        /**concatenar las cadenas utilizando un |*/
        List<String> lenguajes = Arrays.asList("C", "Kotlin", "Java", "C++");
        String result = lenguajes.stream().reduce("", (acumulador, lenguaje) -> acumulador + lenguaje + "|");
        System.out.println(result);
    }

    private static void ejercicio14() {
        /**imprimir todos los valores unicos de la lista utilizando el método DISTINCT*/
        List<String> nombres = Arrays.asList("Carlos", "Diana", "Luis", "Daniela", "Carlos");
        nombres.stream().distinct().forEach((nombre) -> System.out.print(nombre + ","));

    }

    private static void ejercicio15() {
        System.out.println();
        /**ordenar los elementos de forma ascendente de la coleccion utilizando el metodo SORTED*/
        List<Integer> numbers = Arrays.asList(6, 5, 4, 7, 8, 9, 0, 1, 2, 3);
        List<Integer> ordenados = numbers.stream()
                .sorted() /**Ordena elementos de forma asendente*/
                .collect(Collectors.toList());
        System.out.println("Desordenados -> " + numbers + "         Ordenados -> " + ordenados);

        /**ordenar los elementod de forma descendente utlizando el método SORTED*/
        List<Integer> descendente = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Desordenados -> " + numbers + "         Ordenados -> " + descendente);
    }

    private static void ejercicio16() {
        /**mostrar los 3 libros mas vendidos y ordenar por copias*/
        List<Libro> libros = getLibros();

        Comparator<Libro> comparator = Comparator.comparing(book -> book.getCopias());
        List<Libro> resultado = libros.stream().sorted(comparator).limit(3).collect(Collectors.toList());

        Comparator<Libro> comparator2 = Comparator.comparing(book -> book.getCopias());
        List<Libro> resultado2 = libros.stream().sorted(comparator2.reversed()).limit(3).collect(Collectors.toList());

        System.out.println(resultado.toString() + "       " + resultado2);
    }

    private static void ejercicio17() {
        List<Libro> libros = getLibros();
        Comparator<Libro> comparator = null;

        if (libros.size() > 3) comparator = Comparator.comparing(libro -> libro.getCopias());
        else comparator = Comparator.comparing(libro -> libro.getTitulo());

        List<Libro> resultados = libros.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(resultados.toString());
    }

    private static void ejercicio18() {
        /**obtener el titulo del tercer y segundo libro mas vendido utilizando el metodo SKIP*/
        List<Libro> libros = getLibros();
        Comparator<Libro> comparator = Comparator.comparing(libro -> libro.getCopias());
        List<Libro> results = libros.stream().sorted(comparator).limit(3).skip(1).collect(Collectors.toList());
        System.out.println(results.toString());
    }

    private static void ejercicio19() {
        /**Obtener la cantidad de cursos con una duración mayor a 5 horas.*/
        List<Curso> cursos = getCursos();
        long cantidad = cursos.stream().filter(curso -> curso.getDuracion() > 5).count();
        System.out.println("cursos mayores a 5 horas: " + cantidad);
    }

    private static void ejercicio20() {
        /**Obtener la cantidad de cursos con una duración menor a 2 horas.*/
        long cantidad = getCursos().stream().filter(curso -> curso.getDuracion() < 2).count();
        System.out.println("cursos menos a 2 horas de duración: " + cantidad);
    }

    private static void ejercicio21() {
        /**Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50*/
        getCursos().stream()
                .filter(curso -> curso.getVideos() > 50)
                .forEach((curso) -> System.out.print(curso.getTitulo() + " "));
    }

    private static void ejercicio22() {
        System.out.println();
        /**Mostrar en consola el título de los 3 cursos con mayor duración*/
        Comparator<Curso> comparator = Comparator.comparing(curso -> curso.getDuracion());
        getCursos().stream().sorted(comparator.reversed()).limit(3).forEach(curso -> System.out.print(curso.getTitulo() + " "));
    }

    private static void ejercicio23() {
        /**Mostrar en consola la duración total de todos los cursos.*/
        double sumaTotal = getCursos().stream().mapToDouble(curso -> curso.getDuracion()).sum();
        System.out.println("Duración de todos los cursos: " + sumaTotal);
    }

    private static void ejercicio24() {
        /**Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.*/
        List<Curso> cursos = getCursos();
        double promedio = cursos.stream().mapToDouble(curso -> curso.getDuracion()).average().orElse(-1);
        cursos.stream().filter(curso -> curso.getDuracion() > promedio).forEach(curso -> System.out.print(curso.getTitulo() + " "));
    }

    private static void ejercicio25() {
        /**Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500*/
        getCursos().stream().filter(curso -> curso.getAlumnos() < 500).forEach(curso -> System.out.print(curso.getTitulo() + " "));
    }

    private static void ejercicio26() {
        /**Obtener el curso con mayor duración*/
        Comparator<Curso> comparator = Comparator.comparing(curso -> curso.getDuracion());
        getCursos().stream().sorted(comparator.reversed()).limit(1).forEach(curso -> System.out.println(curso.getTitulo()));
    }

    private static void ejercicio27() {
        /**Crear una lista de Strings con todos los titulos de los cursos.*/
        List<String> strings=getCursos().stream().map(curso -> curso.getTitulo()).collect(Collectors.toList());
        System.out.println(strings);
    }

    private static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Usuario 1", 34));
        users.add(new User("Usuario 2", 22));
        users.add(new User("Usuario 3", 12));
        users.add(new User("Usuario 4", 12));
        users.add(new User("Usuario 5", 56));
        users.add(new User("Carlos", 56));
        users.add(new User("Usuario", 56));
        users.add(new User("Carmen", 5));
        return users;
    }

    private static List<Integer> getCalificaciones() {
        List<Integer> numbers = Arrays.asList(10, 6, 6, 6, 4, 5, 6, 7, 8, 9);
        return numbers;
    }

    private static List<Integer> getNumbers() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        return numbers;
    }

    private static List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Libro 1", 11));
        libros.add(new Libro("Libro 2", 132));
        libros.add(new Libro("Libro 3", 200));
        libros.add(new Libro("Libro 4", 500));
        libros.add(new Libro("Libro 5", 5));
        libros.add(new Libro("Libro 6", 12));
        libros.add(new Libro("Libro 7", 1000));
        return libros;
    }

    private static List<Curso> getCursos() {
        System.out.println();
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));
        return cursos;
    }
}
