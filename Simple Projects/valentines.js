window.onload = function () {
    backHearts(); // Generate hearts when the page loads

    let roho = document.getElementById("heart");
    if (roho) { 
        roho.addEventListener("click", heart);
    }
};

function backHearts(){
    let hearts = [];  // Create an array to track the position of hearts
    for (let i = 0; i <= 100; i++) {
        let moyo = document.createElement("div");
        moyo.classList.add("hearts");

        let top = Math.random() * window.innerHeight;
        let left = Math.random() * window.innerWidth;

        // Check if the new position overlaps any existing heart
        while (hearts.some(heart => {
            return Math.abs(top - heart.top) < 60 && Math.abs(left - heart.left) < 60; // Increase this value for larger gaps
        })) {
            top = Math.random() * window.innerHeight;
            left = Math.random() * window.innerWidth;
        }

        hearts.push({top, left});  // Store the new heart's position

        moyo.style.position = "absolute";
        moyo.style.top = top + "px";
        moyo.style.left = left + "px";

        document.body.appendChild(moyo);
    }
}
    //Use a counter to track how many times "No" has been clicked.
    let noCount = 0

    //store scale value 
    let yesScale = 1

function no(){
    //when you click the no button, the yes button should increase in size
    let noButt = document.getElementById("noButton")
    let yesButt = document.getElementById("yesButton")

    //Create an array of text messages for the "No" button.
    let noTexts = [
        "Say yes please😔",
        "Are you sure😅",
        "We wacha bana😔",
        "Pretty please😉",
        "Uko na jokes sasa",
        "So that's how it's gonna be?"
    ]

    //On each click
    //Update the text based on the counter.
    if (noCount < noTexts.length){
        noButt.textContent = noTexts[noCount]
        noCount++
        //Increase the "Yes" button size gradually.
        yesScale += 0.2
        yesButt.style.transform = `scale(${yesScale})`;
    }
    //Hide the "No" button after the last message.
    if(noCount >= noTexts.length){
        noButt.remove()
    }
}

function backHearts2(){
    let corazon = [];  // Create an array to track the position of hearts
    for (let i = 0; i <= 100; i++) {
        let moyo = document.createElement("div");
        moyo.classList.add("corazon");

        let top = Math.random() * window.innerHeight;
        let left = Math.random() * window.innerWidth;

        // Check if the new position overlaps any existing heart
        while (corazon.some(heart => {
            return Math.abs(top - heart.top) < 60 && Math.abs(left - heart.left) < 60; // Increase this value for larger gaps
        })) {
            top = Math.random() * window.innerHeight;
            left = Math.random() * window.innerWidth;
        }

        corazon.push({top, left});  // Store the new heart's position

        moyo.style.position = "absolute";
        moyo.style.top = top + "px";
        moyo.style.left = left + "px";

        // Make hearts visible by adding them to the body
        document.body.appendChild(moyo);
    }
}


function heart() {
    //roho is the main heart
    let roho = document.getElementById("heart")
    let letter = document.getElementById("note")

    if (roho && letter) {
        roho.style.display = "none" // Hide the heart
        letter.style.display = "block" // Show the letter
        backHearts2()
    }
}

//setInterval and setTimeout
//create a function which will type out the characters one at a time using the above methods
function type(){
    let paragraph = document.getElementById("Letter")
    let text = paragraph.textContent
    let i = 0
    let typeInterval = setInterval(() =>
    {
        if(text.length > 0){
            paragraph.textContent = text.slice(0, i+1)
            i++
        }
    },50);

    if(text.length === i){
        clearInterval(typeInterval)
    }
 }
type()