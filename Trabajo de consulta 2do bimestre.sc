
  val students: List[(String, Int, Double, Char)] = List(
    ("Andrés", 10, 20, 'M'),
    ("Ana", 11, 19, 'F'),
    ("Luis", 9, 18, 'M'),
    ("Cecilia", 9, 18, 'F'),
    ("Katy", 11, 15, 'F'),
    ("Jorge", 8, 17, 'M'),
    ("Rosario", 11, 18, 'F'),
    ("Nieves", 10, 20, 'F'),
    ("Pablo", 9, 19, 'M'),
    ("Daniel", 10, 20, 'M')
  )

  val filtarcionEstudiantes: List[(String, Double)] = students.filter{ case (_, _, nota, genero) =>
    genero == 'F' && nota >= 18 }.map { case (nombre, _, nota, _) => (nombre, nota)

  }



  filtarcionEstudiantes.foreach { case (nombre, nota) =>  print(nombre, nota)}
