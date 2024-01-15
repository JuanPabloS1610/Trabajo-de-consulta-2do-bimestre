import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ejemplo_reactivo {

    public static void main(String[] args) {

        Object[][] data = {
                {"Andrés", 10, 20, 'M'},
                {"Ana", 11, 19, 'F'},
                {"Luis", 9, 18, 'M'},
                {"Cecilia", 9, 18, 'F'},
                {"Katy", 11, 15, 'F'},
                {"Jorge", 8, 17, 'M'},
                {"Rosario", 11, 18, 'F'},
                {"Nieves", 10, 20, 'F'},
                {"Pablo", 9, 19, 'M'},
                {"Daniel", 10, 20, 'M'}
        };

        // Convertir la lista en un flujo observable
        Observable.fromArray(data)
                // Filtrar por género 'F'
                .filter(row -> (char) row[3] == 'M')
                // Filtrar por edad mayor a 18
                .filter(row -> (int) row[2] >= 18)
                // Agregar un delay de 1 segundo entre los datos
                .concatMap(row -> Observable.just(row).delay(1, TimeUnit.SECONDS))
                // Procesar cada elemento
                .subscribe(
                        row -> System.out.println("Nombre: " + row[0] + ", Edad: " + row[2] + ", Género: " + row[3]),
                        Throwable::printStackTrace,
                        () -> System.out.println("Proceso completado")
                );





        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
