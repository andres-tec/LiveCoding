let lista = document.getElementById("lista");


let array = ['obeja', 'cochino', 'ardilla', 'melon'];

document.getElementById("word").addEventListener("change", function () {
    lista.innerHTML = '';
    var dato1 = document.getElementById("word").value;
    console.log(dato1);
    console.log(entrada(array, dato1));


})


function entrada(array, dato1) {
    let array2 = [];
    let cont = 0;
    console.log(array.length)
    console.log(array[0].length)
    console.log(dato1.length);

    for (let i = 0; i < array.length; i++) {
        if (array[i].length > dato1.length) {
            console.log("mayor")
            lista.innerHTML += `<li>${array[i]} </li>`
            cont++;

        }

    }


}

