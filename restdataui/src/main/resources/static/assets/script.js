var baseURL = "http://localhost:8080";

function kisileriYukle() {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("GET", baseURL + "/kisiler", true);
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
            var kisiler = JSON.parse(xmlHttp.responseText);
            var tableStart = "<table><tr><th>ID</th><th>AD</th><th>SOYAD</th><th>YAS</th></tr>";
            var tableMiddle = "";
            for (var i = 0; i < kisiler.length; i++) {
                tableMiddle+= "<tr>" +
                    "<td>" + kisiler[i].id + "</td>" +
                    "<td>" + kisiler[i].name + "</td>" +
                    "<td>" + kisiler[i].surname + "</td>" +
                    "<td>" + kisiler[i].yas + "</td></tr>";
            }
            var tableEnd = "</table>";
            document.getElementById("kisiListesi").innerHTML = tableStart + tableMiddle + tableEnd;
        }
    };
    xmlHttp.send();
}

function kisiEkle() {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("POST", baseURL + "/kisiekle", true);
    xmlHttp.setRequestHeader('Content-Type', 'application/json');
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
            alert(xmlHttp.responseText);
            kisileriYukle();
        }
    };
    const params = {
        name : document.getElementById("name").value,
        surname : document.getElementById("surname").value,
        yas : document.getElementById("yas").value
    }
    xmlHttp.send(JSON.stringify(params));
}

function kisiGuncelle() {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("POST", baseURL + "/kisiguncelle", true);
    xmlHttp.setRequestHeader('Content-Type', 'application/json');
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
            alert(xmlHttp.responseText);
            kisileriYukle();
        }
    };
    const params = {
        id : document.getElementById("guncel_id").value,
        name : document.getElementById("guncel_name").value,
        surname : document.getElementById("guncel_surname").value,
        yas : document.getElementById("guncel_yas").value
    }
    xmlHttp.send(JSON.stringify(params));
}

function kisiSil() {
    var xmlHttp = new XMLHttpRequest();
    var paramString = "?id=" + document.getElementById("sil_id").value;
    xmlHttp.open("GET", baseURL + "/kisisil" + paramString, true);
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
            alert(xmlHttp.responseText);
            kisileriYukle();
        }
    };
    xmlHttp.send();
}
