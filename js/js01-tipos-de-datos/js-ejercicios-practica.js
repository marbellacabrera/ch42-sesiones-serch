
const quieresSerMiUffasTruffas = (string) => {
    if (string === "NO") {
        console.log("¿Cómo que no?");
    } else if (string === "si" || string === "yes" || string === "SI") {
        console.log("Pellízcame estoy soñando, ¿En serio sí?");
    } else if (string === "No sé" || string === "mmmmm") {
        console.log("Dime que lo vas a pensar o lloro");
    } else {
        console.log("No entiendo lo que dices, ¿nos damos unos besos?");
    }
}