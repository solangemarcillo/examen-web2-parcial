// se llama el datos por medio de la Id function añadir() {
    letcedula = document.getElementById("cedula").value;
    let apellidos = document.getElementById("apellidos").value;
    let nombres = document.getElementById("nombres").value;
    let direccion = document.getElementById("direccion").value;
    let semestre = document.getElementById("semestre").value;
    let paralelo = document.getElementById("paralelo").value;
    let correo = document.getElementById("correo").value;

    // se validan los datos 
    if (cedula.length == 0 || apellidos.length == 0 || nombres.length == 0 || direccion.length == 0 || semestre.length == 0 || paralelo.length == 0 || correo.length == 0) {
        alert("llenar todos los campos ");
    }
    //se hace el llamado de los datos para guardarlo como archivo JSON
    else {
        let datos = {
            'cedula': cedula,
            'apellidos': apellidos,
            'nombres': apellidos,
            'direccion': direccion,
            'semestre': semestre,
            'paralelo': paralelo,
            'correo': correo
        };
        localStorage.setItem('usuario', JSON.stringify(datos));
    }
}
